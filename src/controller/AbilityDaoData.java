package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

import model.Ability;
import view.NotificationDialog;

public class AbilityDaoData implements AbilityDao{
		List<Ability> abilities;
	   
	   public AbilityDaoData() {
		   abilities = new ArrayList<Ability>();
	   }
	   
	   @Override
	   public void addAbility(Ability ability){
		   abilities.add(ability);
		   try {
				String message = "Habilidade cadastrada com sucesso!\n";
				message += "Nome: " + ability.getName();
				NotificationDialog dialog = new NotificationDialog(2, message);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	   }
	   
	   @Override
	   public void deleteAbility(Ability ability) {
		  for(Ability a : abilities){
			  if(ability.equals(a)){
				  abilities.remove(this);
				  return;
			  }
		  }
		  try {
			  String message = "Habilidade não cadastrada!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	   }

	   @Override
	   public List<Ability> getAllAbilities() {
	      return abilities;
	   }

	   @Override
	   public Ability getAbility(String name) {
		  for(Ability a : abilities){
			  if(name.equals(a.getName())){
			      return a;
			  }
		  }
		  try {
			  String message = "Habilidade não cadastrada!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  return null;
	   }

	   @Override
	   public void updateAbility(Ability ability) {
		   for(Ability a : abilities){
			   if(ability.equals(a)){
				   abilities.remove(this);
				   abilities.add(ability);
			   }
		   }
	      
	   }

	@Override
	public String[] getNames() {
		List<String> nameList = new ArrayList<String>();
		nameList.add("");
		for(Ability a : abilities){
			nameList.add(a.getName());
		}
		String[] names = new String[nameList.size()];
		return nameList.toArray(names);
	}
}
