package model;

public class Ability {
	private String name;
	private String description;
	
	public Ability(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		if(this.name == null) this.name = " ";
		if(this.description == null) this.description = " ";
		String data = this.name+"_"+this.description+"\n";
		return data;
	}
}
