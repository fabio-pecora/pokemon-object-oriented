import java.util.*;
public abstract class Pokemon {
	protected int hitPoints, powerPoints, level;
	protected String name, type;
	
	// List of the attacks
	protected List<Attack> attacks;
	
	// Constructor
	public Pokemon(int hitPoints, int powerPoints, int level, String name, String type, List<Attack> attacks) {
		this.hitPoints = hitPoints;
		this.powerPoints = powerPoints;
		this.level = level;
		this.name = name;
		this.type = type;
		// initializing the arraylist with the attacks
		this.attacks = attacks;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHitPoints() {
		return hitPoints;
	}
	
	public int getPowerPoints() {
		return powerPoints;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}
	
	
	// Abstract methods
	public abstract void attack(Pokemon other, int attackIndex);
	public abstract void speak();
}