package controller;

import model.MetaHuman;
import view.NotificationDialog;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

public class MetaHumanDaoData implements MetaHumanDao{
	//list is working as a database
	   List<MetaHuman> metaHumans;
	   /*
	   public MetaHumanDaoImpl(MetaHuman MetaHuman){
	      metaHumans = new ArrayList<MetaHuman>();
	      metaHumans.add(MetaHuman);
	   }*/
	   
	   public MetaHumanDaoData() {
		   metaHumans = new ArrayList<MetaHuman>();
	   }
	   
	   @Override
	   public void addMetaHuman(MetaHuman metaHuman){
		   metaHumans.add(metaHuman);
		   try {
				String message = "Meta-humano cadastrado com\nsucesso!\n";
				message += "Nome: " + metaHuman.getName();
				NotificationDialog dialog = new NotificationDialog(2, message);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	   }
	   
	   @Override
	   public void deleteMetaHuman(MetaHuman metaHuman) {
		   for(MetaHuman mh : metaHumans){
			  if(metaHuman.equals(mh)){
				  metaHumans.remove(this);
				  return;
			  }
		  }
		  try {
			  String message = "Meta-humano não cadastrado!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	      //System.out.println("MetaHuman: Roll No " + MetaHuman.getId() + ", deleted from database");
	   }

	   //retrive list of metaHumans from the database
	   @Override
	   public List<MetaHuman> getAllmetaHumans() {
	      return metaHumans;
	   }

	   @Override
	   public MetaHuman getMetaHuman(String name) {
		  for(MetaHuman mh : metaHumans){
			  if(name.equals(mh.getName())){
			      return mh;
			  }
		  }
		  try {
			   String message = "Meta-humano não cadastrado!";
			   NotificationDialog dialog = new NotificationDialog(3, message);
			   dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			   dialog.setVisible(true);
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
		  return null;
	   }

	   @Override
	   public void updateMetaHuman(MetaHuman metaHuman) {
		   for(MetaHuman mh : metaHumans){
			   if(metaHuman.equals(mh)){
				   metaHumans.remove(this);
				   metaHumans.add(metaHuman);
			   }
		   }
		   try {
			   String message = "Meta-humano não cadastrado!";
			   NotificationDialog dialog = new NotificationDialog(3, message);
			   dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			   dialog.setVisible(true);
		   } catch (Exception e) {
			   e.printStackTrace();
		   }
	      //System.out.println("MetaHuman: Roll No " + MetaHuman.getId() + ", updated in the database");
	   }

	@Override
	public String[] getNames() {
		List<String> nameList = new ArrayList<String>();
		nameList.add("");
		for(MetaHuman mh : metaHumans){
			nameList.add(mh.getName());
		}
		String[] names = new String[nameList.size()];
		return nameList.toArray(names);
	}
}
