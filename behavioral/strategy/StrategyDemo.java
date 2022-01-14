package behavioral.strategy;

import behavioral.strategy.abilities.flying.EagleLikeFlyingAbility;
import behavioral.strategy.abilities.flying.NoFlyingAbilty;
import behavioral.strategy.abilities.flying.SparrowLikeFlyingAbility;
import behavioral.strategy.entities.Cat;
import behavioral.strategy.entities.Sparrow;

/*
 * The nature decides to give animals the wonderful ability of flight. Now,
 * nature the great mathematician writes some awesome flying algorithms.
 * But, nature is now undecided which algorithm will suit which animal.
 * Thus, nature decides to use a strategy pattern. Using a strategy pattern,
 * nature could easily incorporate the behaviour (interface) of flight into
 * abstract animal class.
 * 
 * The concrete flying algorithms can now be changed accordingly.
 * 
 * Wow, how clever nature is. Incorporated flying in the evolution scenario
 * very efficiently.
 */
class StrategyDemo {

	public static void main(String[] args) {
		// Nature creates two new animals, gives sparrow the ability to fly.
		System.out.println("Nature provides birdy the ability to fly.");
		System.out.println("Nature doesn't give kitty the abilty to fly.");
		Cat kitty = new Cat("kitty", 6f, new NoFlyingAbilty());
		Sparrow birdy = new Sparrow("birdy", 0.3f,
				new SparrowLikeFlyingAbility());

		// Nature tests the flying abilities.
		System.out.println("\nNature asks kitty to fly.");
		kitty.getFlyingAbility().fly();
		System.out.println("\nNature asks birdy to fly.");
		birdy.getFlyingAbility().fly();

		// Nature feels sad that kitty cannot fly, gives it flying capabilities.
		System.out
				.println("\nNature gives kitty the power to fly like an eagle.");
		kitty.changeFlyingAbility(new EagleLikeFlyingAbility());

		// And now nature asks the kitty to spread its wings.
		System.out.println("\nNature asks the kitty to spread its wings.");
		kitty.getFlyingAbility().fly();
	}

}
