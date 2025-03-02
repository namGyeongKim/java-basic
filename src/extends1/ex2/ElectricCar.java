package extends1.ex2;

//extends = 확장 = 拡張（かくちょう）

public class ElectricCar extends Car {
//extendsのおかげで、Carの機能（move)も使える。
    public void charge() {
        System.out.println("충전합니다.");
    }
}
