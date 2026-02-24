package ex03;

public class Duck extends Animal implements Swimmable, Flyable {
    public Duck(String name) {
        super(name);
    };

    public void swim(){
        System.out.println(name + "Bơi");
    }
    public void fly(){
        System.out.println(name + "Bay");
    }
}
