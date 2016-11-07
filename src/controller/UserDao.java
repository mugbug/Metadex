package controller;

import java.util.List;

import model.User;

public interface UserDao {
	public List<User> getAllUsers();
	public User getUser(int id);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
}
