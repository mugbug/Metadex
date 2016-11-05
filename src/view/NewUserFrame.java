package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Toolkit;

public class NewUserFrame {

	public JFrame NewUserFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		NewUserFrame = new JFrame();
		NewUserFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(NewUserFrame.class.getResource("/view/img/favicon.png")));
		NewUserFrame.setResizable(false);
		NewUserFrame.setBackground(Color.WHITE);
		NewUserFrame.setTitle("Metadex");
		NewUserFrame.getContentPane().setBackground(Color.WHITE);
		NewUserFrame.getContentPane().setLayout(null);
		NewUserFrame.setLocationRelativeTo(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textField.setBounds(133, 205, 142, 21);
		NewUserFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textField_1.setBounds(133, 239, 142, 21);
		NewUserFrame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textField_2.setBounds(133, 276, 142, 21);
		NewUserFrame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textField_3.setBounds(133, 325, 142, 21);
		NewUserFrame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JButton btnFoto = new JButton("Foto");
		btnFoto.setForeground(Color.DARK_GRAY);
		btnFoto.setBackground(Color.LIGHT_GRAY);
		btnFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File(System.getProperty("user.home")));
				//Handle open button action.
			    if (arg0.getSource() == btnFoto) {
			        int returnVal = fc.showOpenDialog(btnFoto);

			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            //This is where a real application would open the file.
			            btnFoto.setText("Foto: OK");
			        }
			   }
			}
		});
		btnFoto.setBounds(39, 356, 225, 28);
		NewUserFrame.getContentPane().add(btnFoto);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("voltar");
		btnNewButton.setPressedIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/arrow-left-edited.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginFrame window = new LoginFrame();
				window.LoginFrame.setVisible(true);
				NewUserFrame.dispose();
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(0, 0, 32, 32);
		NewUserFrame.getContentPane().add(btnNewButton);
		
		JButton btnSubmeter = new JButton("Submeter");
		btnSubmeter.setForeground(Color.DARK_GRAY);
		btnSubmeter.setBackground(Color.LIGHT_GRAY);
		btnSubmeter.setBounds(169, 406, 95, 29);
		NewUserFrame.getContentPane().add(btnSubmeter);
		
		NewUserFrame.getRootPane().setDefaultButton(btnSubmeter);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(NewUserFrame.class.getResource("/view/img/new_user.jpg")));
		label.setBounds(0, 0, 300, 452);
		NewUserFrame.getContentPane().add(label);
		NewUserFrame.setBounds(100, 100, 304, 479);
		NewUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
