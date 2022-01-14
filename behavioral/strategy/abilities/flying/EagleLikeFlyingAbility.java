package behavioral.strategy.abilities.flying;

import behavioral.strategy.abilities.FlyingAbility;

public class EagleLikeFlyingAbility implements FlyingAbility {

	@Override
	public void fly() {
		System.out.println("I fly just like an eagle.");
	}

}
