package static1;

public class Data3 {
    public String name;
    public static int count; //static インスタンスを通してアクセス可能。

    public Data3(String name) { //コンストラクタ
        this.name = name;
        count++;
    }
}