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
import javax.swing.JOptionPane;

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
import javax.swing.ButtonGroup;
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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;

public class MainMenuFrame {

	public JFrame MainMenuFrame;
	private JTextField textFieldRegister;
	private JTextField textFieldNomeNewMH;
	private JTextField textFieldIdadeNewMH;
	private JTextField textFieldNomeNewCity;
	private JTextField textFieldPaisNewCity;
	private JTextField textFieldNomeNewAbility;
	private JTable tableViewCity;
	private JTextField textFieldNomeEditMH;
	private JTextField textFieldIdadeEditMH;
	private JTextField textFieldNomeEditCity;
	private JTextField textFieldPaisEditCity;
	private JTextField textFieldNomeEditAbility;

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
	public MainMenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainMenuFrame = new JFrame();
		MainMenuFrame.getContentPane().setBackground(Color.WHITE);
		MainMenuFrame.setBackground(Color.WHITE);
		MainMenuFrame.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		MainMenuFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenuFrame.class.getResource("/view/img/favicon.png")));
		MainMenuFrame.setResizable(false);
		MainMenuFrame.setTitle("Metadex (admin)");
		MainMenuFrame.setBounds(100, 100, 604, 428);
		MainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainMenuFrame.setLocationRelativeTo(null);
		MainMenuFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMainMenu = new JPanel();
		MainMenuFrame.getContentPane().add(panelMainMenu, "MainMenu");
		panelMainMenu.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 602, 30);
		panelMainMenu.add(menuBar);
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
				MainMenuFrame.dispose();
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
		panelMainMenu.add(radioButtonMH);
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		radioButtonMH.setSelected(true);
		
		JRadioButton radioButtonC = new JRadioButton("Cidade");
		radioButtonC.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonC.setBounds(359, 206, 63, 21);
		panelMainMenu.add(radioButtonC);
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		
		JRadioButton radioButtonH = new JRadioButton("Habilidade");
		radioButtonH.setOpaque(false);
		radioButtonH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonH.setAlignmentX(0.5f);
		radioButtonH.setBounds(467, 206, 83, 21);
		panelMainMenu.add(radioButtonH);
		
		//conecta radio buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButtonMH);
		buttonGroup.add(radioButtonC);
		buttonGroup.add(radioButtonH);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 285, 238, 33);
		panelMainMenu.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<lista de meta-humanos>", "ou", "<lista de cidades>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "EditMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "EditCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "EditAbility");
				}
				else {
					String message = "Selecione um tipo!";
					JOptionPane.showMessageDialog(MainMenuFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEdit.setBounds(318, 329, 110, 33);
		panelMainMenu.add(btnEdit);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnView = new JButton("Consultar");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "ViewMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "ViewCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "ViewAbility");
				}
				else {
					String message = "Selecione um tipo!";
					JOptionPane.showMessageDialog(MainMenuFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnView.setBounds(446, 329, 110, 33);
		panelMainMenu.add(btnView);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		textFieldRegister = new JTextField();
		textFieldRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldRegister.setBackground(Color.WHITE);
		textFieldRegister.setSelectionColor(new Color(255, 255, 102));
		textFieldRegister.setBounds(40, 286, 238, 33);
		panelMainMenu.add(textFieldRegister);
		textFieldRegister.setColumns(10);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(170, 329, 110, 33);
		panelMainMenu.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "NewMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "NewCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
					cardLayout.show(MainMenuFrame.getContentPane(), "NewAbility");
				}
				else {
					String message = "Selecione um tipo!";
					JOptionPane.showMessageDialog(MainMenuFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegister.setBorder(null);
		btnRegister.setBackground(Color.WHITE);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setEnabled(false);
		separator_1.setBounds(28, 248, 546, 2);
		panelMainMenu.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator.setName("Menu Principal");
		separator.setBounds(30, 187, 546, 2);
		panelMainMenu.add(separator);
		
		JLabel labelMainMenu = new JLabel("Menu Principal");
		labelMainMenu.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		labelMainMenu.setForeground(Color.GRAY);
		labelMainMenu.setBounds(42, 150, 133, 28);
		panelMainMenu.add(labelMainMenu);
		
		JLabel labelMainMenu1 = new JLabel("Escolha um tipo:");
		labelMainMenu1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu1.setForeground(Color.GRAY);
		labelMainMenu1.setBounds(45, 206, 121, 21);
		panelMainMenu.add(labelMainMenu1);
		
		JLabel labelMainMenu2 = new JLabel("Insira nome para cadastrar:");
		labelMainMenu2.setForeground(Color.GRAY);
		labelMainMenu2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu2.setBounds(47, 261, 145, 14);
		panelMainMenu.add(labelMainMenu2);
		
		JLabel labelEditView = new JLabel("Escolha um Meta-Humano:");
		
		//altera label de acordo com radio buttons
		
		radioButtonMH.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha um Meta-Humano:");
			}
		});
		radioButtonC.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha uma Cidade:");
			}
		});
		radioButtonH.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha uma Habilidade:");
			}
		});
		
		labelEditView.setForeground(Color.GRAY);
		labelEditView.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelEditView.setBounds(329, 261, 227, 14);
		panelMainMenu.add(labelEditView);
		
		JLabel bgMainMenu = new JLabel("");
		bgMainMenu.setBounds(0, 29, 602, 370);
		panelMainMenu.add(bgMainMenu);
		bgMainMenu.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));

		JPanel panelNewMH = new JPanel();
		panelNewMH.setBackground(Color.WHITE);
		MainMenuFrame.getContentPane().add(panelNewMH, "NewMH");
		panelNewMH.setLayout(null);
		
		JButton btnBackNewMH = new JButton("");
		
		
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
		btnBackNewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewMH.setContentAreaFilled(false);
		btnBackNewMH.setBorderPainted(false);
		btnBackNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewMH.setBounds(0, 29, 32, 32);
		panelNewMH.add(btnBackNewMH);
		
		JButton btnRegisterNewMH = new JButton("Cadastrar");
		btnRegisterNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewMH.setBorder(null);
		btnRegisterNewMH.setBackground(Color.WHITE);
		btnRegisterNewMH.setBounds(444, 325, 110, 33);
		panelNewMH.add(btnRegisterNewMH);
		
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
		
		textFieldNomeNewMH = new JTextField();
		textFieldNomeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewMH.setColumns(10);
		textFieldNomeNewMH.setBackground(Color.WHITE);
		textFieldNomeNewMH.setBounds(119, 201, 152, 21);
		panelNewMH.add(textFieldNomeNewMH);
		
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
		
		textFieldIdadeNewMH = new JTextField();
		textFieldIdadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeNewMH.setColumns(10);
		textFieldIdadeNewMH.setBackground(Color.WHITE);
		textFieldIdadeNewMH.setBounds(119, 227, 152, 21);
		panelNewMH.add(textFieldIdadeNewMH);
		
		JEditorPane editorPaneHistoriaNewMH = new JEditorPane();
		editorPaneHistoriaNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		editorPaneHistoriaNewMH.setBounds(44, 282, 390, 75);
		panelNewMH.add(editorPaneHistoriaNewMH);
		
		JComboBox comboBoxCidadeNewMH = new JComboBox();
		comboBoxCidadeNewMH.setBackground(Color.WHITE);
		comboBoxCidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeNewMH.setBounds(402, 200, 152, 21);
		panelNewMH.add(comboBoxCidadeNewMH);
		
		JComboBox comboBoxHabilidadeNewMH = new JComboBox();
		comboBoxHabilidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeNewMH.setBackground(Color.WHITE);
		comboBoxHabilidadeNewMH.setBounds(402, 227, 152, 21);
		panelNewMH.add(comboBoxHabilidadeNewMH);
		
		JLabel bgNewMH = new JLabel("");
		bgNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewMH.setBackground(Color.WHITE);
		bgNewMH.setBounds(0, 29, 603, 370);
		panelNewMH.add(bgNewMH);
		
		Panel panelNewCity = new Panel();
		MainMenuFrame.getContentPane().add(panelNewCity, "NewCity");
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
		
		JButton btnBackNewCity = new JButton("");
		
		btnBackNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewCity.setContentAreaFilled(false);
		btnBackNewCity.setBorderPainted(false);
		btnBackNewCity.setBounds(0, 29, 32, 32);
		panelNewCity.add(btnBackNewCity);
		
		JButton btnRegisterNewCity = new JButton("Cadastrar");
		btnRegisterNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewCity.setBorder(null);
		btnRegisterNewCity.setBackground(Color.WHITE);
		btnRegisterNewCity.setBounds(445, 325, 110, 33);
		panelNewCity.add(btnRegisterNewCity);
		
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
		
		textFieldNomeNewCity = new JTextField();
		textFieldNomeNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewCity.setColumns(10);
		textFieldNomeNewCity.setBackground(Color.WHITE);
		textFieldNomeNewCity.setBounds(198, 240, 237, 21);
		panelNewCity.add(textFieldNomeNewCity);
		
		textFieldPaisNewCity = new JTextField();
		textFieldPaisNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisNewCity.setColumns(10);
		textFieldPaisNewCity.setBackground(Color.WHITE);
		textFieldPaisNewCity.setBounds(197, 272, 238, 21);
		panelNewCity.add(textFieldPaisNewCity);
		
		JLabel bgNewCity = new JLabel("");
		bgNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewCity.setBackground(Color.WHITE);
		bgNewCity.setBounds(0, 29, 603, 370);
		panelNewCity.add(bgNewCity);
		
		Panel panelNewAbility = new Panel();
		MainMenuFrame.getContentPane().add(panelNewAbility, "NewAbility");
		panelNewAbility.setLayout(null);
		
		JMenuBar menuBarNewAbility = new JMenuBar();
		menuBarNewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarNewAbility.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarNewAbility.setBackground(Color.WHITE);
		menuBarNewAbility.setAlignmentY(0.5f);
		menuBarNewAbility.setBounds(0, 0, 602, 30);
		panelNewAbility.add(menuBarNewAbility);
		
		JMenu menu_6 = new JMenu("Arquivo");
		menu_6.setMnemonic(KeyEvent.VK_A);
		menu_6.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarNewAbility.add(menu_6);
		
		JMenuItem menuItem_8 = new JMenuItem("Deslogar");
		menuItem_8.setMnemonic(KeyEvent.VK_D);
		menuItem_8.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_8.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_8.setBackground(Color.WHITE);
		menu_6.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("Sair");
		menuItem_9.setMnemonic(KeyEvent.VK_S);
		menuItem_9.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_9.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_9.setBackground(Color.WHITE);
		menu_6.add(menuItem_9);
		
		JMenu menu_7 = new JMenu("Gerenciar usu\u00E1rios");
		menu_7.setMnemonic(KeyEvent.VK_G);
		menu_7.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarNewAbility.add(menu_7);
		
		JMenu menu_8 = new JMenu("Perfil");
		menu_8.setMnemonic(KeyEvent.VK_P);
		menu_8.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_8.setAlignmentX(1.0f);
		menuBarNewAbility.add(menu_8);
		
		JMenuItem menuItem_10 = new JMenuItem("Editar perfil");
		menuItem_10.setMnemonic(KeyEvent.VK_E);
		menuItem_10.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_10.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_10.setBackground(Color.WHITE);
		menu_8.add(menuItem_10);
		
		JMenuItem menuItem_11 = new JMenuItem("Alterar senha");
		menuItem_11.setMnemonic(KeyEvent.VK_A);
		menuItem_11.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_11.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_11.setBackground(Color.WHITE);
		menu_8.add(menuItem_11);
		
		JButton btnBackNewAbility = new JButton("");
		
		btnBackNewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewAbility.setContentAreaFilled(false);
		btnBackNewAbility.setBorderPainted(false);
		btnBackNewAbility.setBounds(0, 29, 32, 32);
		panelNewAbility.add(btnBackNewAbility);
		
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
		
		textFieldNomeNewAbility = new JTextField();
		textFieldNomeNewAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewAbility.setColumns(10);
		textFieldNomeNewAbility.setBackground(Color.WHITE);
		textFieldNomeNewAbility.setBounds(105, 224, 330, 21);
		panelNewAbility.add(textFieldNomeNewAbility);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setForeground(Color.GRAY);
		lblDescrio.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblDescrio.setBounds(43, 256, 52, 21);
		panelNewAbility.add(lblDescrio);
		
		JEditorPane editorPaneDescNewAbility = new JEditorPane();
		editorPaneDescNewAbility.setBounds(105, 256, 330, 102);
		panelNewAbility.add(editorPaneDescNewAbility);
		
		JLabel bgNewAbility = new JLabel("");
		bgNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewAbility.setBackground(Color.WHITE);
		bgNewAbility.setBounds(0, 29, 603, 370);
		panelNewAbility.add(bgNewAbility);
		
		JPanel panelViewMH = new JPanel();
		MainMenuFrame.getContentPane().add(panelViewMH, "ViewMH");
		panelViewMH.setLayout(null);
		
		JMenuBar menuBarViewMH = new JMenuBar();
		menuBarViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewMH.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarViewMH.setBackground(Color.WHITE);
		menuBarViewMH.setAlignmentY(0.5f);
		menuBarViewMH.setBounds(0, 0, 602, 30);
		panelViewMH.add(menuBarViewMH);
		
		JMenu menu_9 = new JMenu("Arquivo");
		menu_9.setMnemonic(KeyEvent.VK_A);
		menu_9.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewMH.add(menu_9);
		
		JMenuItem menuItem_12 = new JMenuItem("Deslogar");
		menuItem_12.setMnemonic(KeyEvent.VK_D);
		menuItem_12.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_12.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_12.setBackground(Color.WHITE);
		menu_9.add(menuItem_12);
		
		JMenuItem menuItem_13 = new JMenuItem("Sair");
		menuItem_13.setMnemonic(KeyEvent.VK_S);
		menuItem_13.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_13.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_13.setBackground(Color.WHITE);
		menu_9.add(menuItem_13);
		
		JMenu menu_10 = new JMenu("Gerenciar usu\u00E1rios");
		menu_10.setMnemonic(KeyEvent.VK_G);
		menu_10.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewMH.add(menu_10);
		
		JMenu menu_11 = new JMenu("Perfil");
		menu_11.setMnemonic(KeyEvent.VK_P);
		menu_11.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_11.setAlignmentX(1.0f);
		menuBarViewMH.add(menu_11);
		
		JMenuItem menuItem_14 = new JMenuItem("Editar perfil");
		menuItem_14.setMnemonic(KeyEvent.VK_E);
		menuItem_14.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_14.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_14.setBackground(Color.WHITE);
		menu_11.add(menuItem_14);
		
		JMenuItem menuItem_15 = new JMenuItem("Alterar senha");
		menuItem_15.setMnemonic(KeyEvent.VK_A);
		menuItem_15.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_15.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_15.setBackground(Color.WHITE);
		menu_11.add(menuItem_15);
		
		JButton btnBackViewMH = new JButton("");
		btnBackViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackViewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewMH.setContentAreaFilled(false);
		btnBackViewMH.setBorderPainted(false);
		btnBackViewMH.setBounds(0, 29, 32, 32);
		panelViewMH.add(btnBackViewMH);
		
		JLabel lblNomeIdadeViewMH = new JLabel("<nome>, <idade>");
		lblNomeIdadeViewMH.setForeground(Color.GRAY);
		lblNomeIdadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeIdadeViewMH.setBounds(42, 150, 392, 28);
		panelViewMH.add(lblNomeIdadeViewMH);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setName("Menu Principal");
		separator_5.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_5.setBounds(30, 187, 546, 2);
		panelViewMH.add(separator_5);
		
		JButton btnEditViewMH = new JButton("");
		btnEditViewMH.setContentAreaFilled(false);
		btnEditViewMH.setBorderPainted(false);
		btnEditViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewMH.setBorder(null);
		btnEditViewMH.setBackground(Color.WHITE);
		btnEditViewMH.setBounds(522, 147, 32, 32);
		panelViewMH.add(btnEditViewMH);
		
		JLabel label_7 = new JLabel("Habilidade:");
		label_7.setForeground(Color.GRAY);
		label_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_7.setBounds(245, 337, 59, 21);
		panelViewMH.add(label_7);
		
		JLabel label_8 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_8.setBounds(213, 312, 91, 21);
		panelViewMH.add(label_8);
		
		JLabel label_9 = new JLabel("Hist\u00F3ria:");
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_9.setBounds(213, 200, 43, 21);
		panelViewMH.add(label_9);
		
		JLabel lblCidadeViewMH = new JLabel("<cidade>");
		lblCidadeViewMH.setForeground(Color.BLACK);
		lblCidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblCidadeViewMH.setBounds(314, 312, 238, 21);
		panelViewMH.add(lblCidadeViewMH);
		
		JLabel lblHabilidadeViewMH = new JLabel("<habilidade>");
		lblHabilidadeViewMH.setForeground(Color.BLACK);
		lblHabilidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblHabilidadeViewMH.setBounds(314, 337, 240, 21);
		panelViewMH.add(lblHabilidadeViewMH);
		
		JLabel lblFoto = new JLabel("Foto 150x150");
		lblFoto.setBackground(Color.DARK_GRAY);
		lblFoto.setBorder(new EmptyBorder(1, 1, 1, 1));
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setForeground(Color.WHITE);
		lblFoto.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblFoto.setBounds(53, 207, 150, 150);
		panelViewMH.add(lblFoto);
		
		JEditorPane editorPaneHistoriaViewMH = new JEditorPane();
		editorPaneHistoriaViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		editorPaneHistoriaViewMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		editorPaneHistoriaViewMH.setEditable(false);
		editorPaneHistoriaViewMH.setBackground(new Color(220, 220, 220));
		editorPaneHistoriaViewMH.setBounds(213, 219, 341, 82);
		panelViewMH.add(editorPaneHistoriaViewMH);
		
		JLabel bgViewMH = new JLabel("");
		bgViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewMH.setBackground(Color.WHITE);
		bgViewMH.setBounds(0, 29, 603, 370);
		panelViewMH.add(bgViewMH);
		
		JPanel panelViewCity = new JPanel();
		panelViewCity.setBackground(Color.WHITE);
		MainMenuFrame.getContentPane().add(panelViewCity, "ViewCity");
		panelViewCity.setLayout(null);
		
		JMenuBar menuBarViewCity = new JMenuBar();
		menuBarViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewCity.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarViewCity.setBackground(Color.WHITE);
		menuBarViewCity.setAlignmentY(0.5f);
		menuBarViewCity.setBounds(0, 0, 602, 30);
		panelViewCity.add(menuBarViewCity);
		
		JMenu menu_12 = new JMenu("Arquivo");
		menu_12.setMnemonic(KeyEvent.VK_A);
		menu_12.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewCity.add(menu_12);
		
		JMenuItem menuItem_16 = new JMenuItem("Deslogar");
		menuItem_16.setMnemonic(KeyEvent.VK_D);
		menuItem_16.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_16.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_16.setBackground(Color.WHITE);
		menu_12.add(menuItem_16);
		
		JMenuItem menuItem_17 = new JMenuItem("Sair");
		menuItem_17.setMnemonic(KeyEvent.VK_S);
		menuItem_17.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_17.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_17.setBackground(Color.WHITE);
		menu_12.add(menuItem_17);
		
		JMenu menu_13 = new JMenu("Gerenciar usu\u00E1rios");
		menu_13.setMnemonic(KeyEvent.VK_G);
		menu_13.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewCity.add(menu_13);
		
		JMenu menu_14 = new JMenu("Perfil");
		menu_14.setMnemonic(KeyEvent.VK_P);
		menu_14.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_14.setAlignmentX(1.0f);
		menuBarViewCity.add(menu_14);
		
		JMenuItem menuItem_18 = new JMenuItem("Editar perfil");
		menuItem_18.setMnemonic(KeyEvent.VK_E);
		menuItem_18.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_18.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_18.setBackground(Color.WHITE);
		menu_14.add(menuItem_18);
		
		JMenuItem menuItem_19 = new JMenuItem("Alterar senha");
		menuItem_19.setMnemonic(KeyEvent.VK_A);
		menuItem_19.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_19.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_19.setBackground(Color.WHITE);
		menu_14.add(menuItem_19);
		
		JButton btnBackViewCity = new JButton("");
		btnBackViewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewCity.setContentAreaFilled(false);
		btnBackViewCity.setBorderPainted(false);
		btnBackViewCity.setBounds(0, 29, 32, 32);
		panelViewCity.add(btnBackViewCity);
		
		JButton btnEditViewCity = new JButton("");
		btnEditViewCity.setContentAreaFilled(false);
		btnEditViewCity.setBorderPainted(false);
		btnEditViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewCity.setBorder(null);
		btnEditViewCity.setBackground(Color.WHITE);
		btnEditViewCity.setBounds(507, 146, 32, 32);
		panelViewCity.add(btnEditViewCity);
		
		JLabel lblNomePaisViewCity = new JLabel("<cidade>, <pa\u00EDs>");
		lblNomePaisViewCity.setForeground(Color.GRAY);
		lblNomePaisViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomePaisViewCity.setBounds(42, 150, 187, 28);
		panelViewCity.add(lblNomePaisViewCity);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setName("Menu Principal");
		separator_6.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_6.setBounds(30, 187, 546, 2);
		panelViewCity.add(separator_6);
		
		tableViewCity = new JTable();
		tableViewCity.setShowGrid(false);
		tableViewCity.setSelectionBackground(new Color(255, 255, 153));
		tableViewCity.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tableViewCity.setModel(new DefaultTableModel(
			new Object[][] {
				{"Virgil", "16", "Choque do whatever"},
				{"nome", "idade", "habilidade"},
			},
			new String[] {
				"Nome", "Idade", "Habilidade"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableViewCity.getColumnModel().getColumn(0).setPreferredWidth(126);
		tableViewCity.getColumnModel().getColumn(1).setPreferredWidth(123);
		tableViewCity.getColumnModel().getColumn(2).setPreferredWidth(148);
		tableViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		tableViewCity.setBounds(63, 200, 476, 156);
		panelViewCity.add(tableViewCity);
		
		JLabel bgViewCity = new JLabel("");
		bgViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewCity.setBackground(Color.WHITE);
		bgViewCity.setBounds(0, 29, 603, 370);
		panelViewCity.add(bgViewCity);
		
		Panel panelViewAbility = new Panel();
		MainMenuFrame.getContentPane().add(panelViewAbility, "ViewAbility");
		panelViewAbility.setLayout(null);
		
		JMenuBar menuBarViewAbility = new JMenuBar();
		menuBarViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewAbility.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarViewAbility.setBackground(Color.WHITE);
		menuBarViewAbility.setAlignmentY(0.5f);
		menuBarViewAbility.setBounds(0, 0, 602, 30);
		panelViewAbility.add(menuBarViewAbility);
		
		JMenu menu_15 = new JMenu("Arquivo");
		menu_15.setMnemonic(KeyEvent.VK_A);
		menu_15.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewAbility.add(menu_15);
		
		JMenuItem menuItem_20 = new JMenuItem("Deslogar");
		menuItem_20.setMnemonic(KeyEvent.VK_D);
		menuItem_20.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_20.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_20.setBackground(Color.WHITE);
		menu_15.add(menuItem_20);
		
		JMenuItem menuItem_21 = new JMenuItem("Sair");
		menuItem_21.setMnemonic(KeyEvent.VK_S);
		menuItem_21.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_21.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_21.setBackground(Color.WHITE);
		menu_15.add(menuItem_21);
		
		JMenu menu_16 = new JMenu("Gerenciar usu\u00E1rios");
		menu_16.setMnemonic(KeyEvent.VK_G);
		menu_16.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarViewAbility.add(menu_16);
		
		JMenu menu_17 = new JMenu("Perfil");
		menu_17.setMnemonic(KeyEvent.VK_P);
		menu_17.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menu_17.setAlignmentX(1.0f);
		menuBarViewAbility.add(menu_17);
		
		JMenuItem menuItem_22 = new JMenuItem("Editar perfil");
		menuItem_22.setMnemonic(KeyEvent.VK_E);
		menuItem_22.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_22.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_22.setBackground(Color.WHITE);
		menu_17.add(menuItem_22);
		
		JMenuItem menuItem_23 = new JMenuItem("Alterar senha");
		menuItem_23.setMnemonic(KeyEvent.VK_A);
		menuItem_23.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItem_23.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItem_23.setBackground(Color.WHITE);
		menu_17.add(menuItem_23);
		
		JButton btnBackViewAbility = new JButton("");
		btnBackViewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewAbility.setContentAreaFilled(false);
		btnBackViewAbility.setBorderPainted(false);
		btnBackViewAbility.setBounds(0, 29, 32, 32);
		panelViewAbility.add(btnBackViewAbility);
		
		JButton btnEditViewAbility = new JButton("");
		btnEditViewAbility.setContentAreaFilled(false);
		btnEditViewAbility.setBorderPainted(false);
		btnEditViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewAbility.setBorder(null);
		btnEditViewAbility.setBackground(Color.WHITE);
		btnEditViewAbility.setBounds(527, 146, 32, 32);
		panelViewAbility.add(btnEditViewAbility);
		
		JLabel lblNomeViewAbility = new JLabel("<habilidade>");
		lblNomeViewAbility.setForeground(Color.GRAY);
		lblNomeViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeViewAbility.setBounds(42, 150, 187, 28);
		panelViewAbility.add(lblNomeViewAbility);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setName("Menu Principal");
		separator_7.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_7.setBounds(30, 187, 546, 2);
		panelViewAbility.add(separator_7);
		
		JEditorPane editorPaneDescViewAbility = new JEditorPane();
		editorPaneDescViewAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		editorPaneDescViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		editorPaneDescViewAbility.setEditable(false);
		editorPaneDescViewAbility.setBackground(new Color(220, 220, 220));
		editorPaneDescViewAbility.setBounds(85, 224, 432, 120);
		panelViewAbility.add(editorPaneDescViewAbility);
		
		JLabel bgViewAbility = new JLabel("");
		bgViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewAbility.setBackground(Color.WHITE);
		bgViewAbility.setBounds(0, 29, 603, 370);
		panelViewAbility.add(bgViewAbility);
		
		Panel panelEditMH = new Panel();
		MainMenuFrame.getContentPane().add(panelEditMH, "EditMH");
		panelEditMH.setLayout(null);
		
		JMenuBar menuBarEditMH = new JMenuBar();
		menuBarEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditMH.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarEditMH.setBackground(Color.WHITE);
		menuBarEditMH.setAlignmentY(0.5f);
		menuBarEditMH.setBounds(0, 0, 602, 30);
		panelEditMH.add(menuBarEditMH);
		
		JMenu ArquivoEditMH = new JMenu("Arquivo");
		ArquivoEditMH.setMnemonic(KeyEvent.VK_A);
		ArquivoEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditMH.add(ArquivoEditMH);
		
		JMenuItem DeslogarEditMH = new JMenuItem("Deslogar");
		DeslogarEditMH.setMnemonic(KeyEvent.VK_D);
		DeslogarEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		DeslogarEditMH.setBorder(new EmptyBorder(2, 6, 2, 2));
		DeslogarEditMH.setBackground(Color.WHITE);
		ArquivoEditMH.add(DeslogarEditMH);
		
		JMenuItem SairEditMH = new JMenuItem("Sair");
		SairEditMH.setMnemonic(KeyEvent.VK_S);
		SairEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		SairEditMH.setBorder(new EmptyBorder(2, 6, 2, 2));
		SairEditMH.setBackground(Color.WHITE);
		ArquivoEditMH.add(SairEditMH);
		
		JMenu GerenciarEditMH = new JMenu("Gerenciar usu\u00E1rios");
		GerenciarEditMH.setMnemonic(KeyEvent.VK_G);
		GerenciarEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditMH.add(GerenciarEditMH);
		
		JMenu PerfilEditMH = new JMenu("Perfil");
		PerfilEditMH.setMnemonic(KeyEvent.VK_P);
		PerfilEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		PerfilEditMH.setAlignmentX(1.0f);
		menuBarEditMH.add(PerfilEditMH);
		
		JMenuItem EditarEditMH = new JMenuItem("Editar perfil");
		EditarEditMH.setMnemonic(KeyEvent.VK_E);
		EditarEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		EditarEditMH.setBorder(new EmptyBorder(2, 6, 2, 2));
		EditarEditMH.setBackground(Color.WHITE);
		PerfilEditMH.add(EditarEditMH);
		
		JMenuItem AlterarEditMH = new JMenuItem("Alterar senha");
		AlterarEditMH.setMnemonic(KeyEvent.VK_A);
		AlterarEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		AlterarEditMH.setBorder(new EmptyBorder(2, 6, 2, 2));
		AlterarEditMH.setBackground(Color.WHITE);
		PerfilEditMH.add(AlterarEditMH);
		
		JButton btnBackEditMH = new JButton("");
		btnBackEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditMH.setContentAreaFilled(false);
		btnBackEditMH.setBorderPainted(false);
		btnBackEditMH.setBounds(0, 29, 32, 32);
		panelEditMH.add(btnBackEditMH);
		
		JButton btnUpdateEditMH = new JButton("Atualizar");
		btnUpdateEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditMH.setBorder(null);
		btnUpdateEditMH.setBackground(Color.WHITE);
		btnUpdateEditMH.setBounds(444, 325, 110, 33);
		panelEditMH.add(btnUpdateEditMH);
		
		JLabel lblEditarMetahumano = new JLabel("Editar Meta-Humano");
		lblEditarMetahumano.setForeground(Color.GRAY);
		lblEditarMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarMetahumano.setBounds(42, 150, 187, 28);
		panelEditMH.add(lblEditarMetahumano);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setName("Menu Principal");
		separator_8.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_8.setBounds(30, 187, 546, 2);
		panelEditMH.add(separator_8);
		
		JLabel label_10 = new JLabel("Nome:");
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_10.setBounds(58, 201, 34, 21);
		panelEditMH.add(label_10);
		
		JLabel label_14 = new JLabel("Idade:");
		label_14.setForeground(Color.GRAY);
		label_14.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_14.setBounds(60, 226, 32, 21);
		panelEditMH.add(label_14);
		
		JLabel label_16 = new JLabel("Habilidade:");
		label_16.setForeground(Color.GRAY);
		label_16.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_16.setBounds(328, 227, 59, 21);
		panelEditMH.add(label_16);
		
		JLabel label_17 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_17.setForeground(Color.GRAY);
		label_17.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_17.setBounds(296, 202, 91, 21);
		panelEditMH.add(label_17);
		
		JLabel label_18 = new JLabel("Hist\u00F3ria:");
		label_18.setForeground(Color.GRAY);
		label_18.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_18.setBounds(49, 254, 43, 21);
		panelEditMH.add(label_18);
		
		JButton btnFotoEditMH = new JButton("Foto");
		btnFotoEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFotoEditMH.setBorder(null);
		btnFotoEditMH.setBackground(Color.WHITE);
		btnFotoEditMH.setBounds(444, 282, 110, 33);
		panelEditMH.add(btnFotoEditMH);
		
		textFieldNomeEditMH = new JTextField();
		textFieldNomeEditMH.setText("<nome>");
		textFieldNomeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeEditMH.setColumns(10);
		textFieldNomeEditMH.setBackground(Color.WHITE);
		textFieldNomeEditMH.setBounds(119, 201, 152, 21);
		panelEditMH.add(textFieldNomeEditMH);
		
		textFieldIdadeEditMH = new JTextField();
		textFieldIdadeEditMH.setText("<idade>");
		textFieldIdadeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeEditMH.setColumns(10);
		textFieldIdadeEditMH.setBackground(Color.WHITE);
		textFieldIdadeEditMH.setBounds(119, 227, 152, 21);
		panelEditMH.add(textFieldIdadeEditMH);
		
		JEditorPane textFieldHistoriaEditMH = new JEditorPane();
		textFieldHistoriaEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldHistoriaEditMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		textFieldHistoriaEditMH.setBounds(44, 282, 390, 75);
		panelEditMH.add(textFieldHistoriaEditMH);
		
		JComboBox comboBoxCidadeEditMH = new JComboBox();
		comboBoxCidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeEditMH.setBackground(Color.WHITE);
		comboBoxCidadeEditMH.setBounds(402, 200, 152, 21);
		panelEditMH.add(comboBoxCidadeEditMH);
		
		JComboBox comboBoxHabilidadeEditMH = new JComboBox();
		comboBoxHabilidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeEditMH.setBackground(Color.WHITE);
		comboBoxHabilidadeEditMH.setBounds(402, 227, 152, 21);
		panelEditMH.add(comboBoxHabilidadeEditMH);
		
		JButton btnExcludeEditMH = new JButton("");
		btnExcludeEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditMH.setContentAreaFilled(false);
		btnExcludeEditMH.setBorderPainted(false);
		btnExcludeEditMH.setBounds(522, 146, 32, 32);
		panelEditMH.add(btnExcludeEditMH);
		
		JLabel bgEditMH = new JLabel("");
		bgEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditMH.setBackground(Color.WHITE);
		bgEditMH.setBounds(0, 29, 603, 370);
		panelEditMH.add(bgEditMH);
		
		Panel panelEditCity = new Panel();
		MainMenuFrame.getContentPane().add(panelEditCity, "EditCity");
		panelEditCity.setLayout(null);
		
		JMenuBar menuBarEditCity = new JMenuBar();
		menuBarEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditCity.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarEditCity.setBackground(Color.WHITE);
		menuBarEditCity.setAlignmentY(0.5f);
		menuBarEditCity.setBounds(0, 0, 602, 30);
		panelEditCity.add(menuBarEditCity);
		
		JMenu ArquivoEditCity = new JMenu("Arquivo");
		ArquivoEditCity.setMnemonic(KeyEvent.VK_A);
		ArquivoEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditCity.add(ArquivoEditCity);
		
		JMenuItem DeslogarEditCity = new JMenuItem("Deslogar");
		DeslogarEditCity.setMnemonic(KeyEvent.VK_D);
		DeslogarEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		DeslogarEditCity.setBorder(new EmptyBorder(2, 6, 2, 2));
		DeslogarEditCity.setBackground(Color.WHITE);
		ArquivoEditCity.add(DeslogarEditCity);
		
		JMenuItem SairEditCity = new JMenuItem("Sair");
		SairEditCity.setMnemonic(KeyEvent.VK_S);
		SairEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		SairEditCity.setBorder(new EmptyBorder(2, 6, 2, 2));
		SairEditCity.setBackground(Color.WHITE);
		ArquivoEditCity.add(SairEditCity);
		
		JMenu GerenciarEditCity = new JMenu("Gerenciar usu\u00E1rios");
		GerenciarEditCity.setMnemonic(KeyEvent.VK_G);
		GerenciarEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditCity.add(GerenciarEditCity);
		
		JMenu PerfilEditCity = new JMenu("Perfil");
		PerfilEditCity.setMnemonic(KeyEvent.VK_P);
		PerfilEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		PerfilEditCity.setAlignmentX(1.0f);
		menuBarEditCity.add(PerfilEditCity);
		
		JMenuItem EditarEditCity = new JMenuItem("Editar perfil");
		EditarEditCity.setMnemonic(KeyEvent.VK_E);
		EditarEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		EditarEditCity.setBorder(new EmptyBorder(2, 6, 2, 2));
		EditarEditCity.setBackground(Color.WHITE);
		PerfilEditCity.add(EditarEditCity);
		
		JMenuItem AlterarEditCity = new JMenuItem("Alterar senha");
		AlterarEditCity.setMnemonic(KeyEvent.VK_A);
		AlterarEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		AlterarEditCity.setBorder(new EmptyBorder(2, 6, 2, 2));
		AlterarEditCity.setBackground(Color.WHITE);
		PerfilEditCity.add(AlterarEditCity);
		
		JButton btnBackEditCity = new JButton("");
		btnBackEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditCity.setContentAreaFilled(false);
		btnBackEditCity.setBorderPainted(false);
		btnBackEditCity.setBounds(0, 29, 32, 32);
		panelEditCity.add(btnBackEditCity);
		
		JButton btnUpdateEditCity = new JButton("Atualizar");
		btnUpdateEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditCity.setBorder(null);
		btnUpdateEditCity.setBackground(Color.WHITE);
		btnUpdateEditCity.setBounds(445, 325, 110, 33);
		panelEditCity.add(btnUpdateEditCity);
		
		JLabel lblEditarCidade = new JLabel("Editar Cidade");
		lblEditarCidade.setForeground(Color.GRAY);
		lblEditarCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarCidade.setBounds(42, 150, 187, 28);
		panelEditCity.add(lblEditarCidade);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setName("Menu Principal");
		separator_9.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_9.setBounds(30, 187, 546, 2);
		panelEditCity.add(separator_9);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setForeground(Color.GRAY);
		labelNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNome.setBounds(154, 239, 34, 21);
		panelEditCity.add(labelNome);
		
		JLabel labelPais = new JLabel("Pa\u00EDs:");
		labelPais.setForeground(Color.GRAY);
		labelPais.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelPais.setBounds(164, 271, 23, 21);
		panelEditCity.add(labelPais);
		
		textFieldNomeEditCity = new JTextField();
		textFieldNomeEditCity.setText("<nome da cidade>");
		textFieldNomeEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditCity.setColumns(10);
		textFieldNomeEditCity.setBackground(Color.WHITE);
		textFieldNomeEditCity.setBounds(198, 240, 237, 21);
		panelEditCity.add(textFieldNomeEditCity);
		
		textFieldPaisEditCity = new JTextField();
		textFieldPaisEditCity.setText("<nome do pa\u00EDs>");
		textFieldPaisEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisEditCity.setColumns(10);
		textFieldPaisEditCity.setBackground(Color.WHITE);
		textFieldPaisEditCity.setBounds(197, 272, 238, 21);
		panelEditCity.add(textFieldPaisEditCity);
		
		JButton btnExcludeEditCity = new JButton("");
		btnExcludeEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditCity.setContentAreaFilled(false);
		btnExcludeEditCity.setBorderPainted(false);
		btnExcludeEditCity.setBounds(523, 146, 32, 32);
		panelEditCity.add(btnExcludeEditCity);
		
		JLabel bgEditCity = new JLabel("");
		bgEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditCity.setBackground(Color.WHITE);
		bgEditCity.setBounds(0, 29, 603, 370);
		panelEditCity.add(bgEditCity);
		
		Panel panelEditAbility = new Panel();
		MainMenuFrame.getContentPane().add(panelEditAbility, "EditAbility");
		panelEditAbility.setLayout(null);
		
		JMenuBar menuBarEditAbility = new JMenuBar();
		menuBarEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditAbility.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBarEditAbility.setBackground(Color.WHITE);
		menuBarEditAbility.setAlignmentY(0.5f);
		menuBarEditAbility.setBounds(0, 0, 602, 30);
		panelEditAbility.add(menuBarEditAbility);
		
		JMenu ArquivoEditAbility = new JMenu("Arquivo");
		ArquivoEditAbility.setMnemonic(KeyEvent.VK_A);
		ArquivoEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditAbility.add(ArquivoEditAbility);
		
		JMenuItem DeslogarEditAbility = new JMenuItem("Deslogar");
		DeslogarEditAbility.setMnemonic(KeyEvent.VK_D);
		DeslogarEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		DeslogarEditAbility.setBorder(new EmptyBorder(2, 6, 2, 2));
		DeslogarEditAbility.setBackground(Color.WHITE);
		ArquivoEditAbility.add(DeslogarEditAbility);
		
		JMenuItem SairEditAbility = new JMenuItem("Sair");
		SairEditAbility.setMnemonic(KeyEvent.VK_S);
		SairEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		SairEditAbility.setBorder(new EmptyBorder(2, 6, 2, 2));
		SairEditAbility.setBackground(Color.WHITE);
		ArquivoEditAbility.add(SairEditAbility);
		
		JMenu GerenciarEditAbility = new JMenu("Gerenciar usu\u00E1rios");
		GerenciarEditAbility.setMnemonic(KeyEvent.VK_G);
		GerenciarEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBarEditAbility.add(GerenciarEditAbility);
		
		JMenu PerfilEditAbility = new JMenu("Perfil");
		PerfilEditAbility.setMnemonic(KeyEvent.VK_P);
		PerfilEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		PerfilEditAbility.setAlignmentX(1.0f);
		menuBarEditAbility.add(PerfilEditAbility);
		
		JMenuItem EditarEditAbility = new JMenuItem("Editar perfil");
		EditarEditAbility.setMnemonic(KeyEvent.VK_E);
		EditarEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		EditarEditAbility.setBorder(new EmptyBorder(2, 6, 2, 2));
		EditarEditAbility.setBackground(Color.WHITE);
		PerfilEditAbility.add(EditarEditAbility);
		
		JMenuItem AlterarEditAbility = new JMenuItem("Alterar senha");
		AlterarEditAbility.setMnemonic(KeyEvent.VK_A);
		AlterarEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		AlterarEditAbility.setBorder(new EmptyBorder(2, 6, 2, 2));
		AlterarEditAbility.setBackground(Color.WHITE);
		PerfilEditAbility.add(AlterarEditAbility);
		
		JButton btnBackEditAbility = new JButton("");
		btnBackEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		
		btnBackEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditAbility.setContentAreaFilled(false);
		btnBackEditAbility.setBorderPainted(false);
		btnBackEditAbility.setBounds(0, 29, 32, 32);
		panelEditAbility.add(btnBackEditAbility);
		
		JLabel lblEditarHabilidade = new JLabel("Editar Habilidade");
		lblEditarHabilidade.setForeground(Color.GRAY);
		lblEditarHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarHabilidade.setBounds(42, 150, 187, 28);
		panelEditAbility.add(lblEditarHabilidade);
		
		JSeparator separatorEditAbility = new JSeparator();
		separatorEditAbility.setName("Menu Principal");
		separatorEditAbility.setBorder(new EmptyBorder(1, 1, 1, 1));
		separatorEditAbility.setBounds(30, 187, 546, 2);
		panelEditAbility.add(separatorEditAbility);
		
		JButton btnUpdateEditAbility = new JButton("Atualizar");
		btnUpdateEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditAbility.setBorder(null);
		btnUpdateEditAbility.setBackground(Color.WHITE);
		btnUpdateEditAbility.setBounds(445, 325, 110, 33);
		panelEditAbility.add(btnUpdateEditAbility);
		
		JLabel labelNomeEditAbility = new JLabel("Nome:");
		labelNomeEditAbility.setForeground(Color.GRAY);
		labelNomeEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNomeEditAbility.setBounds(61, 224, 34, 21);
		panelEditAbility.add(labelNomeEditAbility);
		
		textFieldNomeEditAbility = new JTextField();
		textFieldNomeEditAbility.setText("<nome da habilidade>");
		textFieldNomeEditAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditAbility.setColumns(10);
		textFieldNomeEditAbility.setBackground(Color.WHITE);
		textFieldNomeEditAbility.setBounds(105, 224, 330, 21);
		panelEditAbility.add(textFieldNomeEditAbility);
		
		JLabel labelDescEditAbility = new JLabel("Descri\u00E7\u00E3o:");
		labelDescEditAbility.setForeground(Color.GRAY);
		labelDescEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelDescEditAbility.setBounds(43, 256, 52, 21);
		panelEditAbility.add(labelDescEditAbility);
		
		JEditorPane editorPaneDescEditAbility = new JEditorPane();
		editorPaneDescEditAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		editorPaneDescEditAbility.setBounds(105, 256, 330, 102);
		panelEditAbility.add(editorPaneDescEditAbility);
		
		JButton btnExcludeEditAbility = new JButton("");
		btnExcludeEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditAbility.setContentAreaFilled(false);
		btnExcludeEditAbility.setBorderPainted(false);
		btnExcludeEditAbility.setBounds(523, 146, 32, 32);
		panelEditAbility.add(btnExcludeEditAbility);
		
		JLabel bgEditAbility = new JLabel("");
		bgEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditAbility.setBackground(Color.WHITE);
		bgEditAbility.setBounds(0, 29, 603, 370);
		panelEditAbility.add(bgEditAbility);
		
		//btnBack Listeners
		btnBackNewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackNewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackNewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackViewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackViewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackEditMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackEditCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
		btnBackEditAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) MainMenuFrame.getContentPane().getLayout();
				cardLayout.show(MainMenuFrame.getContentPane(), "MainMenu");
			}
		});
	}
}
