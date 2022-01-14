package behavioral.strategy.entities;

import behavioral.strategy.abilities.FlyingAbility;

public class Sparrow extends Animal {

	public Sparrow(String name, float weight, FlyingAbility flyingAbility) {
		super(name, weight, "chirp", flyingAbility);
	}

}
