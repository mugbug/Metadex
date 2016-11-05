package model;

import java.awt.image.BufferedImage;

public class MetaHuman {
	private String name;
	private int id;
	private int age;
	private BufferedImage image;
	private Ability ability;
	private City homeTown;
	private String history;
	
	
	public MetaHuman(String name, int age, BufferedImage image, Ability ability, City homeTown, String history) {
		this.name = name;
		this.age = age;
		this.image = image;
		this.ability = ability;
		this.homeTown = homeTown;
		this.history = history;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Ability getHability() {
		return ability;
	}
	public void setHability(Ability ability) {
		this.ability = ability;
	}
	public City getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(City homeTown) {
		this.homeTown = homeTown;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	
}
