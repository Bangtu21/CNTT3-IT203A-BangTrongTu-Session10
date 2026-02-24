package ex05;

public class OfficeStaff extends Employee {
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public double calculateSalary() {
        return baseSalary;
    }
}
