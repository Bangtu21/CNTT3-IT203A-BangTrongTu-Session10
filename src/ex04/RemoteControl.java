package ex04;

public interface RemoteControl {
    public void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}
