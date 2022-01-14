package creational.abstractfactory.entities;

public class Duck extends WildAnimal {
    public Duck() {
        this.setName("duck");
    }

    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }
}
