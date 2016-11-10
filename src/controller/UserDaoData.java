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
	   }
	   
	   @Override
	   public void deleteUser(User user) {
		   int index=0;
		   for(User u : users){
			  if(user.getName().equals(u.getName())){
				  users.remove(index);
				  try {
					  String message = "Usuário '"+u.getName()+"' removido!";
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
			  String message = "Usuário não pôde ser\nremovido!";
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
				   u.setName(user.getName());
				   u.setEmail(u.getEmail());
				   u.setLevel(u.getLevel());
				   u.setPassword(u.getPassword());
				   u.setImage(u.getImage());
				   try {
					   String message = "Usuário foi atualizado!";
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
			for(User u : users){
				nameList.add(u.getName());
			}
			String[] names = new String[nameList.size()];
			return nameList.toArray(names);
		}
	   
	   @Override
		public String[] getEmails() {
			List<String> emailList = new ArrayList<String>();
			emailList.add("");
			for(User u : users){
				emailList.add(u.getEmail());
			}
			String[] emails = new String[emailList.size()];
			return emailList.toArray(emails);
		}
}
