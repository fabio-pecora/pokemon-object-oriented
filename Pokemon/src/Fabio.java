
public class Fabio extends Player {
	public String name;
	public Fabio(FirePokemon pokemon, Item item, String name) {
		super(pokemon, item);
		this.name = name;
	}
	
	public Pokemon getPokemon() {
		return pokemon;
	}

	public Item getItem() {
		return item;
	}

	public void run() {
		System.out.println(this.name + " chose to run!");
//		System.exit(0);
	}
}
