package creational.factorymethod.entities;

public class Dog implements Pet {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}
