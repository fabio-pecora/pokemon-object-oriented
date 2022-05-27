
public abstract class Player {
	protected Pokemon pokemon;
	protected Item item;
	
	public Player(Pokemon pokemon, Item item) {
		setPokemon(pokemon);
		setItem(item);
	}
	// setters used for the constructor
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	// abstract methods 
	public abstract Pokemon getPokemon();
	public abstract Item getItem();
	public abstract void run();
}
