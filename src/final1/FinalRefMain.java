package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data(); //宣言しながら参照値を与えたので変更不可。以下同文。
        //data = new Data(); //dataはfianlなので変更不可。compile error

        //참조 대상의 값은 변경 가능 参照の対象の値は変更可能。
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
