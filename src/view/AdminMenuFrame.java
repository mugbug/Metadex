package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.ComponentOrientation;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMenuFrame {

	public JFrame AdminMenuFrame;

	/**
	 * Launch the application.
	 * 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenuFrame window = new AdminMenuFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public AdminMenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminMenuFrame = new JFrame();
		AdminMenuFrame.setBackground(Color.WHITE);
		AdminMenuFrame.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		AdminMenuFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(AdminMenuFrame.class.getResource("/view/img/favicon.png")));
		AdminMenuFrame.setResizable(false);
		AdminMenuFrame.setTitle("Metadex (admin)");
		AdminMenuFrame.setBounds(100, 100, 590, 390);
		AdminMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminMenuFrame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setBounds(0, 0, 584, 27);
		AdminMenuFrame.getContentPane().add(menuBar);
		
		JMenu mnOpes = new JMenu("Arquivo");
		mnOpes.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.add(mnOpes);
		
		JMenuItem mntmAjuda = new JMenuItem("Deslogar");
		mntmAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginFrame window = new LoginFrame();
				window.LoginFrame.setVisible(true);
				AdminMenuFrame.dispose();
			}
		});
		mntmAjuda.setBorder(new EmptyBorder(2, 6, 2, 2));
		mntmAjuda.setBackground(Color.WHITE);
		mntmAjuda.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		mnOpes.add(mntmAjuda);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setBorder(new EmptyBorder(2, 6, 2, 2));
		mntmSair.setBackground(Color.WHITE);
		mntmSair.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		mnOpes.add(mntmSair);
		
		JMenu mnGerenciarUsurios = new JMenu("Gerenciar usu\u00E1rios");
		mnGerenciarUsurios.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.add(mnGerenciarUsurios);
		
		JMenu mnPerfil = new JMenu("Perfil");
		mnPerfil.setAlignmentX(Component.RIGHT_ALIGNMENT);
		mnPerfil.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.add(mnPerfil);
		
		JMenuItem mntmEditarPerfil = new JMenuItem("Editar perfil");
		mntmEditarPerfil.setBorder(new EmptyBorder(2, 6, 2, 2));
		mntmEditarPerfil.setBackground(Color.WHITE);
		mntmEditarPerfil.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		mnPerfil.add(mntmEditarPerfil);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar senha");
		mntmAlterarSenha.setBackground(Color.WHITE);
		mntmAlterarSenha.setBorder(new EmptyBorder(2, 6, 2, 2));
		mntmAlterarSenha.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		mnPerfil.add(mntmAlterarSenha);
		
		JRadioButton radioButtonMH = new JRadioButton("");
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		radioButtonMH.setBounds(270, 137, 21, 21);
		AdminMenuFrame.getContentPane().add(radioButtonMH);
		
		JRadioButton radioButtonC = new JRadioButton("");
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		radioButtonC.setBounds(271, 194, 21, 21);
		AdminMenuFrame.getContentPane().add(radioButtonC);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<lista de meta-humanos>", "ou", "<lista de cidades>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		comboBox.setBounds(321, 244, 238, 33);
		AdminMenuFrame.getContentPane().add(comboBox);
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnEdit.setBounds(321, 288, 110, 33);
		AdminMenuFrame.getContentPane().add(btnEdit);
		
		JButton btnView = new JButton("Consultar");
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnView.setBounds(449, 288, 110, 33);
		AdminMenuFrame.getContentPane().add(btnView);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewMHFrame window = new NewMHFrame();
				window.NewMHFrame.setVisible(true);
				AdminMenuFrame.dispose();
			}
		});
		btnRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		btnRegister.setBorder(null);
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(216, 244, 87, 78);
		AdminMenuFrame.getContentPane().add(btnRegister);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/main-menu.jpg")));
		bg.setBounds(0, 0, 584, 361);
		AdminMenuFrame.getContentPane().add(bg);
	}
}
