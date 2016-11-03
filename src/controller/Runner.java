package controller;

import view.LoginFrame;

public class Runner {
	
	public static void main(String[] args) {
		try{
			LoginFrame window = new LoginFrame();
			window.LoginFrame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
