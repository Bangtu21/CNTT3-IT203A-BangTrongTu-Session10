package ex02;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BWM");
        Vehicle bicycle = new Bicycle("Moutain");

        car.move();
        bicycle.move();
    }
}
