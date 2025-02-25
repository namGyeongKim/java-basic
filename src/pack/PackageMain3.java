package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //importしてないので、パッケージ名を全部示す。　今の場合クラス名が同じくUserなため、importは一つだけ選べる。
    }
}
