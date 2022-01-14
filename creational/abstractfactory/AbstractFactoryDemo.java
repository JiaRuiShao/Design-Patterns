package creational.abstractfactory;

import creational.abstractfactory.entities.Animal;
import creational.abstractfactory.factories.AbstractAnimalFactory;
import creational.abstractfactory.factories.PetAnimalFactory;
import creational.abstractfactory.factories.WildAnimalFactory;

enum AnimalType {
    PET, WILD;
}

public class AbstractFactoryDemo {
    AnimalType animalType;
    AbstractAnimalFactory aaf;

    public AbstractFactoryDemo() {
        animalType = null;
        aaf = null;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
        switch (animalType) {
            case PET -> aaf = PetAnimalFactory.getInstance();
            case WILD -> aaf = WildAnimalFactory.getInstance();
        }
    }

    public AbstractAnimalFactory getAnimalFactory() {
        return aaf;
    }

    public static void main(String[] args) {

        AbstractFactoryDemo wildDemo = new AbstractFactoryDemo();
        wildDemo.setAnimalType(AnimalType.WILD);
        AbstractAnimalFactory wildAnimalFactory = wildDemo.getAnimalFactory();

        Animal elephant = wildAnimalFactory.create("elephant");
        Animal duck = wildAnimalFactory.create("duck");

        System.out.printf("%s ", elephant.getName());
        elephant.makeSound();
        System.out.printf("%s ", duck.getName());
        duck.makeSound();

        AbstractFactoryDemo petDemo = new AbstractFactoryDemo();
        petDemo.setAnimalType(AnimalType.PET);
        AbstractAnimalFactory petAnimalFactory = petDemo.getAnimalFactory();

        Animal cat = petAnimalFactory.create("cat");
        Animal dog = petAnimalFactory.create("dog");

        System.out.printf("%s ", cat.getName());
        cat.makeSound();
        System.out.printf("%s ", dog.getName());
        dog.makeSound();
    }
}
