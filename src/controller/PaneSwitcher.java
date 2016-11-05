package controller;

import java.awt.CardLayout;

import javax.swing.JPanel;

public abstract class PaneSwitcher {
	
	public void showMainMenu(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "MainMenu");
	}

	public void showNewMH(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "NewMH");
	}

	public void showNewCity(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "NewCity");
	}

	public void showNewAbility(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "NewAbility");
	}

	public void showViewMH(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ViewMH");
	}

	public void showViewCity(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ViewCity");
	}

	public void showViewAbility(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ViewAbility");
	}

	public void showEditMH(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "EditMH");
	}

	public void showEditCity(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "EditCity");
	}

	public void showEditAbility(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "EditAbility");
	}

	public void showProfile(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "Profile");
	}

	public void showViewUsers(JPanel contentPane){
		CardLayout cardLayout = (CardLayout) contentPane.getLayout();
		cardLayout.show(contentPane, "ViewUsers");
	}

}
