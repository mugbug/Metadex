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

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

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
		AdminMenuFrame.getContentPane().setBackground(Color.WHITE);
		AdminMenuFrame.setBackground(Color.WHITE);
		AdminMenuFrame.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		AdminMenuFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(AdminMenuFrame.class.getResource("/view/img/favicon.png")));
		AdminMenuFrame.setResizable(false);
		AdminMenuFrame.setTitle("Metadex (admin)");
		AdminMenuFrame.setBounds(100, 100, 604, 428);
		AdminMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminMenuFrame.setLocationRelativeTo(null);
		AdminMenuFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMainMenuAmin = new JPanel();
		AdminMenuFrame.getContentPane().add(panelMainMenuAmin, "MainMenuAdmin");
		panelMainMenuAmin.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 602, 27);
		panelMainMenuAmin.add(menuBar);
		menuBar.setBackground(Color.WHITE);
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		
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
		
		JRadioButton radioButtonMH = new JRadioButton("Meta-humano");
		radioButtonMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonMH.setBounds(152, 205, 114, 21);
		panelMainMenuAmin.add(radioButtonMH);
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		
		JRadioButton radioButtonC = new JRadioButton("Cidade");
		radioButtonC.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonC.setBounds(152, 231, 114, 21);
		panelMainMenuAmin.add(radioButtonC);
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(328, 287, 238, 33);
		panelMainMenuAmin.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<lista de meta-humanos>", "ou", "<lista de cidades>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setBounds(328, 331, 110, 33);
		panelMainMenuAmin.add(btnEdit);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnView = new JButton("Consultar");
		btnView.setBounds(456, 331, 110, 33);
		panelMainMenuAmin.add(btnView);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(135, 331, 110, 33);
		panelMainMenuAmin.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) AdminMenuFrame.getContentPane().getLayout();
				cardLayout.show(AdminMenuFrame.getContentPane(), "NewMH");
			}
		});
		
		btnRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegister.setBorder(null);
		btnRegister.setBackground(Color.WHITE);
		
		JLabel bg = new JLabel("");
		bg.setBounds(0, 29, 602, 370);
		panelMainMenuAmin.add(bg);
		bg.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));

		JPanel panelNewMH = new JPanel();
		panelNewMH.setBackground(Color.WHITE);
		AdminMenuFrame.getContentPane().add(panelNewMH, "NewMH");
		panelNewMH.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) AdminMenuFrame.getContentPane().getLayout();
				cardLayout.show(AdminMenuFrame.getContentPane(), "MainMenuAdmin");
			}
		});
		btnNewButton.setPressedIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnNewButton.setBounds(0, 29, 32, 32);
		panelNewMH.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		label.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		label.setBackground(Color.WHITE);
		label.setBounds(0, 29, 603, 370);
		panelNewMH.add(label);
	}
}
