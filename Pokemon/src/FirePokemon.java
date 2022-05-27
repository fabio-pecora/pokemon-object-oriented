import java.util.ArrayList;

public class FirePokemon extends Pokemon {
	protected Attack chosenAttack;
	
	// Constructor
	public FirePokemon(int hitPoints, int powerPoints, int level, String name, String type, ArrayList<Attack> attacks) {
		super(hitPoints, powerPoints, level, name, type, attacks);
		// creating all the attacks that we will add to our list
	}

	// creating the attack
	public void attack(Pokemon other, int attackIndex) {
		// Use the attack that the user just chose
		chosenAttack = attacks.get(attackIndex);
		// if the pokemon has enough power point to play the attack
		if(this.getPowerPoints() >= chosenAttack.getPowerPointCost()) {
			// displaying who's attacking who, and with which attack
			System.out.println(this.getName() + " uses " + chosenAttack.getName() + " against " +  other.getName());
			// printing the description
			System.out.println(chosenAttack.getAttackDescription());
			if(chosenAttack.getType() == "Fire" && (other.getType() == "Water") || (other.getType() == "Rock")) {
				// setting the damage to half of its value because they are not very effective
				System.out.println("The attack is not very effective");
				chosenAttack.setBaseDamage(chosenAttack.getBaseDamage() /2);
				// decreasing the power point of the pokemon with the cost of the attack
			}
			else if((chosenAttack.getType() == "Fire") && ((other.getType() == "Ice") ||(other.getType() == "Grass") || (other.getType() == "Bug"))){
				// setting the damage to the double of its value because it is super effective
				chosenAttack.setBaseDamage(chosenAttack.getBaseDamage() * 2);
				System.out.println("Wow!!! The attack is super effective.");
				// decreasing the power point of the pokemon with the cost of the attack
			}
			else{
				// leaving the damage how it is
				System.out.println("normal effect");
				chosenAttack.setBaseDamage(chosenAttack.getBaseDamage());
				// decreasing the power point of the pokemon with the cost of the attack
			}
			// decrease the power points of the attack cost
			this.setPowerPoints(this.getPowerPoints() - chosenAttack.getPowerPointCost());
			// decreasing the health of the attacked Pokemon
			System.out.println(other.getName() + " looses " + chosenAttack.getBaseDamage() + "hp");
			other.hitPoints -= chosenAttack.getBaseDamage();
		}
		else System.out.println("Your Pokemon needs to rest, not enoight power points");
	}

	public void speak() {
		System.out.println("huga-huga");
	}

}
