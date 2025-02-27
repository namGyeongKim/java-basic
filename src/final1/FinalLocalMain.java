package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //最初の一度だけ値を与えらてる。
        //data = 20; //compile error

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20;

        method(10);
    }

    //final 매개변수(パラメータ）
    static void method(final int parameter) {
        //parameter = 20; //compile error
    }
}
