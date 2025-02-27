package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++); //999로 참가하고 1000
        process(currentUserCount++); //1000로 참가하고 1001
        process(currentUserCount++); //1001로 대기하고 1002
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) { // 1000を定数にしたい！次のクラスでリファクタリングします。
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참가합니다.");
        }
    }
}
