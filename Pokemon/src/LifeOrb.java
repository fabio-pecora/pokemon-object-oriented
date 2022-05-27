
public class LifeOrb implements Item {
	public final int powerUp = 20;
	public Attack attack;
	
	public void use(Pokemon pokemon) {
		// increase the damage of all the attaks of the Pokemon
		for(int i = 0; i < pokemon.attacks.size(); i++) {
			attack = pokemon.attacks.get(i);
			attack.setBaseDamage(attack.getBaseDamage() + 20);
		}
		System.out.println(pokemon.getName() + "'s attacks got stronger!!");
	}
}
