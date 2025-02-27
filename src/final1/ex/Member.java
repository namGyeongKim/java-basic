package final1.ex;

public class Member {

    private final String id; //fieldでもfinalはinitialize必
    private String name;

    public Member(String id, String name) {
        this.id = id; //最初の一回だけ。変更不可。
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; //compile error
        this.name = name;
    }

    public void print() {
        System.out.println("id: " + id + ", name: " + name);
    }


}
