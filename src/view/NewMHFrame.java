package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class NewMHFrame {

	public JFrame NewMHFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMHFrame window = new NewMHFrame();
					window.NewMHFrame.setVisible(true);
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
	public NewMHFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		NewMHFrame = new JFrame();
		NewMHFrame.setBackground(Color.WHITE);
		NewMHFrame.setResizable(false);
		NewMHFrame.setTitle("Metadex");
		NewMHFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(NewMHFrame.class.getResource("/view/img/favicon.png")));
		NewMHFrame.setBounds(100, 100, 305, 481);
		NewMHFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		NewMHFrame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textField.setBounds(137, 202, 137, 20);
		NewMHFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textField_1.setBounds(137, 227, 137, 20);
		NewMHFrame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textField_2.setBounds(137, 252, 137, 20);
		NewMHFrame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Foto");
		btnNewButton.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 402, 105, 34);
		NewMHFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("voltar");
		btnNewButton_1.setPressedIcon(new ImageIcon(NewMHFrame.class.getResource("/view/img/arrow-left-edited.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminMenuFrame window = new AdminMenuFrame();
				window.AdminMenuFrame.setVisible(true);
				NewMHFrame.dispose();
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon(NewMHFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnNewButton_1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(0, 0, 32, 32);
		NewMHFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cadastrar");
		btnNewButton_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(163, 403, 105, 33);
		NewMHFrame.getContentPane().add(btnNewButton_2);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setBackground(Color.WHITE);
		textArea.setTabSize(2);
		textArea.setLineWrap(true);
		textArea.setForeground(Color.DARK_GRAY);
		textArea.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textArea.setBorder(new LineBorder(new Color(192, 192, 192)));
		textArea.setCaretColor(Color.DARK_GRAY);
		textArea.setBounds(22, 324, 252, 65);
		NewMHFrame.getContentPane().add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Baependi", "Caxambu", "Dakota", "Santa Rita"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBox.setBounds(137, 278, 137, 20);
		NewMHFrame.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(NewMHFrame.class.getResource("/view/img/new-mh.jpg")));
		label.setBackground(Color.WHITE);
		label.setBounds(0, 0, 300, 452);
		NewMHFrame.getContentPane().add(label);
	}
}
