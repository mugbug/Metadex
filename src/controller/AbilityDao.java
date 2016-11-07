package controller;

import java.util.List;

import model.Ability;

public interface AbilityDao {
	public List<Ability> getAllAbilities();
	void addAbility(Ability ability);
	public Ability getAbility(String name);
	public void updateAbility(Ability ability);
	public void deleteAbility(Ability ability);
	public String[] getNames();
}
