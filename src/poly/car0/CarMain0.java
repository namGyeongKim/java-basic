package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //null로한 이유는
        driver.setModel3Car(model3Car);
        driver.drive(); //drive가 같은 이름이고, set~Kar가 null인 경우 실행이 안 되고, esle if로 구분되어있는 상황에 k3가 우선이라서.
    }
}
