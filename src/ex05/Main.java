package ex05;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Bàng Trọng Tú", 5000000);
        Employee manager = new Manager("Nguyễn Văn Anh", 7000000, 500000);

        System.out.println("Bảng Lương");
        System.out.println("----------------------");
        System.out.println("Tên: " + staff.name);
        System.out.println("Lương cuối: " + staff.calculateSalary());
        System.out.println("----------------------");

        System.out.println("Tên: " + manager.name);
        System.out.println("Lương cuối: " + manager.calculateSalary());
    }
}
