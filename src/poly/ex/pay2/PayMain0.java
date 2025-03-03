package poly.ex.pay2;

public class PayMain0 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        //kakao 결제
        String option = "kakao";
        int amount = 5000;
        payService.processPay(option, amount);

        //naver 결제
        option = "naver";
        amount = 10000;
        payService.processPay(option, amount);

        option = "ha";
        amount = 0;
        payService.processPay(option,amount);
    }
}
