package ex01;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.printf("Hình tròn:\n");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        Shape rectangle = new Rectangle(6, 7);
        System.out.printf("Hình Chữ Nhật:\n");
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}
