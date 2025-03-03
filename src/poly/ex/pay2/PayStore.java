package poly.ex.pay2;

public class PayStore {
    String option;

    PayStore(String option) {
        this.option = option;
    }

    public Pay whichPay() {
        if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("kakao")) {
            return new KakaoPay();
        } else {
            return new DefaultPay();
        }
    }
}
