package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    static String getName(Item item) {
        return item.name;
    }

    static int getTotalAmount(Item item) {
        return item.price * item.quantity;
    }
}
