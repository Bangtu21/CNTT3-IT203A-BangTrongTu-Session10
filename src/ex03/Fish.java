package ex03;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    public void swim() {
        System.out.println(name + "Bơi");
    }
}
