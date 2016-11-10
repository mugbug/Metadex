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
		   int index=0;
		   for(MetaHuman mh : metaHumans){
			  if(metaHuman.getName().equals(mh.getName())){
				  metaHumans.remove(index);
				  try {
					  String message = "Meta-humano '"+mh.getName()+"'\nremovido!";
					  NotificationDialog dialog = new NotificationDialog(2, message);
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
			  String message = "Meta-humano não pôde ser\nremovido!";
			  NotificationDialog dialog = new NotificationDialog(3, message);
			  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			  dialog.setVisible(true);
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
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
			   if(metaHuman.getName().equals(mh.getName())){
				   mh.setAge(metaHuman.getAge());
				   mh.setHomeTown(metaHuman.getHomeTown());
				   mh.setAbility(metaHuman.getAbility());
				   mh.setHistory(metaHuman.getHistory());
				   mh.setImage(metaHuman.getImage());
				   try {
					   String message = "Meta-humano foi atualizado!";
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
		nameList.add(" ");
		for(MetaHuman mh : metaHumans){
			nameList.add(mh.getName());
		}
		String[] names = new String[nameList.size()];
		return nameList.toArray(names);
	}
}
