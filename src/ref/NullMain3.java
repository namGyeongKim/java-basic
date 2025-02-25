package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        
        //NullPointerException
        //bigData.data.valueの場合、dataはnullなので住所がなくてNullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
