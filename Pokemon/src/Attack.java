
public class Attack {
	protected String attackDescription;
	protected String type;
	protected int baseDamage = 0;
	protected int powerPointCost;
	protected String name;
	
	public Attack(String attackDescription, String type, int baseDamage, int powerPointCost, String name) {
		this.attackDescription = attackDescription;
		this.type = type;
		this.baseDamage = baseDamage;
		this.powerPointCost = powerPointCost;
		this.name = name;
	}
	
	// Accessor methods 
	public String getAttackDescription() {
		return attackDescription;
	}
	
	public void setAttackDescription(String attackDescription) {
		this.attackDescription = attackDescription;
	}
	
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	public int getPowerPointCost() {
		return powerPointCost;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getBaseDamage() {
		return baseDamage;
	}
	
}
