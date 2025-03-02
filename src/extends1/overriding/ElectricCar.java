package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("電気自動車で速く移動します。");
    }

    public void charge() {
        System.out.println("充電します。");
    }

}
