package model;



import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	@SuppressWarnings("unused")
	private List<String> contributions = new ArrayList<>();
	private int level = 1; //1-normal user/2-admin
	private ImageIcon image;
	
	public User(String name, String email, String password, ImageIcon image, int level) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.image = image;
		this.level = level;
	}
	
	public User(String email, String password){
		this.email = email;
		this.password = password;
	}
	
	public User(String password) {
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level; //1 ou 2
	}
	public ImageIcon getImage() {
		return image;
	}
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		if(this.email == null) this.email = " ";
		if(this.password == null) this.password = " ";
		if(this.level != 2) this.level = 1;
		if(this.name == null) this.name = " ";
		String user = this.name+"_"+this.password+"_"+Integer.toString(this.level)+"_"+this.email+"\n";
		return user;
	}
}
