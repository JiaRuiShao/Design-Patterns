package creational.abstractfactory.entities;

public class Dog extends PetAnimal {
    public Dog() {
        this.setName("dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
