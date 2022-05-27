import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {
	static public void main(String[] args) {
		int randomAttack, attacksLength, randomChoice;
		final int maxChoice = 3;
		// creating a list of attacks with 4 different attacks that every Pokemon will have.
		Attack waterAttack1 = new Attack("A bite made using sharp fangs. This may cause the opponent to flinch, and it might not attack.", "Normal", 40, 5, "Bite");
		Attack waterAttack2 = new Attack("The strongest Water-type attack. However, while it is powerful, it may miss the target.", "Water", 120, 10, "Hydro pump");
		Attack waterAttack3 = new Attack("The user attacks by swinging its tail as if it were a vicious wave in a raging storm.", "Water", 80, 7, "Aqua tail");
		Attack waterAttack4 = new Attack("	The user knocks away the target and drags out another Pokémon in its party. In the wild, the battle ends.", "Normal", 60, 9, "Dragon tail"); 
		ArrayList<Attack> waterAttacks = new ArrayList<Attack>(Arrays.asList(waterAttack1, waterAttack2, waterAttack3, waterAttack4));
		Attack fireAttacks1 = new Attack("Facade is An attack that is boosted if user is burned, poisoned, or paralyzed.", "Normal", 70, 5, "Facade");
		Attack fireAttacks2 = new Attack("Flamthrouwer is a powerful Fire-type attack. Has a one-in-ten chance of leaving the target with a damaging burn.", "Fire", 40, 9, "Flamethrower");
		Attack fireAttacks3 = new Attack("The user cloaks itself in fire and charges at the foe. The user sustains serious damage, too.", "Fire", 120, 8, "Flare Blitz");
		Attack fireAttacks4 = new Attack("Scratch is a normal-type attack. Sharp claws are used to inflict damage on the target.", "Normal", 120, 6, "Scratch"); 
		ArrayList<Attack> fireAttacks = new ArrayList<Attack>(Arrays.asList(fireAttacks1, fireAttacks2, fireAttacks3, fireAttacks4));
		attacksLength = waterAttacks.size();
		
		// instantiating two Pokemons (Infernape and Gyarados).
		FirePokemon infernape = new FirePokemon(100, 100, 3, "Infernape", "Fire", fireAttacks);
		WaterPokemon gyarados = new WaterPokemon(100, 100, 3, "Gyarados", "Water", waterAttacks);
		
		// instantiating two Items
		EnergyPowder energyPowder = new EnergyPowder();
		LifeOrb lifeOrb = new LifeOrb();
		
		// instantiating  two players
		Fabio fabio = new Fabio(infernape, energyPowder, "Fabio");
		Richard richard = new Richard(gyarados, lifeOrb, "Richard");
		
		// testing with a sample fight
		System.out.println("The fight will be between " + infernape.getName() + " and "+ gyarados.getName());
		System.out.println(infernape.getName() + " starts...");
		energyPowder.use(infernape);
		fabio.getPokemon().attack(gyarados, 1);
		fabio.run();
		// looping three times because we want the player to make three random choices 
		for (int i = 0; i < maxChoice; i++) {
			// getting a random number (0, 1 or 2) and base the three choices on the number generated
			randomChoice = (int)(Math.random() * maxChoice);
			if(randomChoice == 0) {
				// the player choose an attack randomly and plays the attack
				randomAttack = (int)(Math.random() * attacksLength);
				richard.getPokemon().attack(infernape, randomAttack);
			}
			// the player will run from the fight
			else if(randomChoice == 1) richard.run();
			// the player uses the item
			else lifeOrb.use(gyarados);
		}
	}
}
