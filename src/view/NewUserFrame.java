package view;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.filechooser.FileNameExtensionFilter;

import controller.UserDao;
import controller.UserDaoData;
import model.User;

import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class NewUserFrame {

	public JFrame NewUserFrame;
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JPasswordField textFieldSenha_1;
	private JPasswordField textFieldSenha_2;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUserFrame window = new NewUserFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public NewUserFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon icon = new ImageIcon();
		
		NewUserFrame = new JFrame();
		NewUserFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(NewUserFrame.class.getResource("/view/img/favicon.png")));
		NewUserFrame.setResizable(false);
		NewUserFrame.setBackground(Color.WHITE);
		NewUserFrame.setTitle("Metadex");
		NewUserFrame.getContentPane().setBackground(Color.WHITE);
		NewUserFrame.getContentPane().setLayout(null);
		NewUserFrame.setLocationRelativeTo(null);
		NewUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldNome.setBounds(133, 205, 142, 21);
		NewUserFrame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldEmail.setBounds(133, 239, 142, 21);
		NewUserFrame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		
		textFieldSenha_1 = new JPasswordField();
		textFieldSenha_1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldSenha_1.setBounds(133, 276, 142, 21);
		NewUserFrame.getContentPane().add(textFieldSenha_1);
		textFieldSenha_1.setColumns(10);
		
		textFieldSenha_2 = new JPasswordField();
		textFieldSenha_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldSenha_2.setBounds(133, 325, 142, 21);
		NewUserFrame.getContentPane().add(textFieldSenha_2);
		textFieldSenha_2.setColumns(10);
		
		JButton btnFoto = new JButton("Foto");
		btnFoto.setForeground(Color.DARK_GRAY);
		btnFoto.setBackground(Color.LIGHT_GRAY);
		btnFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"Image Files", "jpg", "png", "gif", "jpeg");
				JFileChooser fc = new JFileChooser();
				fc.setFileFilter(filter);
				fc.setCurrentDirectory(new File(System.getProperty("user.home") 
						+ System.getProperty("file.separator")+ "Desktop" 
						+ System.getProperty("file.separator")+ "metadex_fotos"));
				//Handle open button action.
			    if (arg0.getSource() == btnFoto) {
			        int returnVal = fc.showOpenDialog(btnFoto);

			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            //This is where a real application would open the file.
			            btnFoto.setText(fc.getName(file)); //altera nome do botao para nome do arquivo
			            BufferedImage img = null;
			            try {
			                img = ImageIO.read(file);
			            } catch (IOException e) {
			            }
			            icon.setImage(img);
			        }
			   }
			   /*ImageOpener io = null;
			   icon.setImage(io.getImage(arg0, btnFoto));*/
			}
		});
		btnFoto.setBounds(39, 356, 225, 28);
		NewUserFrame.getContentPane().add(btnFoto);
		
		JButton btnBack = new JButton("");
		btnBack.setToolTipText("voltar");
		btnBack.setPressedIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewUserFrame.dispose();
			}
		});
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.setBounds(0, 0, 32, 32);
		NewUserFrame.getContentPane().add(btnBack);
		
		JButton btnSubmit = new JButton("Submeter");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textFieldNome.getText();
				String email = textFieldEmail.getText();
				@SuppressWarnings("deprecation")
				String password_1 = textFieldSenha_1.getText();
				@SuppressWarnings("deprecation")
				String password_2 = textFieldSenha_2.getText();
				if(password_1.equals(password_2)){
					int id = 0;//pegar do db
					User user = new User(id, name, email, password_1, icon, 1);
					UserDao newUser = new UserDaoData();
					NewUserFrame.dispose();
					newUser.addUser(user);
				}
				else {
					String message = "As senhas digitadas não são iguais,\ntente novamente.";
					NotificationDialog dialog = new NotificationDialog(3, message);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				
			}
		});
		btnSubmit.setForeground(Color.DARK_GRAY);
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(169, 406, 95, 29);
		NewUserFrame.getContentPane().add(btnSubmit);
		
		NewUserFrame.getRootPane().setDefaultButton(btnSubmit);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/new_user.jpg")));
		label.setBounds(0, 0, 300, 452);
		NewUserFrame.getContentPane().add(label);
		NewUserFrame.setBounds(100, 100, 304, 479);
		NewUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	}
}
