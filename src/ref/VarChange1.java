package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a変更
        a = 20;
        System.out.println("変更a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b変更
        System.out.println("変更b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
