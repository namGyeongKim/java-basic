package access.a;
//一つのクラスに多数のclass生成。
public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

    //アクセスレベルdefaultは無限に作られる。publicは一つだけ。
class DefaultClass1 {
}

class DefaultClass2 {
}
