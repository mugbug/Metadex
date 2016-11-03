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
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Panel;

public class AdminMenuFrame {

	public JFrame AdminMenuFrame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		menuBar.setBounds(0, 0, 602, 30);
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
		radioButtonMH.setBounds(211, 206, 103, 21);
		panelMainMenuAmin.add(radioButtonMH);
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		
		JRadioButton radioButtonC = new JRadioButton("Cidade");
		radioButtonC.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonC.setBounds(359, 206, 63, 21);
		panelMainMenuAmin.add(radioButtonC);
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		
		JRadioButton rdbtnHabilidade = new JRadioButton("Habilidade");
		rdbtnHabilidade.setOpaque(false);
		rdbtnHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		rdbtnHabilidade.setAlignmentX(0.5f);
		rdbtnHabilidade.setBounds(467, 206, 83, 21);
		panelMainMenuAmin.add(rdbtnHabilidade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 285, 238, 33);
		panelMainMenuAmin.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<lista de meta-humanos>", "ou", "<lista de cidades>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.setBounds(318, 329, 110, 33);
		panelMainMenuAmin.add(btnEdit);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnView = new JButton("Consultar");
		btnView.setBounds(446, 329, 110, 33);
		panelMainMenuAmin.add(btnView);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(170, 329, 110, 33);
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
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setEnabled(false);
		separator_1.setBounds(28, 248, 546, 2);
		panelMainMenuAmin.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator.setName("Menu Principal");
		separator.setBounds(30, 187, 546, 2);
		panelMainMenuAmin.add(separator);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setSelectionColor(new Color(255, 255, 102));
		textField.setBounds(40, 286, 238, 33);
		panelMainMenuAmin.add(textField);
		textField.setColumns(10);
		
		JLabel labelMainMenu = new JLabel("Menu Principal");
		labelMainMenu.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		labelMainMenu.setForeground(Color.GRAY);
		labelMainMenu.setBounds(42, 150, 133, 28);
		panelMainMenuAmin.add(labelMainMenu);
		
		JLabel labelMainMenu1 = new JLabel("Escolha um tipo:");
		labelMainMenu1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu1.setForeground(Color.GRAY);
		labelMainMenu1.setBounds(45, 206, 121, 21);
		panelMainMenuAmin.add(labelMainMenu1);
		
		JLabel labelMainMenu2 = new JLabel("Insira nome para cadastrar:");
		labelMainMenu2.setForeground(Color.GRAY);
		labelMainMenu2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu2.setBounds(47, 261, 145, 14);
		panelMainMenuAmin.add(labelMainMenu2);
		
		JLabel labelMainMenu3 = new JLabel("Escolha um(a) <>:");
		labelMainMenu3.setForeground(Color.GRAY);
		labelMainMenu3.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu3.setBounds(329, 261, 227, 14);
		panelMainMenuAmin.add(labelMainMenu3);
		
		JLabel bgMainMenu = new JLabel("");
		bgMainMenu.setBounds(0, 29, 602, 370);
		panelMainMenuAmin.add(bgMainMenu);
		bgMainMenu.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));

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
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar_1.setBackground(Color.WHITE);
		menuBar_1.setAlignmentY(0.5f);
		menuBar_1.setBounds(0, 0, 602, 30);
		panelNewMH.add(menuBar_1);
		
		JMenu menu = new JMenu("Arquivo");
		menu.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_1.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Deslogar");
		menuItem.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem.setBackground(Color.WHITE);
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Sair");
		menuItem_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_1.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_1.setBackground(Color.WHITE);
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("Gerenciar usu\u00E1rios");
		menu_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_1.add(menu_1);
		
		JMenu menu_2 = new JMenu("Perfil");
		menu_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_2.setAlignmentX(1.0f);
		menuBar_1.add(menu_2);
		
		JMenuItem menuItem_2 = new JMenuItem("Editar perfil");
		menuItem_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_2.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_2.setBackground(Color.WHITE);
		menu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Alterar senha");
		menuItem_3.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_3.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_3.setBackground(Color.WHITE);
		menu_2.add(menuItem_3);
		btnNewButton.setPressedIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnNewButton.setBounds(0, 29, 32, 32);
		panelNewMH.add(btnNewButton);
		
		JButton button = new JButton("Cadastrar");
		button.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(444, 325, 110, 33);
		panelNewMH.add(button);
		
		JLabel lblNovoMetahumano = new JLabel("Novo Meta-Humano");
		lblNovoMetahumano.setForeground(Color.GRAY);
		lblNovoMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovoMetahumano.setBounds(42, 150, 187, 28);
		panelNewMH.add(lblNovoMetahumano);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setName("Menu Principal");
		separator_2.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_2.setBounds(30, 187, 546, 2);
		panelNewMH.add(separator_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textField_1.setSelectionColor(new Color(255, 255, 102));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(119, 201, 152, 21);
		panelNewMH.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.GRAY);
		lblNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNome.setBounds(58, 201, 34, 21);
		panelNewMH.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.GRAY);
		lblIdade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblIdade.setBounds(60, 226, 32, 21);
		panelNewMH.add(lblIdade);
		
		JLabel lblHabilidade = new JLabel("Habilidade:");
		lblHabilidade.setForeground(Color.GRAY);
		lblHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHabilidade.setBounds(328, 227, 59, 21);
		panelNewMH.add(lblHabilidade);
		
		JLabel lblPrimeiraApario = new JLabel("Primeira apari\u00E7\u00E3o:");
		lblPrimeiraApario.setForeground(Color.GRAY);
		lblPrimeiraApario.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPrimeiraApario.setBounds(296, 202, 91, 21);
		panelNewMH.add(lblPrimeiraApario);
		
		JLabel lblHistria = new JLabel("Hist\u00F3ria:");
		lblHistria.setForeground(Color.GRAY);
		lblHistria.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHistria.setBounds(49, 254, 43, 21);
		panelNewMH.add(lblHistria);
		
		JButton btnFoto = new JButton("Foto");
		btnFoto.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFoto.setBorder(null);
		btnFoto.setBackground(Color.WHITE);
		btnFoto.setBounds(444, 282, 110, 33);
		panelNewMH.add(btnFoto);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textField_2.setSelectionColor(new Color(255, 255, 102));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(119, 227, 152, 21);
		panelNewMH.add(textField_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(44, 282, 390, 75);
		panelNewMH.add(editorPane);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBox_1.setBounds(402, 200, 152, 21);
		panelNewMH.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(402, 227, 152, 21);
		panelNewMH.add(comboBox_2);
		
		JLabel bgNewMH = new JLabel("");
		bgNewMH.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewMH.setBackground(Color.WHITE);
		bgNewMH.setBounds(0, 29, 603, 370);
		panelNewMH.add(bgNewMH);
		
		Panel panelNewCity = new Panel();
		AdminMenuFrame.getContentPane().add(panelNewCity, "name_30400964307572");
		panelNewCity.setLayout(null);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar_2.setBackground(Color.WHITE);
		menuBar_2.setAlignmentY(0.5f);
		menuBar_2.setBounds(0, 0, 602, 30);
		panelNewCity.add(menuBar_2);
		
		JMenu menu_3 = new JMenu("Arquivo");
		menu_3.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_2.add(menu_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Deslogar");
		menuItem_4.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_4.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_4.setBackground(Color.WHITE);
		menu_3.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Sair");
		menuItem_5.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_5.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_5.setBackground(Color.WHITE);
		menu_3.add(menuItem_5);
		
		JMenu menu_4 = new JMenu("Gerenciar usu\u00E1rios");
		menu_4.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_2.add(menu_4);
		
		JMenu menu_5 = new JMenu("Perfil");
		menu_5.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_5.setAlignmentX(1.0f);
		menuBar_2.add(menu_5);
		
		JMenuItem menuItem_6 = new JMenuItem("Editar perfil");
		menuItem_6.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_6.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_6.setBackground(Color.WHITE);
		menu_5.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("Alterar senha");
		menuItem_7.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_7.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_7.setBackground(Color.WHITE);
		menu_5.add(menuItem_7);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		button_1.setPressedIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBounds(0, 29, 32, 32);
		panelNewCity.add(button_1);
		
		JButton button_2 = new JButton("Cadastrar");
		button_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		button_2.setBorder(null);
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(445, 325, 110, 33);
		panelNewCity.add(button_2);
		
		JLabel lblNovaCidade = new JLabel("Nova Cidade");
		lblNovaCidade.setForeground(Color.GRAY);
		lblNovaCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaCidade.setBounds(42, 150, 187, 28);
		panelNewCity.add(lblNovaCidade);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setName("Menu Principal");
		separator_3.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_3.setBounds(30, 187, 546, 2);
		panelNewCity.add(separator_3);
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_2.setBounds(154, 239, 34, 21);
		panelNewCity.add(label_2);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setForeground(Color.GRAY);
		lblPas.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPas.setBounds(164, 271, 23, 21);
		panelNewCity.add(lblPas);
		
		textField_5 = new JTextField();
		textField_5.setSelectionColor(new Color(255, 255, 102));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(198, 240, 237, 21);
		panelNewCity.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setSelectionColor(new Color(255, 255, 102));
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(197, 272, 238, 21);
		panelNewCity.add(textField_6);
		
		JLabel bgNewCity = new JLabel("");
		bgNewCity.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewCity.setBackground(Color.WHITE);
		bgNewCity.setBounds(0, 29, 603, 370);
		panelNewCity.add(bgNewCity);
		
		Panel panelNewAbility = new Panel();
		AdminMenuFrame.getContentPane().add(panelNewAbility, "name_31064825736751");
		panelNewAbility.setLayout(null);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menuBar_3.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar_3.setBackground(Color.WHITE);
		menuBar_3.setAlignmentY(0.5f);
		menuBar_3.setBounds(0, 0, 602, 30);
		panelNewAbility.add(menuBar_3);
		
		JMenu menu_6 = new JMenu("Arquivo");
		menu_6.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_3.add(menu_6);
		
		JMenuItem menuItem_8 = new JMenuItem("Deslogar");
		menuItem_8.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_8.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_8.setBackground(Color.WHITE);
		menu_6.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("Sair");
		menuItem_9.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_9.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_9.setBackground(Color.WHITE);
		menu_6.add(menuItem_9);
		
		JMenu menu_7 = new JMenu("Gerenciar usu\u00E1rios");
		menu_7.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_3.add(menu_7);
		
		JMenu menu_8 = new JMenu("Perfil");
		menu_8.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_8.setAlignmentX(1.0f);
		menuBar_3.add(menu_8);
		
		JMenuItem menuItem_10 = new JMenuItem("Editar perfil");
		menuItem_10.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_10.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_10.setBackground(Color.WHITE);
		menu_8.add(menuItem_10);
		
		JMenuItem menuItem_11 = new JMenuItem("Alterar senha");
		menuItem_11.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_11.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_11.setBackground(Color.WHITE);
		menu_8.add(menuItem_11);
		
		JButton button_3 = new JButton("");
		button_3.setPressedIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited.png")));
		button_3.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(0, 29, 32, 32);
		panelNewAbility.add(button_3);
		
		JLabel lblNovaHabilidade = new JLabel("Nova Habilidade");
		lblNovaHabilidade.setForeground(Color.GRAY);
		lblNovaHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaHabilidade.setBounds(42, 150, 187, 28);
		panelNewAbility.add(lblNovaHabilidade);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setName("Menu Principal");
		separator_4.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_4.setBounds(30, 187, 546, 2);
		panelNewAbility.add(separator_4);
		
		JButton button_4 = new JButton("Cadastrar");
		button_4.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(445, 325, 110, 33);
		panelNewAbility.add(button_4);
		
		JLabel label_3 = new JLabel("Nome:");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_3.setBounds(61, 224, 34, 21);
		panelNewAbility.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setSelectionColor(new Color(255, 255, 102));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(105, 224, 330, 21);
		panelNewAbility.add(textField_7);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setForeground(Color.GRAY);
		lblDescrio.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblDescrio.setBounds(43, 256, 52, 21);
		panelNewAbility.add(lblDescrio);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(105, 256, 330, 102);
		panelNewAbility.add(editorPane_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		label.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		label.setBackground(Color.WHITE);
		label.setBounds(0, 29, 603, 370);
		panelNewAbility.add(label);
		
		JPanel panelViewMH = new JPanel();
		AdminMenuFrame.getContentPane().add(panelViewMH, "name_31574531143708");
		panelViewMH.setLayout(null);
		
		JMenuBar menuBar_4 = new JMenuBar();
		menuBar_4.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar_4.setBackground(Color.WHITE);
		menuBar_4.setAlignmentY(0.5f);
		menuBar_4.setBounds(0, 0, 602, 30);
		panelViewMH.add(menuBar_4);
		
		JMenu menu_9 = new JMenu("Arquivo");
		menu_9.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_4.add(menu_9);
		
		JMenuItem menuItem_12 = new JMenuItem("Deslogar");
		menuItem_12.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_12.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_12.setBackground(Color.WHITE);
		menu_9.add(menuItem_12);
		
		JMenuItem menuItem_13 = new JMenuItem("Sair");
		menuItem_13.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_13.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_13.setBackground(Color.WHITE);
		menu_9.add(menuItem_13);
		
		JMenu menu_10 = new JMenu("Gerenciar usu\u00E1rios");
		menu_10.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar_4.add(menu_10);
		
		JMenu menu_11 = new JMenu("Perfil");
		menu_11.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_11.setAlignmentX(1.0f);
		menuBar_4.add(menu_11);
		
		JMenuItem menuItem_14 = new JMenuItem("Editar perfil");
		menuItem_14.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_14.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_14.setBackground(Color.WHITE);
		menu_11.add(menuItem_14);
		
		JMenuItem menuItem_15 = new JMenuItem("Alterar senha");
		menuItem_15.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_15.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_15.setBackground(Color.WHITE);
		menu_11.add(menuItem_15);
		
		JButton button_5 = new JButton("");
		button_5.setPressedIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited.png")));
		button_5.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBounds(0, 29, 32, 32);
		panelViewMH.add(button_5);
		
		JLabel label_1 = new JLabel("<nomedometahumano>");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		label_1.setBounds(42, 150, 512, 28);
		panelViewMH.add(label_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setName("Menu Principal");
		separator_5.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_5.setBounds(30, 187, 546, 2);
		panelViewMH.add(separator_5);
		
		JLabel label_5 = new JLabel("Nome:");
		label_5.setForeground(Color.GRAY);
		label_5.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_5.setBounds(58, 201, 34, 21);
		panelViewMH.add(label_5);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditar.setBorder(null);
		btnEditar.setBackground(Color.WHITE);
		btnEditar.setBounds(444, 325, 110, 33);
		panelViewMH.add(btnEditar);
		
		JLabel label_6 = new JLabel("Idade:");
		label_6.setForeground(Color.GRAY);
		label_6.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_6.setBounds(60, 226, 32, 21);
		panelViewMH.add(label_6);
		
		JLabel label_7 = new JLabel("Habilidade:");
		label_7.setForeground(Color.GRAY);
		label_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_7.setBounds(328, 227, 59, 21);
		panelViewMH.add(label_7);
		
		JLabel label_8 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_8.setBounds(296, 202, 91, 21);
		panelViewMH.add(label_8);
		
		JLabel label_9 = new JLabel("Hist\u00F3ria:");
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_9.setBounds(49, 254, 43, 21);
		panelViewMH.add(label_9);
		
		JLabel MHNAME = new JLabel("<nomedometahumano>");
		MHNAME.setForeground(Color.GRAY);
		MHNAME.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		MHNAME.setBounds(102, 200, 184, 21);
		panelViewMH.add(MHNAME);
		
		JLabel label_10 = new JLabel("<nomedometahumano>");
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_10.setBounds(102, 230, 184, 21);
		panelViewMH.add(label_10);
		
		JLabel label_11 = new JLabel("<nomedometahumano>");
		label_11.setForeground(Color.GRAY);
		label_11.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_11.setBounds(397, 200, 184, 21);
		panelViewMH.add(label_11);
		
		JLabel label_12 = new JLabel("<nomedometahumano>");
		label_12.setForeground(Color.GRAY);
		label_12.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_12.setBounds(397, 230, 184, 21);
		panelViewMH.add(label_12);
		
		JLabel bgViewMH = new JLabel("");
		bgViewMH.setIcon(new ImageIcon(AdminMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewMH.setBackground(Color.WHITE);
		bgViewMH.setBounds(0, 29, 603, 370);
		panelViewMH.add(bgViewMH);
	}
}
