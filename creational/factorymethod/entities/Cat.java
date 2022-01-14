package creational.factorymethod.entities;

public class Cat implements Pet {
    @Override
    public void sound() {
        System.out.println("Meow~");
    }
}
