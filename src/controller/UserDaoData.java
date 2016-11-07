package controller;

import model.User;
import view.NotificationDialog;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

public class UserDaoData implements UserDao{
	   List<User> users;
	   
	   public UserDaoData() {
		   users = new ArrayList<User>();
	   }
	   
	   @Override
	   public void addUser(User user){
		   users.add(user);
		   /*try {
				String message = "Usuario cadastrado com sucesso!\n";
				message += "Nome: " + user.getName();
				NotificationDialog dialog = new NotificationDialog(2, message);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
	   }
	   
	   @Override
	   public void deleteUser(User user) {
		   for(User u : users){
				  if(user.equals(u)){
					  users.remove(this);
					  return;
				  }
			  }
			  try {
				  String message = "Usuário não cadastrado!";
				  NotificationDialog dialog = new NotificationDialog(3, message);
				  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				  dialog.setVisible(true);
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
	   }

	   //retrive list of Users from the database
	   @Override
	   public List<User> getAllUsers() {
	      return users;
	   }

	   @Override
	   public User getUser(String name) {
		   for(User u : users){
				  if(name.equals(u.getName())){
				      return u;
				  }
			  }
			  try {
				  String message = "Usuário não cadastrado!";
				  NotificationDialog dialog = new NotificationDialog(3, message);
				  dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				  dialog.setVisible(true);
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
			  return null;
	   }

	   @Override
	   public void updateUser(User user) {
		   for(User u : users){
			   if(user.equals(u)){
				   //TODO UPDATE USER
			   }
		   }
	   }
	   
	   @Override
		public String[] getNames() {
			List<String> nameList = new ArrayList<String>();
			nameList.add("");
			for(User u : users){
				nameList.add(u.getName());
			}
			String[] names = new String[nameList.size()];
			return nameList.toArray(names);
		}
}
