package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //追加
    MemberConstruct(String name, int age) {
        /*this.name = name;
        this.age = age;
        this.grade = 50; //成績の入力がない場合基本５０点。*/
        this(name, age, 50);//変更
        //this()は生成者の内部で自分の生成者を呼び出せる。
    }


    //생성자名はクラス名と同じだ。
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
