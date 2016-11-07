package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import controller.UserDao;
import controller.UserDaoData;
import model.User;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame {

	public JFrame LoginFrame;
	private JPasswordField passwordField;
	private JTextField txtEmail;
	
//pega usuarios no banco
	private UserDao users = new UserDaoData();
	
	
	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
		importUsers();
	}
	private void importUsers(){
		User admin = new User("admin", "admin");//user default p/ teste
		users.addUser(admin);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginFrame = new JFrame();
		LoginFrame.setResizable(false);
		LoginFrame.setBackground(Color.WHITE);
		LoginFrame.setTitle("Metadex");
		LoginFrame.getContentPane().setBackground(Color.WHITE);
		LoginFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/view/img/favicon.png")));
		LoginFrame.setBounds(100, 100, 280, 350);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.getContentPane().setLayout(null);
		LoginFrame.setLocationRelativeTo(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.setIconTextGap(2);
		btnCadastrar.setBorder(null);
		btnCadastrar.setOpaque(false);
		btnCadastrar.setBounds(1, 297, 73, 18);
		LoginFrame.getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					NewUserFrame window = new NewUserFrame();
					window.NewUserFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(Color.LIGHT_GRAY);
		btnCadastrar.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		txtEmail.setBorder(null);
		txtEmail.setForeground(Color.DARK_GRAY);
		txtEmail.setToolTipText("");
		txtEmail.setBounds(80, 140, 154, 23);
		LoginFrame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		passwordField.setForeground(Color.DARK_GRAY);
		passwordField.setToolTipText("");
		passwordField.setBounds(80, 180, 154, 23);
		LoginFrame.getContentPane().add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBorder(null);
		btnEntrar.setBounds(41, 221, 199, 31);
		LoginFrame.getContentPane().add(btnEntrar);		
		
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				User user = new User(txtEmail.getText(), passwordField.getText());
				for(User expected : users.getAllUsers()){
					if(user.equals(expected)){
						if(user.getLevel() == 2){
							//menu admin
							try {
								MainMenuFrame window = new MainMenuFrame();
								window.MainMenuFrame.setTitle("Metadex (admin)");
								window.MainMenuFrame.setVisible(true);
								LoginFrame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						else if(user.getLevel() == 1){
							//menu normal user
							try {
								MainMenuFrame window = new MainMenuFrame();
								window.MainMenuFrame.setTitle("Metadex");
								window.MainMenuFrame.setVisible(true);
								LoginFrame.dispose();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
					else{
						try {
							String message = "Email ou senha inválidos!";
							NotificationDialog dialog = new NotificationDialog(3, message);
							dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
							dialog.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		btnEntrar.setForeground(Color.DARK_GRAY);
		btnEntrar.setBackground(Color.LIGHT_GRAY);
		btnEntrar.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
		
		LoginFrame.getRootPane().setDefaultButton(btnEntrar);
		
		JLabel label = new JLabel("");
		label.setBounds(-13, -2, 290, 327);
		label.setIcon(new ImageIcon(LoginFrame.class.getResource("/view/img/login.jpg")));
		LoginFrame.getContentPane().add(label);
		
		
	}
}
