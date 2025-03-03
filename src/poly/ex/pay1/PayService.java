package poly.ex.pay1;

public class PayService {
    public void processPay(Pay pay, String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        payResult(tryPay(pay, amount));
    }

    public boolean tryPay(Pay pay, int amount) {
        boolean result;
        if (pay != null) {
            result = pay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        return result;
    }

    public void payResult(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
