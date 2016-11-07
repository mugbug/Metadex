package controller;

import model.User;
import view.NotificationDialog;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

public class UserDaoData implements UserDao{
	//list is working as a database
	   List<User> users;
	   /*
	   public UserDaoImpl(User user){
	      users = new ArrayList<User>();
	      users.add(user);
	   }*/
	   
	   public UserDaoData() {
		   users = new ArrayList<User>();
	   }
	   
	   @Override
	   public void addUser(User user){
		   users.add(user);
		   try {
				String message = "Usuario cadastrado com sucesso!\n";
				message += "Nome: " + user.getName();
				NotificationDialog dialog = new NotificationDialog(2, message);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
	   }
	   
	   @Override
	   public void deleteUser(User User) {
	      users.remove(User.getId());
	      //System.out.println("User: Roll No " + User.getId() + ", deleted from database");
	   }

	   //retrive list of Users from the database
	   @Override
	   public List<User> getAllUsers() {
	      return users;
	   }

	   @Override
	   public User getUser(int id) {
	      return users.get(id);
	   }

	   @Override
	   public void updateUser(User User) {
	      users.get(User.getId()).setName(User.getName());
	      //System.out.println("User: Roll No " + User.getId() + ", updated in the database");
	   }
}
