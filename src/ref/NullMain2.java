package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생 //インスタンスではないので示す住所がない。
        System.out.println("data = " + data.value);
    }
}
