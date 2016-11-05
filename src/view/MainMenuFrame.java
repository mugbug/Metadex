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
		
		//conecta radio buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		MainMenuFrame.getContentPane().setLayout(null);
		
		//menuBar start
		
		JPanel panelMenuBar = new JPanel();
		panelMenuBar.setBounds(0, 0, 598, 30);
		MainMenuFrame.getContentPane().add(panelMenuBar);
		panelMenuBar.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setBackground(Color.WHITE);
		menuBar.setAlignmentY(0.5f);
		menuBar.setBounds(0, 0, 602, 29);
		panelMenuBar.add(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic(KeyEvent.VK_A);
		menuArquivo.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.add(menuArquivo);
		
		JMenuItem menuItemDeslogar = new JMenuItem("Deslogar");
		menuItemDeslogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginFrame window = new LoginFrame();
				window.LoginFrame.setVisible(true);
				MainMenuFrame.dispose();
			}
		});
		menuItemDeslogar.setMnemonic(KeyEvent.VK_D);
		menuItemDeslogar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemDeslogar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemDeslogar.setBackground(Color.WHITE);
		menuArquivo.add(menuItemDeslogar);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.setMnemonic(KeyEvent.VK_S);
		menuItemSair.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemSair.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemSair.setBackground(Color.WHITE);
		menuArquivo.add(menuItemSair);
		
		JMenu menuGerenciar = new JMenu("Gerenciar usu\u00E1rios");
		menuGerenciar.setMnemonic(KeyEvent.VK_G);
		menuGerenciar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.add(menuGerenciar);
		
		JMenu menuPerfil = new JMenu("Perfil");
		menuPerfil.setMnemonic(KeyEvent.VK_P);
		menuPerfil.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuPerfil.setAlignmentX(1.0f);
		menuBar.add(menuPerfil);
		
		JMenuItem menuItemEditar = new JMenuItem("Editar perfil");
		menuItemEditar.setMnemonic(KeyEvent.VK_E);
		menuItemEditar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemEditar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemEditar.setBackground(Color.WHITE);
		menuPerfil.add(menuItemEditar);
		
		JMenuItem menuItemAlterar = new JMenuItem("Alterar senha");
		menuItemAlterar.setMnemonic(KeyEvent.VK_A);
		menuItemAlterar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemAlterar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemAlterar.setBackground(Color.WHITE);
		menuPerfil.add(menuItemAlterar);
		
		//menuBar end
		
		
		JPanel panelContent = new JPanel();
		panelContent.setBounds(0, 30, 598, 375);
		MainMenuFrame.getContentPane().add(panelContent);
		panelContent.setLayout(new CardLayout(0, 0));
		
		JPanel panelMainMenu = new JPanel();
		panelContent.add(panelMainMenu, "MainMenu");
		panelMainMenu.setLayout(null);
		
		JRadioButton radioButtonMH = new JRadioButton("Meta-humano");
		radioButtonMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonMH.setBounds(211, 177, 103, 21);
		panelMainMenu.add(radioButtonMH);
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		radioButtonMH.setSelected(true);
		
		JRadioButton radioButtonC = new JRadioButton("Cidade");
		radioButtonC.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonC.setBounds(359, 177, 63, 21);
		panelMainMenu.add(radioButtonC);
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		
		JRadioButton radioButtonH = new JRadioButton("Habilidade");
		radioButtonH.setOpaque(false);
		radioButtonH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonH.setAlignmentX(0.5f);
		radioButtonH.setBounds(467, 177, 83, 21);
		panelMainMenu.add(radioButtonH);
		buttonGroup.add(radioButtonMH);
		buttonGroup.add(radioButtonC);
		buttonGroup.add(radioButtonH);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 256, 238, 33);
		panelMainMenu.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<lista de meta-humanos>", "ou", "<lista de cidades>"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnEdit = new JButton("Editar");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "EditMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "EditCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "EditAbility");
				}
				else {
					String message = "Selecione um tipo!";
					JOptionPane.showMessageDialog(MainMenuFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEdit.setBounds(318, 300, 110, 33);
		panelMainMenu.add(btnEdit);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JButton btnView = new JButton("Consultar");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "ViewMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "ViewCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "ViewAbility");
				}
				else {
					String message = "Selecione um tipo!";
					JOptionPane.showMessageDialog(MainMenuFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnView.setBounds(446, 300, 110, 33);
		panelMainMenu.add(btnView);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		textFieldRegister = new JTextField();
		textFieldRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldRegister.setBackground(Color.WHITE);
		textFieldRegister.setSelectionColor(new Color(255, 255, 102));
		textFieldRegister.setBounds(40, 257, 238, 33);
		panelMainMenu.add(textFieldRegister);
		textFieldRegister.setColumns(10);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(170, 300, 110, 33);
		panelMainMenu.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioButtonMH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "NewMH");
				}
				else if(radioButtonC.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "NewCity");
				}
				else if(radioButtonH.isSelected()){
					CardLayout cardLayout = (CardLayout) panelContent.getLayout();
					cardLayout.show(panelContent, "NewAbility");
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
		separator_1.setBounds(28, 219, 546, 2);
		panelMainMenu.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator.setName("Menu Principal");
		separator.setBounds(30, 158, 546, 2);
		panelMainMenu.add(separator);
		
		JLabel labelMainMenu = new JLabel("Menu Principal");
		labelMainMenu.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		labelMainMenu.setForeground(Color.GRAY);
		labelMainMenu.setBounds(42, 121, 133, 28);
		panelMainMenu.add(labelMainMenu);
		
		JLabel labelMainMenu1 = new JLabel("Escolha um tipo:");
		labelMainMenu1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu1.setForeground(Color.GRAY);
		labelMainMenu1.setBounds(45, 177, 121, 21);
		panelMainMenu.add(labelMainMenu1);
		
		JLabel labelMainMenu2 = new JLabel("Insira nome para cadastrar:");
		labelMainMenu2.setForeground(Color.GRAY);
		labelMainMenu2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu2.setBounds(47, 232, 145, 14);
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
		labelEditView.setBounds(329, 232, 227, 14);
		panelMainMenu.add(labelEditView);
		
		JLabel bgMainMenu = new JLabel("");
		bgMainMenu.setBounds(0, 0, 602, 370);
		panelMainMenu.add(bgMainMenu);
		bgMainMenu.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));

		JPanel panelNewMH = new JPanel();
		panelContent.add(panelNewMH, "NewMH");
		panelNewMH.setBackground(Color.WHITE);
		panelNewMH.setLayout(null);
		
		JButton btnBackNewMH = new JButton("");
		btnBackNewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewMH.setContentAreaFilled(false);
		btnBackNewMH.setBorderPainted(false);
		btnBackNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewMH.setBounds(0, 0, 32, 32);
		panelNewMH.add(btnBackNewMH);
		
		JButton btnRegisterNewMH = new JButton("Cadastrar");
		btnRegisterNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewMH.setBorder(null);
		btnRegisterNewMH.setBackground(Color.WHITE);
		btnRegisterNewMH.setBounds(444, 296, 110, 33);
		panelNewMH.add(btnRegisterNewMH);
		
		JLabel lblNovoMetahumano = new JLabel("Novo Meta-Humano");
		lblNovoMetahumano.setForeground(Color.GRAY);
		lblNovoMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovoMetahumano.setBounds(42, 121, 187, 28);
		panelNewMH.add(lblNovoMetahumano);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setName("Menu Principal");
		separator_2.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_2.setBounds(30, 158, 546, 2);
		panelNewMH.add(separator_2);
		
		textFieldNomeNewMH = new JTextField();
		textFieldNomeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewMH.setColumns(10);
		textFieldNomeNewMH.setBackground(Color.WHITE);
		textFieldNomeNewMH.setBounds(119, 172, 152, 21);
		panelNewMH.add(textFieldNomeNewMH);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.GRAY);
		lblNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNome.setBounds(58, 172, 34, 21);
		panelNewMH.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.GRAY);
		lblIdade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblIdade.setBounds(60, 197, 32, 21);
		panelNewMH.add(lblIdade);
		
		JLabel lblHabilidade = new JLabel("Habilidade:");
		lblHabilidade.setForeground(Color.GRAY);
		lblHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHabilidade.setBounds(328, 198, 59, 21);
		panelNewMH.add(lblHabilidade);
		
		JLabel lblPrimeiraApario = new JLabel("Primeira apari\u00E7\u00E3o:");
		lblPrimeiraApario.setForeground(Color.GRAY);
		lblPrimeiraApario.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPrimeiraApario.setBounds(296, 173, 91, 21);
		panelNewMH.add(lblPrimeiraApario);
		
		JLabel lblHistria = new JLabel("Hist\u00F3ria:");
		lblHistria.setForeground(Color.GRAY);
		lblHistria.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHistria.setBounds(49, 225, 43, 21);
		panelNewMH.add(lblHistria);
		
		JButton btnFoto = new JButton("Foto");
		btnFoto.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFoto.setBorder(null);
		btnFoto.setBackground(Color.WHITE);
		btnFoto.setBounds(444, 253, 110, 33);
		panelNewMH.add(btnFoto);
		
		textFieldIdadeNewMH = new JTextField();
		textFieldIdadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeNewMH.setColumns(10);
		textFieldIdadeNewMH.setBackground(Color.WHITE);
		textFieldIdadeNewMH.setBounds(119, 198, 152, 21);
		panelNewMH.add(textFieldIdadeNewMH);
		
		JEditorPane editorPaneHistoriaNewMH = new JEditorPane();
		editorPaneHistoriaNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		editorPaneHistoriaNewMH.setBounds(44, 253, 390, 75);
		panelNewMH.add(editorPaneHistoriaNewMH);
		
		JComboBox comboBoxCidadeNewMH = new JComboBox();
		comboBoxCidadeNewMH.setBackground(Color.WHITE);
		comboBoxCidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeNewMH.setBounds(402, 171, 152, 21);
		panelNewMH.add(comboBoxCidadeNewMH);
		
		JComboBox comboBoxHabilidadeNewMH = new JComboBox();
		comboBoxHabilidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeNewMH.setBackground(Color.WHITE);
		comboBoxHabilidadeNewMH.setBounds(402, 198, 152, 21);
		panelNewMH.add(comboBoxHabilidadeNewMH);
		
		JLabel bgNewMH = new JLabel("");
		bgNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewMH.setBackground(Color.WHITE);
		bgNewMH.setBounds(0, 0, 603, 370);
		panelNewMH.add(bgNewMH);
		
		Panel panelNewCity = new Panel();
		panelContent.add(panelNewCity, "NewCity");
		panelNewCity.setLayout(null);
		
		JButton btnBackNewCity = new JButton("");
		
		btnBackNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewCity.setContentAreaFilled(false);
		btnBackNewCity.setBorderPainted(false);
		btnBackNewCity.setBounds(0, 0, 32, 32);
		panelNewCity.add(btnBackNewCity);
		
		JButton btnRegisterNewCity = new JButton("Cadastrar");
		btnRegisterNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewCity.setBorder(null);
		btnRegisterNewCity.setBackground(Color.WHITE);
		btnRegisterNewCity.setBounds(445, 296, 110, 33);
		panelNewCity.add(btnRegisterNewCity);
		
		JLabel lblNovaCidade = new JLabel("Nova Cidade");
		lblNovaCidade.setForeground(Color.GRAY);
		lblNovaCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaCidade.setBounds(42, 121, 187, 28);
		panelNewCity.add(lblNovaCidade);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setName("Menu Principal");
		separator_3.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_3.setBounds(30, 158, 546, 2);
		panelNewCity.add(separator_3);
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_2.setBounds(154, 210, 34, 21);
		panelNewCity.add(label_2);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setForeground(Color.GRAY);
		lblPas.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPas.setBounds(164, 242, 23, 21);
		panelNewCity.add(lblPas);
		
		textFieldNomeNewCity = new JTextField();
		textFieldNomeNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewCity.setColumns(10);
		textFieldNomeNewCity.setBackground(Color.WHITE);
		textFieldNomeNewCity.setBounds(198, 211, 237, 21);
		panelNewCity.add(textFieldNomeNewCity);
		
		textFieldPaisNewCity = new JTextField();
		textFieldPaisNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisNewCity.setColumns(10);
		textFieldPaisNewCity.setBackground(Color.WHITE);
		textFieldPaisNewCity.setBounds(197, 243, 238, 21);
		panelNewCity.add(textFieldPaisNewCity);
		
		JLabel bgNewCity = new JLabel("");
		bgNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewCity.setBackground(Color.WHITE);
		bgNewCity.setBounds(0, 0, 603, 370);
		panelNewCity.add(bgNewCity);
		
		Panel panelNewAbility = new Panel();
		panelContent.add(panelNewAbility, "NewAbility");
		panelNewAbility.setLayout(null);
		
		JButton btnBackNewAbility = new JButton("");
		
		btnBackNewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewAbility.setContentAreaFilled(false);
		btnBackNewAbility.setBorderPainted(false);
		btnBackNewAbility.setBounds(0, 0, 32, 32);
		panelNewAbility.add(btnBackNewAbility);
		
		JLabel lblNovaHabilidade = new JLabel("Nova Habilidade");
		lblNovaHabilidade.setForeground(Color.GRAY);
		lblNovaHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaHabilidade.setBounds(42, 121, 187, 28);
		panelNewAbility.add(lblNovaHabilidade);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setName("Menu Principal");
		separator_4.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_4.setBounds(30, 158, 546, 2);
		panelNewAbility.add(separator_4);
		
		JButton button_4 = new JButton("Cadastrar");
		button_4.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(445, 296, 110, 33);
		panelNewAbility.add(button_4);
		
		JLabel label_3 = new JLabel("Nome:");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_3.setBounds(61, 195, 34, 21);
		panelNewAbility.add(label_3);
		
		textFieldNomeNewAbility = new JTextField();
		textFieldNomeNewAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewAbility.setColumns(10);
		textFieldNomeNewAbility.setBackground(Color.WHITE);
		textFieldNomeNewAbility.setBounds(105, 195, 330, 21);
		panelNewAbility.add(textFieldNomeNewAbility);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setForeground(Color.GRAY);
		lblDescrio.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblDescrio.setBounds(43, 227, 52, 21);
		panelNewAbility.add(lblDescrio);
		
		JEditorPane editorPaneDescNewAbility = new JEditorPane();
		editorPaneDescNewAbility.setBounds(105, 227, 330, 102);
		panelNewAbility.add(editorPaneDescNewAbility);
		
		JLabel bgNewAbility = new JLabel("");
		bgNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewAbility.setBackground(Color.WHITE);
		bgNewAbility.setBounds(0, 0, 603, 370);
		panelNewAbility.add(bgNewAbility);
		
		JPanel panelViewMH = new JPanel();
		panelContent.add(panelViewMH, "ViewMH");
		panelViewMH.setLayout(null);
		
		JButton btnBackViewMH = new JButton("");
		btnBackViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackViewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewMH.setContentAreaFilled(false);
		btnBackViewMH.setBorderPainted(false);
		btnBackViewMH.setBounds(0, 0, 32, 32);
		panelViewMH.add(btnBackViewMH);
		
		JLabel lblNomeIdadeViewMH = new JLabel("<nome>, <idade>");
		lblNomeIdadeViewMH.setForeground(Color.GRAY);
		lblNomeIdadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeIdadeViewMH.setBounds(42, 121, 392, 28);
		panelViewMH.add(lblNomeIdadeViewMH);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setName("Menu Principal");
		separator_5.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_5.setBounds(30, 158, 546, 2);
		panelViewMH.add(separator_5);
		
		JButton btnEditViewMH = new JButton("");
		btnEditViewMH.setContentAreaFilled(false);
		btnEditViewMH.setBorderPainted(false);
		btnEditViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewMH.setBorder(null);
		btnEditViewMH.setBackground(Color.WHITE);
		btnEditViewMH.setBounds(522, 118, 32, 32);
		panelViewMH.add(btnEditViewMH);
		
		JLabel label_7 = new JLabel("Habilidade:");
		label_7.setForeground(Color.GRAY);
		label_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_7.setBounds(245, 308, 59, 21);
		panelViewMH.add(label_7);
		
		JLabel label_8 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_8.setBounds(213, 283, 91, 21);
		panelViewMH.add(label_8);
		
		JLabel label_9 = new JLabel("Hist\u00F3ria:");
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_9.setBounds(213, 171, 43, 21);
		panelViewMH.add(label_9);
		
		JLabel lblCidadeViewMH = new JLabel("<cidade>");
		lblCidadeViewMH.setForeground(Color.BLACK);
		lblCidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblCidadeViewMH.setBounds(314, 283, 238, 21);
		panelViewMH.add(lblCidadeViewMH);
		
		JLabel lblHabilidadeViewMH = new JLabel("<habilidade>");
		lblHabilidadeViewMH.setForeground(Color.BLACK);
		lblHabilidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblHabilidadeViewMH.setBounds(314, 308, 240, 21);
		panelViewMH.add(lblHabilidadeViewMH);
		
		JLabel lblFoto = new JLabel("Foto 150x150");
		lblFoto.setBackground(Color.DARK_GRAY);
		lblFoto.setBorder(new EmptyBorder(1, 1, 1, 1));
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setForeground(Color.WHITE);
		lblFoto.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblFoto.setBounds(53, 178, 150, 150);
		panelViewMH.add(lblFoto);
		
		JEditorPane editorPaneHistoriaViewMH = new JEditorPane();
		editorPaneHistoriaViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		editorPaneHistoriaViewMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		editorPaneHistoriaViewMH.setEditable(false);
		editorPaneHistoriaViewMH.setBackground(new Color(220, 220, 220));
		editorPaneHistoriaViewMH.setBounds(213, 190, 341, 82);
		panelViewMH.add(editorPaneHistoriaViewMH);
		
		JLabel bgViewMH = new JLabel("");
		bgViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewMH.setBackground(Color.WHITE);
		bgViewMH.setBounds(0, 0, 603, 370);
		panelViewMH.add(bgViewMH);
		
		JPanel panelViewCity = new JPanel();
		panelContent.add(panelViewCity, "ViewCity");
		panelViewCity.setBackground(Color.WHITE);
		panelViewCity.setLayout(null);
		
		JButton btnBackViewCity = new JButton("");
		btnBackViewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewCity.setContentAreaFilled(false);
		btnBackViewCity.setBorderPainted(false);
		btnBackViewCity.setBounds(0, 0, 32, 32);
		panelViewCity.add(btnBackViewCity);
		
		JButton btnEditViewCity = new JButton("");
		btnEditViewCity.setContentAreaFilled(false);
		btnEditViewCity.setBorderPainted(false);
		btnEditViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewCity.setBorder(null);
		btnEditViewCity.setBackground(Color.WHITE);
		btnEditViewCity.setBounds(507, 117, 32, 32);
		panelViewCity.add(btnEditViewCity);
		
		JLabel lblNomePaisViewCity = new JLabel("<cidade>, <pa\u00EDs>");
		lblNomePaisViewCity.setForeground(Color.GRAY);
		lblNomePaisViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomePaisViewCity.setBounds(42, 121, 187, 28);
		panelViewCity.add(lblNomePaisViewCity);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setName("Menu Principal");
		separator_6.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_6.setBounds(30, 158, 546, 2);
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
		tableViewCity.setBounds(63, 171, 476, 156);
		panelViewCity.add(tableViewCity);
		
		JLabel bgViewCity = new JLabel("");
		bgViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewCity.setBackground(Color.WHITE);
		bgViewCity.setBounds(0, 0, 603, 370);
		panelViewCity.add(bgViewCity);
		
		Panel panelViewAbility = new Panel();
		panelContent.add(panelViewAbility, "ViewAbility");
		panelViewAbility.setLayout(null);
		
		JButton btnBackViewAbility = new JButton("");
		btnBackViewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewAbility.setContentAreaFilled(false);
		btnBackViewAbility.setBorderPainted(false);
		btnBackViewAbility.setBounds(0, 0, 32, 32);
		panelViewAbility.add(btnBackViewAbility);
		
		JButton btnEditViewAbility = new JButton("");
		btnEditViewAbility.setContentAreaFilled(false);
		btnEditViewAbility.setBorderPainted(false);
		btnEditViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewAbility.setBorder(null);
		btnEditViewAbility.setBackground(Color.WHITE);
		btnEditViewAbility.setBounds(527, 117, 32, 32);
		panelViewAbility.add(btnEditViewAbility);
		
		JLabel lblNomeViewAbility = new JLabel("<habilidade>");
		lblNomeViewAbility.setForeground(Color.GRAY);
		lblNomeViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeViewAbility.setBounds(42, 121, 187, 28);
		panelViewAbility.add(lblNomeViewAbility);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setName("Menu Principal");
		separator_7.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_7.setBounds(30, 158, 546, 2);
		panelViewAbility.add(separator_7);
		
		JEditorPane editorPaneDescViewAbility = new JEditorPane();
		editorPaneDescViewAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		editorPaneDescViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		editorPaneDescViewAbility.setEditable(false);
		editorPaneDescViewAbility.setBackground(new Color(220, 220, 220));
		editorPaneDescViewAbility.setBounds(85, 195, 432, 120);
		panelViewAbility.add(editorPaneDescViewAbility);
		
		JLabel bgViewAbility = new JLabel("");
		bgViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewAbility.setBackground(Color.WHITE);
		bgViewAbility.setBounds(0, 0, 603, 370);
		panelViewAbility.add(bgViewAbility);
		
		Panel panelEditMH = new Panel();
		panelContent.add(panelEditMH, "EditMH");
		panelEditMH.setLayout(null);
		
		JButton btnBackEditMH = new JButton("");
		btnBackEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditMH.setContentAreaFilled(false);
		btnBackEditMH.setBorderPainted(false);
		btnBackEditMH.setBounds(0, 0, 32, 32);
		panelEditMH.add(btnBackEditMH);
		
		JButton btnUpdateEditMH = new JButton("Atualizar");
		btnUpdateEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditMH.setBorder(null);
		btnUpdateEditMH.setBackground(Color.WHITE);
		btnUpdateEditMH.setBounds(444, 296, 110, 33);
		panelEditMH.add(btnUpdateEditMH);
		
		JLabel lblEditarMetahumano = new JLabel("Editar Meta-Humano");
		lblEditarMetahumano.setForeground(Color.GRAY);
		lblEditarMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarMetahumano.setBounds(42, 121, 187, 28);
		panelEditMH.add(lblEditarMetahumano);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setName("Menu Principal");
		separator_8.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_8.setBounds(30, 158, 546, 2);
		panelEditMH.add(separator_8);
		
		JLabel label_10 = new JLabel("Nome:");
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_10.setBounds(58, 172, 34, 21);
		panelEditMH.add(label_10);
		
		JLabel label_14 = new JLabel("Idade:");
		label_14.setForeground(Color.GRAY);
		label_14.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_14.setBounds(60, 197, 32, 21);
		panelEditMH.add(label_14);
		
		JLabel label_16 = new JLabel("Habilidade:");
		label_16.setForeground(Color.GRAY);
		label_16.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_16.setBounds(328, 198, 59, 21);
		panelEditMH.add(label_16);
		
		JLabel label_17 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_17.setForeground(Color.GRAY);
		label_17.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_17.setBounds(296, 173, 91, 21);
		panelEditMH.add(label_17);
		
		JLabel label_18 = new JLabel("Hist\u00F3ria:");
		label_18.setForeground(Color.GRAY);
		label_18.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_18.setBounds(49, 225, 43, 21);
		panelEditMH.add(label_18);
		
		JButton btnFotoEditMH = new JButton("Foto");
		btnFotoEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFotoEditMH.setBorder(null);
		btnFotoEditMH.setBackground(Color.WHITE);
		btnFotoEditMH.setBounds(444, 253, 110, 33);
		panelEditMH.add(btnFotoEditMH);
		
		textFieldNomeEditMH = new JTextField();
		textFieldNomeEditMH.setText("<nome>");
		textFieldNomeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeEditMH.setColumns(10);
		textFieldNomeEditMH.setBackground(Color.WHITE);
		textFieldNomeEditMH.setBounds(119, 172, 152, 21);
		panelEditMH.add(textFieldNomeEditMH);
		
		textFieldIdadeEditMH = new JTextField();
		textFieldIdadeEditMH.setText("<idade>");
		textFieldIdadeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeEditMH.setColumns(10);
		textFieldIdadeEditMH.setBackground(Color.WHITE);
		textFieldIdadeEditMH.setBounds(119, 198, 152, 21);
		panelEditMH.add(textFieldIdadeEditMH);
		
		JEditorPane textFieldHistoriaEditMH = new JEditorPane();
		textFieldHistoriaEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldHistoriaEditMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		textFieldHistoriaEditMH.setBounds(44, 253, 390, 75);
		panelEditMH.add(textFieldHistoriaEditMH);
		
		JComboBox comboBoxCidadeEditMH = new JComboBox();
		comboBoxCidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeEditMH.setBackground(Color.WHITE);
		comboBoxCidadeEditMH.setBounds(402, 171, 152, 21);
		panelEditMH.add(comboBoxCidadeEditMH);
		
		JComboBox comboBoxHabilidadeEditMH = new JComboBox();
		comboBoxHabilidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeEditMH.setBackground(Color.WHITE);
		comboBoxHabilidadeEditMH.setBounds(402, 198, 152, 21);
		panelEditMH.add(comboBoxHabilidadeEditMH);
		
		JButton btnExcludeEditMH = new JButton("");
		btnExcludeEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditMH.setContentAreaFilled(false);
		btnExcludeEditMH.setBorderPainted(false);
		btnExcludeEditMH.setBounds(522, 117, 32, 32);
		panelEditMH.add(btnExcludeEditMH);
		
		JLabel bgEditMH = new JLabel("");
		bgEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditMH.setBackground(Color.WHITE);
		bgEditMH.setBounds(0, 0, 603, 370);
		panelEditMH.add(bgEditMH);
		
		Panel panelEditCity = new Panel();
		panelContent.add(panelEditCity, "EditCity");
		panelEditCity.setLayout(null);
		
		JButton btnBackEditCity = new JButton("");
		btnBackEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditCity.setContentAreaFilled(false);
		btnBackEditCity.setBorderPainted(false);
		btnBackEditCity.setBounds(0, 0, 32, 32);
		panelEditCity.add(btnBackEditCity);
		
		JButton btnUpdateEditCity = new JButton("Atualizar");
		btnUpdateEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditCity.setBorder(null);
		btnUpdateEditCity.setBackground(Color.WHITE);
		btnUpdateEditCity.setBounds(445, 296, 110, 33);
		panelEditCity.add(btnUpdateEditCity);
		
		JLabel lblEditarCidade = new JLabel("Editar Cidade");
		lblEditarCidade.setForeground(Color.GRAY);
		lblEditarCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarCidade.setBounds(42, 121, 187, 28);
		panelEditCity.add(lblEditarCidade);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setName("Menu Principal");
		separator_9.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_9.setBounds(30, 158, 546, 2);
		panelEditCity.add(separator_9);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setForeground(Color.GRAY);
		labelNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNome.setBounds(154, 210, 34, 21);
		panelEditCity.add(labelNome);
		
		JLabel labelPais = new JLabel("Pa\u00EDs:");
		labelPais.setForeground(Color.GRAY);
		labelPais.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelPais.setBounds(164, 242, 23, 21);
		panelEditCity.add(labelPais);
		
		textFieldNomeEditCity = new JTextField();
		textFieldNomeEditCity.setText("<nome da cidade>");
		textFieldNomeEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditCity.setColumns(10);
		textFieldNomeEditCity.setBackground(Color.WHITE);
		textFieldNomeEditCity.setBounds(198, 211, 237, 21);
		panelEditCity.add(textFieldNomeEditCity);
		
		textFieldPaisEditCity = new JTextField();
		textFieldPaisEditCity.setText("<nome do pa\u00EDs>");
		textFieldPaisEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisEditCity.setColumns(10);
		textFieldPaisEditCity.setBackground(Color.WHITE);
		textFieldPaisEditCity.setBounds(197, 243, 238, 21);
		panelEditCity.add(textFieldPaisEditCity);
		
		JButton btnExcludeEditCity = new JButton("");
		btnExcludeEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditCity.setContentAreaFilled(false);
		btnExcludeEditCity.setBorderPainted(false);
		btnExcludeEditCity.setBounds(523, 117, 32, 32);
		panelEditCity.add(btnExcludeEditCity);
		
		JLabel bgEditCity = new JLabel("");
		bgEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditCity.setBackground(Color.WHITE);
		bgEditCity.setBounds(0, 0, 603, 370);
		panelEditCity.add(bgEditCity);
		
		Panel panelEditAbility = new Panel();
		panelContent.add(panelEditAbility, "EditAbility");
		panelEditAbility.setLayout(null);
		
		JButton btnBackEditAbility = new JButton("");
		btnBackEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		
		btnBackEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditAbility.setContentAreaFilled(false);
		btnBackEditAbility.setBorderPainted(false);
		btnBackEditAbility.setBounds(0, 0, 32, 32);
		panelEditAbility.add(btnBackEditAbility);
		
		JLabel lblEditarHabilidade = new JLabel("Editar Habilidade");
		lblEditarHabilidade.setForeground(Color.GRAY);
		lblEditarHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarHabilidade.setBounds(42, 121, 187, 28);
		panelEditAbility.add(lblEditarHabilidade);
		
		JSeparator separatorEditAbility = new JSeparator();
		separatorEditAbility.setName("Menu Principal");
		separatorEditAbility.setBorder(new EmptyBorder(1, 1, 1, 1));
		separatorEditAbility.setBounds(30, 158, 546, 2);
		panelEditAbility.add(separatorEditAbility);
		
		JButton btnUpdateEditAbility = new JButton("Atualizar");
		btnUpdateEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditAbility.setBorder(null);
		btnUpdateEditAbility.setBackground(Color.WHITE);
		btnUpdateEditAbility.setBounds(445, 296, 110, 33);
		panelEditAbility.add(btnUpdateEditAbility);
		
		JLabel labelNomeEditAbility = new JLabel("Nome:");
		labelNomeEditAbility.setForeground(Color.GRAY);
		labelNomeEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNomeEditAbility.setBounds(61, 195, 34, 21);
		panelEditAbility.add(labelNomeEditAbility);
		
		textFieldNomeEditAbility = new JTextField();
		textFieldNomeEditAbility.setText("<nome da habilidade>");
		textFieldNomeEditAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditAbility.setColumns(10);
		textFieldNomeEditAbility.setBackground(Color.WHITE);
		textFieldNomeEditAbility.setBounds(105, 195, 330, 21);
		panelEditAbility.add(textFieldNomeEditAbility);
		
		JLabel labelDescEditAbility = new JLabel("Descri\u00E7\u00E3o:");
		labelDescEditAbility.setForeground(Color.GRAY);
		labelDescEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelDescEditAbility.setBounds(43, 227, 52, 21);
		panelEditAbility.add(labelDescEditAbility);
		
		JEditorPane editorPaneDescEditAbility = new JEditorPane();
		editorPaneDescEditAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		editorPaneDescEditAbility.setBounds(105, 227, 330, 102);
		panelEditAbility.add(editorPaneDescEditAbility);
		
		JButton btnExcludeEditAbility = new JButton("");
		btnExcludeEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditAbility.setContentAreaFilled(false);
		btnExcludeEditAbility.setBorderPainted(false);
		btnExcludeEditAbility.setBounds(523, 117, 32, 32);
		panelEditAbility.add(btnExcludeEditAbility);
		
		JLabel bgEditAbility = new JLabel("");
		bgEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditAbility.setBackground(Color.WHITE);
		bgEditAbility.setBounds(0, 0, 603, 370);
		panelEditAbility.add(bgEditAbility);
		btnBackEditAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackEditCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackEditMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackViewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackViewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackNewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		btnBackNewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
		
		//btnBack Listeners
		btnBackNewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cardLayout = (CardLayout) panelContent.getLayout();
				cardLayout.show(panelContent, "MainMenu");
			}
		});
	}
}
