package poly.ex5;

public class AbstractMain {
    public static void main(String[] args) {

        //인터페이스 생성 불가
        //InterfaceAnimal interfaceMain1 = new InterfaceAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
