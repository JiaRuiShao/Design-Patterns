package creational.abstractfactory.factories;

import creational.abstractfactory.entities.*;

public class WildAnimalFactory extends AbstractAnimalFactory {
    private final static WildAnimalFactory wildAnimalFactory = new WildAnimalFactory();

    private WildAnimalFactory() {
    }

    public static WildAnimalFactory getInstance() {
        return wildAnimalFactory;
    }

    @Override
    public Animal create(String animalName) {
        WildAnimal wild;
        switch (animalName.toLowerCase()) {
            case "duck" -> wild = new Duck();
            case "elephant" -> wild = new Elephant();
            default -> wild = null;
        }
        return wild;
    }
}
