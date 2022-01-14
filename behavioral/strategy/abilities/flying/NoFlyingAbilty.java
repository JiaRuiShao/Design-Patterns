package behavioral.strategy.abilities.flying;

import behavioral.strategy.abilities.FlyingAbility;

public class NoFlyingAbilty implements FlyingAbility {

	@Override
	public void fly() {
		System.out.println("Sry. I cannot fly. :-(");
	}

}
