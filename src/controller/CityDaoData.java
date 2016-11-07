package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

import model.City;
import view.NotificationDialog;

public class CityDaoData implements CityDao{
	   List<City> cities;
	   
	   public CityDaoData() {
		   cities = new ArrayList<City>();
	   }
	   
	   @Override
	   public void addCity(City city){
		   cities.add(city);
		   try {
				String message = "Cidade cadastrada com sucesso!\n";
				message += "Nome: " + city.getName();
				NotificationDialog dialog = new NotificationDialog(2, message);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	   }
	   
	   @Override
	   public void deleteCity(City city) {
		  int index=0;
		  for(City c : cities){
			  if(city.getName().equals(c.getName())){
				  cities.remove(index);
				  try {
					  String message = "Cidade <"+c.getName()+">\nremovida!";
					  NotificationDialog dialog = new NotificationDialog(3, message);
					  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					  dialog.setVisible(true);
				  } catch (Exception e) {
					  e.printStackTrace();
				  }
				  return;
			  }
			  index++;
		  }
		  try {
			  String message = "Cidade não pôde ser\nremovida!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	   }

	   @Override
	   public List<City> getAllCities() {
	      return cities;
	   }

	   @Override
	   public City getCity(String name) {
		  for(City c : cities){
			  if(name.equals(c.getName())){
			      return c;
			  }
		  }
		  try {
			  String message = "Cidade não cadastrada!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  return null;
	   }

	   @Override
	   public void updateCity(City city) {
		   for(City c : cities){
			   if(city.equals(c)){
				   c.setName(city.getName());
				   c.setCountry(city.getCountry());
				   try {
					   String message = "Cidade foi atualizada!";
					   NotificationDialog dialog = new NotificationDialog(2, message);
					   dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					   dialog.setVisible(true);
				   } catch (Exception e) {
					   e.printStackTrace();
				   }
				   return;
			   }
		   }
	      
	   }

	@Override
	public String[] getNames() {
		List<String> nameList = new ArrayList<String>();
		nameList.add("");
		for(City c : cities){
			nameList.add(c.getName());
		}
		String[] names = new String[nameList.size()];
		return nameList.toArray(names);
	}
}
