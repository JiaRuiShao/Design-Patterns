package creational.abstractfactory.factories;

import creational.abstractfactory.entities.Animal;
import creational.abstractfactory.entities.Cat;
import creational.abstractfactory.entities.Dog;
import creational.abstractfactory.entities.PetAnimal;

public class PetAnimalFactory extends AbstractAnimalFactory {
    private final static PetAnimalFactory petAnimalFactory = new PetAnimalFactory();

    private PetAnimalFactory() {
    }

    public static PetAnimalFactory getInstance() {
        return petAnimalFactory;
    }

    @Override
    public Animal create(String animalName) {
        PetAnimal pet;
        switch (animalName.toLowerCase()) {
            case "cat" -> pet = new Cat();
            case "dog" -> pet = new Dog();
            default -> pet = null;
        }
        return pet;
    }
}
