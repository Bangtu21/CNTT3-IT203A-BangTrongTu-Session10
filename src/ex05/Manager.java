package ex05;

public class Manager extends Employee implements BonusCalculator{
    public double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}
