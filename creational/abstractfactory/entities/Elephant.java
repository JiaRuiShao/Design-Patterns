package creational.abstractfactory.entities;

public class Elephant extends WildAnimal {
    public Elephant() {
        this.setName("elephant");
    }

    @Override
    public void makeSound() {
        System.out.println("trumpet!");
    }
}
