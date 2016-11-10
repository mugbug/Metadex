package controller;

import java.util.List;

import model.User;

public interface UserDao {
	public List<User> getAllUsers();
	public User getUser(String userName);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	String[] getNames();
	String[] getEmails();
}
