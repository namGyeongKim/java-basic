package poly.ex.pay2;

public class PayService {
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        PayStore payStore = new PayStore(option);
        Pay paying = payStore.whichPay();
        boolean result = paying.pay(amount);
        payResult(result);
    }

    public void payResult(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
