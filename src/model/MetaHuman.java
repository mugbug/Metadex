package model;


import javax.swing.ImageIcon;

public class MetaHuman {
	private String name;
	private int id;
	private String age;
	private ImageIcon image;
	private String ability;
	private String homeTown;
	private String history;
	
	
	public MetaHuman(String name, String age, ImageIcon image, String ability, String homeTown, String history) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAbility() {
		return ability;
	}
	public void setAbility(String ability) {
		this.ability = ability;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public ImageIcon getImage() {
		return image;
	}
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
	
}
