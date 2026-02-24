package ex02;

public class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println(brand + "- Di chuyển bằng sức người");
    }
}
