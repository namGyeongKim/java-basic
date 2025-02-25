package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrder = scannerProduct(count);

        printOrders(productOrder);

        printTotal(productOrder);
    }

    static ProductOrder[] scannerProduct(int count) {
        Scanner scanner = new Scanner(System.in);
        ProductOrder[] productOrder = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            productOrder[i] = new ProductOrder();
            System.out.print("상품명: ");
            productOrder[i].productName = scanner.nextLine();

            System.out.print("가격: ");
            productOrder[i].price = scanner.nextInt();

            System.out.print("수량: ");
            productOrder[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static void printTotal(ProductOrder[] orders) {
        int total = 0;

        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + total);
    }
}
