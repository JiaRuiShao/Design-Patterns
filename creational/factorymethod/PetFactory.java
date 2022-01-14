package creational.factorymethod;
import creational.factorymethod.entities.Cat;
import creational.factorymethod.entities.Dog;
import creational.factorymethod.entities.Pet;

class PetFactory {
    private final static PetFactory petFactory = new PetFactory();

    private PetFactory() {
    }

    public static PetFactory getInstance() {
        return petFactory;
    }

    public Pet create(String petType) {
        Pet pet;
        switch (petType.toLowerCase()) {
            case "cat" -> pet = new Cat();
            case "dog" -> pet = new Dog();
            default -> pet = null;
        }
        return pet;
    }

}
