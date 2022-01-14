package creational.abstractfactory.entities;

public class Cat extends PetAnimal {
    public Cat() {
        this.setName("cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow~");
    }
}
