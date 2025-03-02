package extends1.ex3;

public class ElectricCar extends Car {
//extends(拡張（かくちょう））のおかげでCarの機能（move, openDoor)も使える。
    public void charge() {
        System.out.println("충전합니다.");
    }
}
