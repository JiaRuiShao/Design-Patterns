package creational.abstractfactory.factories;

import creational.abstractfactory.entities.Animal;

public abstract class AbstractAnimalFactory {

    public abstract Animal create(String animalName);

    public Animal getAnimal(String animalName) {
        return create(animalName);
    }
}
