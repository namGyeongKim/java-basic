package poly.ex.pay4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();
            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                int amount = checkAmount();
                payService.processPay(option, amount);
            }
        }
    }


    public static int checkAmount() {
        Scanner scanner = new Scanner(System.in);

        int amount;

        while (true) {
            try {
                System.out.print("결제 금액을 입력하세요: ");
                amount = scanner.nextInt();
                return amount;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요");
                scanner.nextLine();
            }
        }
    }
}
