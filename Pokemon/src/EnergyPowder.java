
public class EnergyPowder implements Item{
	public final int powerUp = 20;
	public void use(Pokemon pokemon) {
		// increase the hit points of the Pokemon
		pokemon.setHitPoints(pokemon.getHitPoints() + powerUp);
		System.out.println(pokemon.getName() + "'s life increases of " + powerUp + "hp");
	}
}
