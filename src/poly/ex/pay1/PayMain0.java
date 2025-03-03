package poly.ex.pay1;

public class PayMain0 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        //kakao 결제
        Pay pay = new KakaoPay();
        String option = "kakao";
        int amount = 5000;
        payService.processPay(pay, option, amount);

        //naver 결제
        pay = new NaverPay();
        option = "naver";
        amount = 10000;
        payService.processPay(pay, option, amount);
    }
}
