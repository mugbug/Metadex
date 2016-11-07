package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.CardLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;

import java.awt.Panel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.AbilityDao;
import controller.AbilityDaoData;
import controller.CityDao;
import controller.CityDaoData;
import controller.ImageOpener;
import controller.MetaHumanDao;
import controller.MetaHumanDaoData;
import controller.PaneSwitcher;
import controller.UserDao;
import controller.UserDaoData;
import model.Ability;
import model.City;
import model.MetaHuman;
import model.User;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JPasswordField;

public class MainMenuFrame extends PaneSwitcher{

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
	private JTextField textFieldNomeProfile;
	private JTextField textFieldEmailProfile;
	private JPasswordField textFieldSenhaAtualProfile;
	private JPasswordField textFieldNovaSenhaProfile_1;
	private JPasswordField textFieldNovaSenhaProfile_2;
	private JLabel lblNomeViewMH;
	private JEditorPane textFieldHistoriaEditMH;
	private JComboBox<String> comboBoxHabilidadeEditMH;
	private JComboBox<String> comboBoxCidadeEditMH;
	private JButton btnFotoEditMH;
	private JEditorPane lblHistoriaViewMH;
	private JLabel lblCidadeViewMH;
	private JLabel lblHabilidadeViewMH;
	private JLabel lblFotoViewMH;
	private JComboBox<String> comboBoxHabilidadeNewMH;
	private JComboBox<String> comboBoxCidadeNewMH;
	private JComboBox<String> comboBoxMainMenu;
	private JEditorPane textFieldHistoriaNewMH;
	private JEditorPane textFieldDescNewAbility;
	private JLabel lblNomePaisViewCity;
	private JLabel lblNomeViewAbility;
	private JEditorPane lblDescViewAbility;
	private JEditorPane textFieldDescEditAbility;
	
	
//database
	private UserDao users = new UserDaoData();
	private MetaHumanDao metaHumans = new MetaHumanDaoData();
	private CityDao cities = new CityDaoData();
	private AbilityDao abilities = new AbilityDaoData();
	
//variaveis
	//metaHuman
	private ImageIcon iconNewMH = new ImageIcon();
	private String nomeNewMH, idadeNewMH, cidadeNewMH, habilidadeNewMH, historiaNewMH;
	private String nomeViewMH, idadeViewMH, cidadeViewMH, habilidadeViewMH, historiaViewMH;
	private String nomeEditMH, idadeEditMH, cidadeEditMH, habilidadeEditMH, historiaEditMH;
	//city
	private String nomeNewCity, paisNewCity;
	private String nomeViewCity, paisViewCity;
	private String nomeEditCity, paisEditCity;
	//ability
	private String nomeNewAbility, descNewAbility;
	private String nomeViewAbility, descViewAbility;
	private String nomeEditAbility, descEditAbility;
//tabela
	
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
		
		JPanel contentPane = new JPanel();
		contentPane.setBounds(0, 30, 598, 375);
		MainMenuFrame.getContentPane().add(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
	//TODO menuBar starts
		JPanel menuBarPane = new JPanel();
		menuBarPane.setBounds(0, 0, 598, 30);
		MainMenuFrame.getContentPane().add(menuBarPane);
		menuBarPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuBar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menuBar.setBackground(Color.WHITE);
		menuBar.setAlignmentY(0.5f);
		menuBar.setBounds(0, 0, 602, 29);
		menuBarPane.add(menuBar);
		
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
		
		JMenuItem menuItemGerenciar = new JMenuItem("Gerenciar Usu\u00E1rios");
		menuItemGerenciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showViewUsers(contentPane);
			}
		});
		menuItemGerenciar.setMnemonic(KeyEvent.VK_G);
		menuItemGerenciar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemGerenciar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemGerenciar.setBackground(Color.WHITE);
		menuArquivo.add(menuItemGerenciar);
		menuItemDeslogar.setMnemonic(KeyEvent.VK_D);
		menuItemDeslogar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemDeslogar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemDeslogar.setBackground(Color.WHITE);
		menuArquivo.add(menuItemDeslogar);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuFrame.dispose();
			}
		});
		menuItemSair.setMnemonic(KeyEvent.VK_S);
		menuItemSair.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemSair.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemSair.setBackground(Color.WHITE);
		menuArquivo.add(menuItemSair);
		
		JMenu menuPerfil = new JMenu("Perfil");
		menuPerfil.setMnemonic(KeyEvent.VK_P);
		menuPerfil.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuPerfil.setAlignmentX(1.0f);
		menuBar.add(menuPerfil);
		
		JMenuItem menuItemEditar = new JMenuItem("Editar Perfil");
		menuItemEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showProfile(contentPane);
			}
		});
		menuItemEditar.setMnemonic(KeyEvent.VK_E);
		menuItemEditar.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		menuItemEditar.setBorder(new EmptyBorder(2, 6, 2, 2));
		menuItemEditar.setBackground(Color.WHITE);
		menuPerfil.add(menuItemEditar);
	//menuBar ends
	//TODO mainMenu starts
		JPanel mainMenuPane = new JPanel();
		contentPane.add(mainMenuPane, "MainMenu");
		mainMenuPane.setLayout(null);
		
		//conecta radio buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		MainMenuFrame.getContentPane().setLayout(null);
		
		JRadioButton radioButtonMH = new JRadioButton("Meta-humano");
		radioButtonMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonMH.setBounds(211, 177, 103, 21);
		mainMenuPane.add(radioButtonMH);
		radioButtonMH.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonMH.setOpaque(false);
		radioButtonMH.setSelected(true);
		
		JRadioButton radioButtonC = new JRadioButton("Cidade");
		radioButtonC.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonC.setBounds(359, 177, 63, 21);
		mainMenuPane.add(radioButtonC);
		radioButtonC.setAlignmentX(Component.CENTER_ALIGNMENT);
		radioButtonC.setOpaque(false);
		
		JRadioButton radioButtonH = new JRadioButton("Habilidade");
		radioButtonH.setOpaque(false);
		radioButtonH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		radioButtonH.setAlignmentX(0.5f);
		radioButtonH.setBounds(467, 177, 83, 21);
		mainMenuPane.add(radioButtonH);
		buttonGroup.add(radioButtonMH);
		buttonGroup.add(radioButtonC);
		buttonGroup.add(radioButtonH);
		
		textFieldRegister = new JTextField();
		textFieldRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldRegister.setBackground(Color.WHITE);
		textFieldRegister.setSelectionColor(new Color(255, 255, 102));
		textFieldRegister.setBounds(40, 257, 238, 33);
		mainMenuPane.add(textFieldRegister);
		textFieldRegister.setColumns(10);
		
		JButton btnRegister = new JButton("Cadastrar");
		btnRegister.setBounds(170, 300, 110, 33);
		mainMenuPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textFieldRegister.getText();
				if(radioButtonMH.isSelected()){
					textFieldNomeNewMH.setText(nome);
					comboBoxCidadeNewMH.setModel(new DefaultComboBoxModel<String>(cities.getNames()));
					comboBoxHabilidadeNewMH.setModel(new DefaultComboBoxModel<String>(abilities.getNames()));
					showNewMH(contentPane);
					textFieldRegister.setText(null);
				}
				else if(radioButtonC.isSelected()){
					textFieldNomeNewCity.setText(nome);
					showNewCity(contentPane);
					textFieldRegister.setText(null);
				}
				else if(radioButtonH.isSelected()){
					textFieldNomeNewAbility.setText(nome);
					showNewAbility(contentPane);
					textFieldRegister.setText(null);
				}
			}
		});
		
		btnRegister.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegister.setBorder(null);
		btnRegister.setBackground(Color.WHITE);
		
		comboBoxMainMenu = new JComboBox<String>();
		comboBoxMainMenu.setBounds(318, 256, 238, 33);
		mainMenuPane.add(comboBoxMainMenu);
		comboBoxMainMenu.setBackground(Color.WHITE);
		comboBoxMainMenu.setBorder(null);
		comboBoxMainMenu.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		//TODO
		JButton btnEdit = new JButton("Editar");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					nomeEditMH = (String)comboBoxMainMenu.getSelectedItem();
					MetaHuman mh = metaHumans.getMetaHuman(nomeEditMH);
					textFieldNomeEditMH.setText(nomeEditMH);
					textFieldIdadeEditMH.setText(mh.getAge());
					textFieldHistoriaEditMH.setText(mh.getHistory());
					//update comboboxes
					comboBoxCidadeEditMH.setModel(new DefaultComboBoxModel<String>(cities.getNames()));
					comboBoxHabilidadeEditMH.setModel(new DefaultComboBoxModel<String>(abilities.getNames()));
					//FIXME comboboxes
					comboBoxCidadeEditMH.setSelectedIndex(getComboBoxIndex(1, mh.getHomeTown()));
					comboBoxHabilidadeEditMH.setSelectedIndex(getComboBoxIndex(2, mh.getAbility()));
					showEditMH(contentPane);
				}
				else if(radioButtonC.isSelected()){
					nomeEditCity = (String)comboBoxMainMenu.getSelectedItem();
					City c = cities.getCity(nomeEditCity);
					textFieldNomeEditCity.setText(c.getName());
					textFieldPaisEditCity.setText(c.getCountry());
					showEditCity(contentPane);
				}
				else if(radioButtonH.isSelected()){
					nomeEditAbility = (String)comboBoxMainMenu.getSelectedItem();
					Ability a = abilities.getAbility(nomeEditAbility);
					textFieldNomeEditAbility.setText(a.getName());
					textFieldDescEditAbility.setText(a.getDescription());
					showEditAbility(contentPane);
				}
			}
		});
		btnEdit.setBounds(318, 300, 110, 33);
		mainMenuPane.add(btnEdit);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBorder(null);
		btnEdit.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		//TODO
		JButton btnView = new JButton("Consultar");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButtonMH.isSelected()){
					nomeViewMH = (String) comboBoxMainMenu.getSelectedItem();
					MetaHuman mh = metaHumans.getMetaHuman(nomeViewMH);
					idadeViewMH = mh.getAge();
					lblNomeViewMH.setText(nomeViewMH + ", " + idadeViewMH);
					lblHistoriaViewMH.setText(mh.getHistory());
					lblHabilidadeViewMH.setText(mh.getAbility());
					lblCidadeViewMH.setText(mh.getHomeTown());
					lblFotoViewMH.setText(null);
					lblFotoViewMH.setIcon(mh.getImage());
					showViewMH(contentPane);
				}
				else if(radioButtonC.isSelected()){
					nomeViewCity = (String) comboBoxMainMenu.getSelectedItem();
					City c = cities.getCity(nomeViewCity);
					paisViewCity = c.getCountry();
					lblNomePaisViewCity.setText(nomeViewCity + ", " + paisViewCity);
					tableViewCity.setModel(getTableData());
					showViewCity(contentPane);
				}
				else if(radioButtonH.isSelected()){
					nomeViewAbility = (String) comboBoxMainMenu.getSelectedItem();
					Ability a = abilities.getAbility(nomeViewAbility);
					lblNomeViewAbility.setText(nomeViewAbility);
					lblDescViewAbility.setText(a.getDescription());
					showViewAbility(contentPane);
				}
			}
		});
		btnView.setBounds(446, 300, 110, 33);
		mainMenuPane.add(btnView);
		btnView.setBackground(Color.WHITE);
		btnView.setBorder(null);
		btnView.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setEnabled(false);
		separator_1.setBounds(28, 219, 546, 2);
		mainMenuPane.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator.setBounds(30, 158, 546, 2);
		mainMenuPane.add(separator);
		
		JLabel labelMainMenu = new JLabel("Menu Principal");
		labelMainMenu.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		labelMainMenu.setForeground(Color.GRAY);
		labelMainMenu.setBounds(42, 121, 133, 28);
		mainMenuPane.add(labelMainMenu);
		
		JLabel labelMainMenu1 = new JLabel("Escolha um tipo:");
		labelMainMenu1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu1.setForeground(Color.GRAY);
		labelMainMenu1.setBounds(45, 177, 121, 21);
		mainMenuPane.add(labelMainMenu1);
		
		JLabel labelMainMenu2 = new JLabel("Insira nome para cadastrar:");
		labelMainMenu2.setForeground(Color.GRAY);
		labelMainMenu2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelMainMenu2.setBounds(47, 232, 145, 14);
		mainMenuPane.add(labelMainMenu2);
		
		JLabel labelEditView = new JLabel("Escolha um Meta-Humano:");
		
		//altera label e combobox de acordo com radio buttons		
		radioButtonMH.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha um Meta-Humano:");
				comboBoxMainMenu.setModel(new DefaultComboBoxModel(metaHumans.getNames()));
			}
		});
		radioButtonC.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha uma Cidade:");
				comboBoxMainMenu.setModel(new DefaultComboBoxModel(cities.getNames()));
			}
		});
		radioButtonH.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				labelEditView.setText("Escolha uma Habilidade:");
				comboBoxMainMenu.setModel(new DefaultComboBoxModel(abilities.getNames()));
			}
		});
		
		labelEditView.setForeground(Color.GRAY);
		labelEditView.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelEditView.setBounds(329, 232, 227, 14);
		mainMenuPane.add(labelEditView);
		
		JLabel bgMainMenu = new JLabel("");
		bgMainMenu.setBounds(0, 0, 602, 370);
		mainMenuPane.add(bgMainMenu);
		bgMainMenu.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
	//mainMenuPane ends
	//TODO newMetaHuman starts
		JPanel newMHPane = new JPanel();
		contentPane.add(newMHPane, "NewMH");
		newMHPane.setBackground(Color.WHITE);
		newMHPane.setLayout(null);
		
		textFieldNomeNewMH = new JTextField();
		textFieldNomeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewMH.setColumns(10);
		textFieldNomeNewMH.setBackground(Color.WHITE);
		textFieldNomeNewMH.setBounds(119, 172, 152, 21);
		newMHPane.add(textFieldNomeNewMH);
		
		JButton btnFotoNewMH = new JButton("Foto");
		btnFotoNewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"Image Files", "jpg", "png", "gif", "jpeg");
				JFileChooser fc = new JFileChooser();
				fc.setFileFilter(filter);
				fc.setCurrentDirectory(new File(System.getProperty("user.home") 
						+ System.getProperty("file.separator")+ "Desktop" 
						+ System.getProperty("file.separator")+ "metadex_fotos"));
				//Handle open button action.
			    if (arg0.getSource() == btnFotoNewMH) {
			        int returnVal = fc.showOpenDialog(btnFotoNewMH);

			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			            File file = fc.getSelectedFile();
			            //This is where a real application would open the file.
			            btnFotoNewMH.setText(fc.getName(file)); //altera nome do botao para nome do arquivo
			            BufferedImage img = null;
			            try {
			                img = ImageIO.read(file);
			            } catch (IOException ioe) {
			            }
			            iconNewMH.setImage(img);
			        }
			   }
			}
		});
		
		textFieldIdadeNewMH = new JTextField();
		textFieldIdadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeNewMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeNewMH.setColumns(10);
		textFieldIdadeNewMH.setBackground(Color.WHITE);
		textFieldIdadeNewMH.setBounds(119, 198, 152, 21);
		newMHPane.add(textFieldIdadeNewMH);
		
		textFieldHistoriaNewMH = new JEditorPane();
		textFieldHistoriaNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldHistoriaNewMH.setBounds(44, 253, 390, 75);
		newMHPane.add(textFieldHistoriaNewMH);
		
		comboBoxCidadeNewMH = new JComboBox<String>();
		comboBoxCidadeNewMH.setModel(new DefaultComboBoxModel<String>(cities.getNames()));
		comboBoxCidadeNewMH.setBackground(Color.WHITE);
		comboBoxCidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeNewMH.setBounds(402, 171, 152, 21);
		newMHPane.add(comboBoxCidadeNewMH);
		
		comboBoxHabilidadeNewMH = new JComboBox<String>();
		comboBoxHabilidadeNewMH.setModel(new DefaultComboBoxModel<String>(abilities.getNames()));
		comboBoxHabilidadeNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeNewMH.setBackground(Color.WHITE);
		comboBoxHabilidadeNewMH.setBounds(402, 198, 152, 21);
		newMHPane.add(comboBoxHabilidadeNewMH);
		btnFotoNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFotoNewMH.setBorder(null);
		btnFotoNewMH.setBackground(Color.WHITE);
		btnFotoNewMH.setBounds(444, 253, 110, 33);
		newMHPane.add(btnFotoNewMH);

		JButton btnRegisterNewMH = new JButton("Cadastrar");
		btnRegisterNewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pega os dados para cadastro
				nomeNewMH = textFieldNomeNewMH.getText();
				idadeNewMH = textFieldIdadeNewMH.getText();
				cidadeNewMH = (String) comboBoxCidadeNewMH.getSelectedItem();
				habilidadeNewMH = (String) comboBoxHabilidadeNewMH.getSelectedItem();
				historiaNewMH = textFieldHistoriaNewMH.getText();
				//adiciona novo metahumano
				MetaHuman mh = new MetaHuman(nomeNewMH, idadeNewMH, iconNewMH, habilidadeNewMH, cidadeNewMH, historiaNewMH);
				metaHumans.addMetaHuman(mh);
				//limpa campos
				textFieldNomeNewMH.setText(null);
				textFieldIdadeNewMH.setText(null);
				comboBoxCidadeNewMH.setSelectedIndex(0);
				comboBoxHabilidadeNewMH.setSelectedIndex(0);
				btnFotoNewMH.setText("Foto");
				textFieldHistoriaNewMH.setText(null);
				//volta pro menu principal
				showMainMenu(contentPane);
			}
		});
		btnRegisterNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewMH.setBorder(null);
		btnRegisterNewMH.setBackground(Color.WHITE);
		btnRegisterNewMH.setBounds(444, 296, 110, 33);
		newMHPane.add(btnRegisterNewMH);
		
		JButton btnBackNewMH = new JButton("");
		btnBackNewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewMH.setContentAreaFilled(false);
		btnBackNewMH.setBorderPainted(false);
		btnBackNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewMH.setBounds(0, 0, 32, 32);
		newMHPane.add(btnBackNewMH);
		
		btnBackNewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblNovoMetahumano = new JLabel("Novo Meta-Humano");
		lblNovoMetahumano.setForeground(Color.GRAY);
		lblNovoMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovoMetahumano.setBounds(42, 121, 187, 28);
		newMHPane.add(lblNovoMetahumano);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_2.setBounds(30, 158, 546, 2);
		newMHPane.add(separator_2);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.GRAY);
		lblNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNome.setBounds(58, 172, 34, 21);
		newMHPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.GRAY);
		lblIdade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblIdade.setBounds(60, 197, 32, 21);
		newMHPane.add(lblIdade);
		
		JLabel lblHabilidade = new JLabel("Habilidade:");
		lblHabilidade.setForeground(Color.GRAY);
		lblHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHabilidade.setBounds(328, 198, 59, 21);
		newMHPane.add(lblHabilidade);
		
		JLabel lblPrimeiraApario = new JLabel("Primeira apari\u00E7\u00E3o:");
		lblPrimeiraApario.setForeground(Color.GRAY);
		lblPrimeiraApario.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPrimeiraApario.setBounds(296, 173, 91, 21);
		newMHPane.add(lblPrimeiraApario);
		
		JLabel lblHistria = new JLabel("Hist\u00F3ria:");
		lblHistria.setForeground(Color.GRAY);
		lblHistria.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHistria.setBounds(49, 225, 43, 21);
		newMHPane.add(lblHistria);
		
		JLabel bgNewMH = new JLabel("");
		bgNewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewMH.setBackground(Color.WHITE);
		bgNewMH.setBounds(0, 0, 603, 370);
		newMHPane.add(bgNewMH);
	//newMHPane ends
	//TODO newCity starts
		Panel newCityPane = new Panel();
		contentPane.add(newCityPane, "NewCity");
		newCityPane.setLayout(null);
		
		textFieldNomeNewCity = new JTextField();
		textFieldNomeNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewCity.setColumns(10);
		textFieldNomeNewCity.setBackground(Color.WHITE);
		textFieldNomeNewCity.setBounds(198, 211, 237, 21);
		newCityPane.add(textFieldNomeNewCity);
		
		textFieldPaisNewCity = new JTextField();
		textFieldPaisNewCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisNewCity.setColumns(10);
		textFieldPaisNewCity.setBackground(Color.WHITE);
		textFieldPaisNewCity.setBounds(197, 243, 238, 21);
		newCityPane.add(textFieldPaisNewCity);
		
		JButton btnRegisterNewCity = new JButton("Cadastrar");
		btnRegisterNewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeNewCity = textFieldNomeNewCity.getText();
				paisNewCity = textFieldPaisNewCity.getText();
				City c = new City(nomeNewCity, paisNewCity);
				cities.addCity(c);
				textFieldNomeNewCity.setText(null);
				textFieldPaisNewCity.setText(null);
				radioButtonMH.setSelected(true);
				showMainMenu(contentPane);
			}
		});
		btnRegisterNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewCity.setBorder(null);
		btnRegisterNewCity.setBackground(Color.WHITE);
		btnRegisterNewCity.setBounds(445, 296, 110, 33);
		newCityPane.add(btnRegisterNewCity);
		
		JButton btnBackNewCity = new JButton("");
		btnBackNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewCity.setContentAreaFilled(false);
		btnBackNewCity.setBorderPainted(false);
		btnBackNewCity.setBounds(0, 0, 32, 32);
		newCityPane.add(btnBackNewCity);
		btnBackNewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblNovaCidade = new JLabel("Nova Cidade");
		lblNovaCidade.setForeground(Color.GRAY);
		lblNovaCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaCidade.setBounds(42, 121, 187, 28);
		newCityPane.add(lblNovaCidade);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setName("Menu Principal");
		separator_3.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_3.setBounds(30, 158, 546, 2);
		newCityPane.add(separator_3);
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_2.setBounds(154, 210, 34, 21);
		newCityPane.add(label_2);
		
		JLabel lblPas = new JLabel("Pa\u00EDs:");
		lblPas.setForeground(Color.GRAY);
		lblPas.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblPas.setBounds(164, 242, 23, 21);
		newCityPane.add(lblPas);
		
		JLabel bgNewCity = new JLabel("");
		bgNewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewCity.setBackground(Color.WHITE);
		bgNewCity.setBounds(0, 0, 603, 370);
		newCityPane.add(bgNewCity);
	//newCity ends
	//TODO newAbility starts
		Panel newAbilityPane = new Panel();
		contentPane.add(newAbilityPane, "NewAbility");
		newAbilityPane.setLayout(null);
		
		textFieldNomeNewAbility = new JTextField();
		textFieldNomeNewAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeNewAbility.setColumns(10);
		textFieldNomeNewAbility.setBackground(Color.WHITE);
		textFieldNomeNewAbility.setBounds(105, 195, 330, 21);
		newAbilityPane.add(textFieldNomeNewAbility);
		
		textFieldDescNewAbility = new JEditorPane();
		textFieldDescNewAbility.setBounds(105, 227, 330, 102);
		newAbilityPane.add(textFieldDescNewAbility);
		
		JButton btnRegisterNewAbility = new JButton("Cadastrar");
		btnRegisterNewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeNewAbility = textFieldNomeNewAbility.getText();
				descNewAbility = textFieldDescNewAbility.getText();
				Ability a = new Ability(nomeNewAbility, descNewAbility);
				abilities.addAbility(a);
				textFieldNomeNewAbility.setText(null);
				textFieldDescNewAbility.setText(null);
				radioButtonMH.setSelected(true);
				showMainMenu(contentPane);
			}
		});
		btnRegisterNewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnRegisterNewAbility.setBorder(null);
		btnRegisterNewAbility.setBackground(Color.WHITE);
		btnRegisterNewAbility.setBounds(445, 296, 110, 33);
		newAbilityPane.add(btnRegisterNewAbility);
		
		JButton btnBackNewAbility = new JButton("");
		btnBackNewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackNewAbility.setContentAreaFilled(false);
		btnBackNewAbility.setBorderPainted(false);
		btnBackNewAbility.setBounds(0, 0, 32, 32);
		newAbilityPane.add(btnBackNewAbility);
		btnBackNewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblNovaHabilidade = new JLabel("Nova Habilidade");
		lblNovaHabilidade.setForeground(Color.GRAY);
		lblNovaHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNovaHabilidade.setBounds(42, 121, 187, 28);
		newAbilityPane.add(lblNovaHabilidade);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setName("Menu Principal");
		separator_4.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_4.setBounds(30, 158, 546, 2);
		newAbilityPane.add(separator_4);
		
		JLabel label_3 = new JLabel("Nome:");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_3.setBounds(61, 195, 34, 21);
		newAbilityPane.add(label_3);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setForeground(Color.GRAY);
		lblDescrio.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblDescrio.setBounds(43, 227, 52, 21);
		newAbilityPane.add(lblDescrio);
		
		JLabel bgNewAbility = new JLabel("");
		bgNewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgNewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgNewAbility.setBackground(Color.WHITE);
		bgNewAbility.setBounds(0, 0, 603, 370);
		newAbilityPane.add(bgNewAbility);
	//newAbility ends
	//TODO viewMetaHuman starts
		JPanel viewMHPane = new JPanel();
		contentPane.add(viewMHPane, "ViewMH");
		viewMHPane.setLayout(null);
		
		lblNomeViewMH = new JLabel();
		lblNomeViewMH.setForeground(Color.GRAY);
		lblNomeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeViewMH.setBounds(42, 121, 392, 28);
		viewMHPane.add(lblNomeViewMH);
		
		lblHistoriaViewMH = new JEditorPane();
		lblHistoriaViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblHistoriaViewMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		lblHistoriaViewMH.setEditable(false);
		lblHistoriaViewMH.setBackground(new Color(220, 220, 220));
		lblHistoriaViewMH.setBounds(213, 190, 341, 82);
		viewMHPane.add(lblHistoriaViewMH);
		
		lblCidadeViewMH = new JLabel("<cidade>");
		lblCidadeViewMH.setForeground(Color.BLACK);
		lblCidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblCidadeViewMH.setBounds(314, 283, 238, 21);
		viewMHPane.add(lblCidadeViewMH);
		
		lblHabilidadeViewMH = new JLabel("<habilidade>");
		lblHabilidadeViewMH.setForeground(Color.BLACK);
		lblHabilidadeViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblHabilidadeViewMH.setBounds(314, 308, 240, 21);
		viewMHPane.add(lblHabilidadeViewMH);
		
		lblFotoViewMH = new JLabel("Foto 150x150");
		lblFotoViewMH.setBackground(Color.DARK_GRAY);
		lblFotoViewMH.setBorder(new EmptyBorder(1, 1, 1, 1));
		lblFotoViewMH.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoViewMH.setForeground(Color.WHITE);
		lblFotoViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblFotoViewMH.setBounds(53, 178, 150, 150);
		viewMHPane.add(lblFotoViewMH);
		
		JButton btnEditViewMH = new JButton("");
		btnEditViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MetaHuman mh = metaHumans.getMetaHuman(nomeViewMH);
				textFieldNomeEditMH.setText(nomeViewMH);
				textFieldIdadeEditMH.setText(mh.getAge());
				textFieldHistoriaEditMH.setText(mh.getHistory());
				//updates comboboxes
				comboBoxCidadeEditMH.setModel(new DefaultComboBoxModel<String>(cities.getNames()));
				comboBoxHabilidadeEditMH.setModel(new DefaultComboBoxModel<String>(abilities.getNames()));
				//FIXME edit combobox
				comboBoxCidadeEditMH.setSelectedIndex(getComboBoxIndex(1, mh.getHomeTown()));
				comboBoxHabilidadeEditMH.setSelectedIndex(getComboBoxIndex(2, mh.getAbility())); 
				showEditMH(contentPane);
			}
		});
		btnEditViewMH.setContentAreaFilled(false);
		btnEditViewMH.setBorderPainted(false);
		btnEditViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewMH.setBorder(null);
		btnEditViewMH.setBackground(Color.WHITE);
		btnEditViewMH.setBounds(522, 118, 32, 32);
		viewMHPane.add(btnEditViewMH);
		
		JButton btnBackViewMH = new JButton("");
		btnBackViewMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewMH.setContentAreaFilled(false);
		btnBackViewMH.setBorderPainted(false);
		btnBackViewMH.setBounds(0, 0, 32, 32);
		viewMHPane.add(btnBackViewMH);
		btnBackViewMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setName("Menu Principal");
		separator_5.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_5.setBounds(30, 158, 546, 2);
		viewMHPane.add(separator_5);
		
		JLabel label_7 = new JLabel("Habilidade:");
		label_7.setForeground(Color.GRAY);
		label_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_7.setBounds(245, 308, 59, 21);
		viewMHPane.add(label_7);
		
		JLabel label_8 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_8.setBounds(213, 283, 91, 21);
		viewMHPane.add(label_8);
		
		JLabel label_9 = new JLabel("Hist\u00F3ria:");
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_9.setBounds(213, 171, 43, 21);
		viewMHPane.add(label_9);
		
		JLabel bgViewMH = new JLabel("");
		bgViewMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewMH.setBackground(Color.WHITE);
		bgViewMH.setBounds(0, 0, 603, 370);
		viewMHPane.add(bgViewMH);
	//viewMH ends
	//TODO viewCity starts
		JPanel viewCityPane = new JPanel();
		contentPane.add(viewCityPane, "ViewCity");
		viewCityPane.setBackground(Color.WHITE);
		viewCityPane.setLayout(null);
		
		lblNomePaisViewCity = new JLabel("<cidade>, <pa\u00EDs>");
		lblNomePaisViewCity.setForeground(Color.GRAY);
		lblNomePaisViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomePaisViewCity.setBounds(42, 121, 187, 28);
		viewCityPane.add(lblNomePaisViewCity);
		
		tableViewCity = new JTable();
		tableViewCity.setShowGrid(false);
		tableViewCity.setSelectionBackground(new Color(255, 255, 153));
		tableViewCity.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		/*tableViewCity.getColumnModel().getColumn(0).setPreferredWidth(126);
		tableViewCity.getColumnModel().getColumn(1).setPreferredWidth(123);
		tableViewCity.getColumnModel().getColumn(2).setPreferredWidth(148);*/
		tableViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		tableViewCity.setBounds(63, 171, 476, 156);
		viewCityPane.add(tableViewCity);
		
		JButton btnEditViewCity = new JButton("");//TODO EDIT VIEW CITY
		btnEditViewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				City c = cities.getCity(nomeViewCity);
				textFieldNomeEditCity.setText(c.getName());
				textFieldPaisEditCity.setText(c.getCountry());
				showEditCity(contentPane);
			}
		});
		btnEditViewCity.setContentAreaFilled(false);
		btnEditViewCity.setBorderPainted(false);
		btnEditViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewCity.setBorder(null);
		btnEditViewCity.setBackground(Color.WHITE);
		btnEditViewCity.setBounds(507, 117, 32, 32);
		viewCityPane.add(btnEditViewCity);
		
		JButton btnBackViewCity = new JButton("");
		btnBackViewCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewCity.setContentAreaFilled(false);
		btnBackViewCity.setBorderPainted(false);
		btnBackViewCity.setBounds(0, 0, 32, 32);
		viewCityPane.add(btnBackViewCity);
		btnBackViewCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setName("Menu Principal");
		separator_6.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_6.setBounds(30, 158, 546, 2);
		viewCityPane.add(separator_6);
		
		JLabel bgViewCity = new JLabel("");
		bgViewCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewCity.setBackground(Color.WHITE);
		bgViewCity.setBounds(0, 0, 603, 370);
		viewCityPane.add(bgViewCity);
	//viewCity ends
	//TODO viewAbility starts
		Panel viewAbilityPane = new Panel();
		contentPane.add(viewAbilityPane, "ViewAbility");
		viewAbilityPane.setLayout(null);
		
		lblNomeViewAbility = new JLabel("<habilidade>");
		lblNomeViewAbility.setForeground(Color.GRAY);
		lblNomeViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblNomeViewAbility.setBounds(42, 121, 187, 28);
		viewAbilityPane.add(lblNomeViewAbility);
		
		lblDescViewAbility = new JEditorPane();
		lblDescViewAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		lblDescViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblDescViewAbility.setEditable(false);
		lblDescViewAbility.setBackground(new Color(220, 220, 220));
		lblDescViewAbility.setBounds(85, 195, 432, 120);
		viewAbilityPane.add(lblDescViewAbility);
		
		JButton btnEditViewAbility = new JButton("");//TODO EDIT VIEW ABILITY
		btnEditViewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ability a = abilities.getAbility(nomeViewAbility);
				textFieldNomeEditAbility.setText(a.getName());
				textFieldDescEditAbility.setText(a.getDescription());
				showEditAbility(contentPane);
			}
		});
		btnEditViewAbility.setContentAreaFilled(false);
		btnEditViewAbility.setBorderPainted(false);
		btnEditViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditViewAbility.setBorder(null);
		btnEditViewAbility.setBackground(Color.WHITE);
		btnEditViewAbility.setBounds(527, 117, 32, 32);
		viewAbilityPane.add(btnEditViewAbility);
		
		JButton btnBackViewAbility = new JButton("");
		btnBackViewAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewAbility.setContentAreaFilled(false);
		btnBackViewAbility.setBorderPainted(false);
		btnBackViewAbility.setBounds(0, 0, 32, 32);
		viewAbilityPane.add(btnBackViewAbility);
		btnBackViewAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setName("Menu Principal");
		separator_7.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_7.setBounds(30, 158, 546, 2);
		viewAbilityPane.add(separator_7);
		
		JLabel bgViewAbility = new JLabel("");
		bgViewAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewAbility.setBackground(Color.WHITE);
		bgViewAbility.setBounds(0, 0, 603, 370);
		viewAbilityPane.add(bgViewAbility);
	//viewAbility ends
	//TODO editMetaHuman starts
		Panel editMHPane = new Panel();
		contentPane.add(editMHPane, "EditMH");
		editMHPane.setLayout(null);
		
		textFieldNomeEditMH = new JTextField();
		textFieldNomeEditMH.setText("<nome>");
		textFieldNomeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldNomeEditMH.setColumns(10);
		textFieldNomeEditMH.setBackground(Color.WHITE);
		textFieldNomeEditMH.setBounds(119, 172, 152, 21);
		editMHPane.add(textFieldNomeEditMH);
		
		textFieldIdadeEditMH = new JTextField();
		textFieldIdadeEditMH.setText("<idade>");
		textFieldIdadeEditMH.setSelectionColor(new Color(255, 255, 102));
		textFieldIdadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		textFieldIdadeEditMH.setColumns(10);
		textFieldIdadeEditMH.setBackground(Color.WHITE);
		textFieldIdadeEditMH.setBounds(119, 198, 152, 21);
		editMHPane.add(textFieldIdadeEditMH);
		
		textFieldHistoriaEditMH = new JEditorPane();
		textFieldHistoriaEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		textFieldHistoriaEditMH.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		textFieldHistoriaEditMH.setBounds(44, 253, 390, 75);
		editMHPane.add(textFieldHistoriaEditMH);
		
		comboBoxCidadeEditMH = new JComboBox<String>();
		comboBoxCidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxCidadeEditMH.setBackground(Color.WHITE);
		comboBoxCidadeEditMH.setBounds(402, 171, 152, 21);
		//comboBoxCidadeEditMH.setModel(new DefaultComboBoxModel<String>(cities.getNames()));
		editMHPane.add(comboBoxCidadeEditMH);
		
		comboBoxHabilidadeEditMH = new JComboBox<String>();
		comboBoxHabilidadeEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxHabilidadeEditMH.setBackground(Color.WHITE);
		comboBoxHabilidadeEditMH.setBounds(402, 198, 152, 21);
		//comboBoxHabilidadeEditMH.setModel(new DefaultComboBoxModel<String>(abilities.getNames()));
		editMHPane.add(comboBoxHabilidadeEditMH);
		
		btnFotoEditMH = new JButton("Foto");
		btnFotoEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnFotoEditMH.setBorder(null);
		btnFotoEditMH.setBackground(Color.WHITE);
		btnFotoEditMH.setBounds(444, 253, 110, 33);
		editMHPane.add(btnFotoEditMH);
		
		JButton btnUpdateEditMH = new JButton("Atualizar");//TODO NOT WORKING
		btnUpdateEditMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pega os dados para cadastro
				nomeEditMH = textFieldNomeEditMH.getText();
				idadeEditMH = textFieldIdadeEditMH.getText();
				cidadeEditMH = (String) comboBoxCidadeEditMH.getSelectedItem();
				habilidadeEditMH = (String) comboBoxHabilidadeEditMH.getSelectedItem();
				historiaEditMH = textFieldHistoriaEditMH.getText();
				//atualiza metahumano
				MetaHuman mh = new MetaHuman(nomeEditMH, idadeEditMH, iconNewMH, habilidadeEditMH, cidadeEditMH, historiaEditMH);//TODO ICON 
				metaHumans.getMetaHuman(nomeEditMH);
				metaHumans.updateMetaHuman(mh);
				//volta pro menu principal
				showMainMenu(contentPane);
			}
		});
		btnUpdateEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditMH.setBorder(null);
		btnUpdateEditMH.setBackground(Color.WHITE);
		btnUpdateEditMH.setBounds(444, 296, 110, 33);
		editMHPane.add(btnUpdateEditMH);
		
		JButton btnExcludeEditMH = new JButton("");
		btnExcludeEditMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO DELETE MH
			}
		});
		btnExcludeEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditMH.setContentAreaFilled(false);
		btnExcludeEditMH.setBorderPainted(false);
		btnExcludeEditMH.setBounds(522, 117, 32, 32);
		editMHPane.add(btnExcludeEditMH);
		
		JButton btnBackEditMH = new JButton("");
		btnBackEditMH.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditMH.setContentAreaFilled(false);
		btnBackEditMH.setBorderPainted(false);
		btnBackEditMH.setBounds(0, 0, 32, 32);
		editMHPane.add(btnBackEditMH);
		btnBackEditMH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblEditarMetahumano = new JLabel("Editar Meta-Humano");
		lblEditarMetahumano.setForeground(Color.GRAY);
		lblEditarMetahumano.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarMetahumano.setBounds(42, 121, 187, 28);
		editMHPane.add(lblEditarMetahumano);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setName("Menu Principal");
		separator_8.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_8.setBounds(30, 158, 546, 2);
		editMHPane.add(separator_8);
		
		JLabel label_10 = new JLabel("Nome:");
		label_10.setForeground(Color.GRAY);
		label_10.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_10.setBounds(58, 172, 34, 21);
		editMHPane.add(label_10);
		
		JLabel label_14 = new JLabel("Idade:");
		label_14.setForeground(Color.GRAY);
		label_14.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_14.setBounds(60, 197, 32, 21);
		editMHPane.add(label_14);
		
		JLabel label_16 = new JLabel("Habilidade:");
		label_16.setForeground(Color.GRAY);
		label_16.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_16.setBounds(328, 198, 59, 21);
		editMHPane.add(label_16);
		
		JLabel label_17 = new JLabel("Primeira apari\u00E7\u00E3o:");
		label_17.setForeground(Color.GRAY);
		label_17.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_17.setBounds(296, 173, 91, 21);
		editMHPane.add(label_17);
		
		JLabel label_18 = new JLabel("Hist\u00F3ria:");
		label_18.setForeground(Color.GRAY);
		label_18.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		label_18.setBounds(49, 225, 43, 21);
		editMHPane.add(label_18);
		
		JLabel bgEditMH = new JLabel("");
		bgEditMH.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditMH.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditMH.setBackground(Color.WHITE);
		bgEditMH.setBounds(0, 0, 603, 370);
		editMHPane.add(bgEditMH);
	//editMetaHuman ends
	//TODO editCity starts
		Panel editCityPane = new Panel();
		contentPane.add(editCityPane, "EditCity");
		editCityPane.setLayout(null);
		
		textFieldNomeEditCity = new JTextField();
		textFieldNomeEditCity.setText("<nome da cidade>");
		textFieldNomeEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditCity.setColumns(10);
		textFieldNomeEditCity.setBackground(Color.WHITE);
		textFieldNomeEditCity.setBounds(198, 211, 237, 21);
		editCityPane.add(textFieldNomeEditCity);
		
		textFieldPaisEditCity = new JTextField();
		textFieldPaisEditCity.setText("<nome do pa\u00EDs>");
		textFieldPaisEditCity.setSelectionColor(new Color(255, 255, 102));
		textFieldPaisEditCity.setColumns(10);
		textFieldPaisEditCity.setBackground(Color.WHITE);
		textFieldPaisEditCity.setBounds(197, 243, 238, 21);
		editCityPane.add(textFieldPaisEditCity);
		
		JButton btnUpdateEditCity = new JButton("Atualizar");//TODO UPDATE CITY
		btnUpdateEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditCity.setBorder(null);
		btnUpdateEditCity.setBackground(Color.WHITE);
		btnUpdateEditCity.setBounds(445, 296, 110, 33);
		editCityPane.add(btnUpdateEditCity);
		
		JButton btnExcludeEditCity = new JButton("");//TODO REMOVE CITY
		btnExcludeEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditCity.setContentAreaFilled(false);
		btnExcludeEditCity.setBorderPainted(false);
		btnExcludeEditCity.setBounds(523, 117, 32, 32);
		editCityPane.add(btnExcludeEditCity);
		
		JButton btnBackEditCity = new JButton("");
		btnBackEditCity.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditCity.setContentAreaFilled(false);
		btnBackEditCity.setBorderPainted(false);
		btnBackEditCity.setBounds(0, 0, 32, 32);
		editCityPane.add(btnBackEditCity);
		btnBackEditCity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblEditarCidade = new JLabel("Editar Cidade");
		lblEditarCidade.setForeground(Color.GRAY);
		lblEditarCidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarCidade.setBounds(42, 121, 187, 28);
		editCityPane.add(lblEditarCidade);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setName("Menu Principal");
		separator_9.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_9.setBounds(30, 158, 546, 2);
		editCityPane.add(separator_9);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setForeground(Color.GRAY);
		labelNome.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNome.setBounds(154, 210, 34, 21);
		editCityPane.add(labelNome);
		
		JLabel labelPais = new JLabel("Pa\u00EDs:");
		labelPais.setForeground(Color.GRAY);
		labelPais.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelPais.setBounds(164, 242, 23, 21);
		editCityPane.add(labelPais);
		
		JLabel bgEditCity = new JLabel("");
		bgEditCity.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditCity.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditCity.setBackground(Color.WHITE);
		bgEditCity.setBounds(0, 0, 603, 370);
		editCityPane.add(bgEditCity);
	//editCity ends
	//TODO editAbility starts
		Panel editAbilityPane = new Panel();
		contentPane.add(editAbilityPane, "EditAbility");
		editAbilityPane.setLayout(null);
		
		textFieldNomeEditAbility = new JTextField();
		textFieldNomeEditAbility.setText("<nome da habilidade>");
		textFieldNomeEditAbility.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeEditAbility.setColumns(10);
		textFieldNomeEditAbility.setBackground(Color.WHITE);
		textFieldNomeEditAbility.setBounds(105, 195, 330, 21);
		editAbilityPane.add(textFieldNomeEditAbility);
		
		textFieldDescEditAbility = new JEditorPane();
		textFieldDescEditAbility.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		textFieldDescEditAbility.setBounds(105, 227, 330, 102);
		editAbilityPane.add(textFieldDescEditAbility);
		
		JButton btnUpdateEditAbility = new JButton("Atualizar");//TODO UPDATE ABILITY
		btnUpdateEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateEditAbility.setBorder(null);
		btnUpdateEditAbility.setBackground(Color.WHITE);
		btnUpdateEditAbility.setBounds(445, 296, 110, 33);
		editAbilityPane.add(btnUpdateEditAbility);
		
		JButton btnExcludeEditAbility = new JButton("");//TODO REMOVE ABILITY
		btnExcludeEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeEditAbility.setContentAreaFilled(false);
		btnExcludeEditAbility.setBorderPainted(false);
		btnExcludeEditAbility.setBounds(523, 117, 32, 32);
		editAbilityPane.add(btnExcludeEditAbility);
		
		JButton btnBackEditAbility = new JButton("");
		btnBackEditAbility.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackEditAbility.setContentAreaFilled(false);
		btnBackEditAbility.setBorderPainted(false);
		btnBackEditAbility.setBounds(0, 0, 32, 32);
		editAbilityPane.add(btnBackEditAbility);
		btnBackEditAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblEditarHabilidade = new JLabel("Editar Habilidade");
		lblEditarHabilidade.setForeground(Color.GRAY);
		lblEditarHabilidade.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblEditarHabilidade.setBounds(42, 121, 187, 28);
		editAbilityPane.add(lblEditarHabilidade);
		
		JSeparator separatorEditAbility = new JSeparator();
		separatorEditAbility.setName("Menu Principal");
		separatorEditAbility.setBorder(new EmptyBorder(1, 1, 1, 1));
		separatorEditAbility.setBounds(30, 158, 546, 2);
		editAbilityPane.add(separatorEditAbility);
		
		JLabel labelNomeEditAbility = new JLabel("Nome:");
		labelNomeEditAbility.setForeground(Color.GRAY);
		labelNomeEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelNomeEditAbility.setBounds(61, 195, 34, 21);
		editAbilityPane.add(labelNomeEditAbility);
		
		JLabel labelDescEditAbility = new JLabel("Descri\u00E7\u00E3o:");
		labelDescEditAbility.setForeground(Color.GRAY);
		labelDescEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		labelDescEditAbility.setBounds(43, 227, 52, 21);
		editAbilityPane.add(labelDescEditAbility);
		
		JLabel bgEditAbility = new JLabel("");
		bgEditAbility.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgEditAbility.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgEditAbility.setBackground(Color.WHITE);
		bgEditAbility.setBounds(0, 0, 603, 370);
		editAbilityPane.add(bgEditAbility);
	//editAbility ends
	//TODO profile starts
		JPanel profilePane = new JPanel();
		contentPane.add(profilePane, "Profile");
		profilePane.setLayout(null);
		
		textFieldNomeProfile = new JTextField();
		textFieldNomeProfile.setSelectionColor(new Color(255, 255, 102));
		textFieldNomeProfile.setColumns(10);
		textFieldNomeProfile.setBackground(Color.WHITE);
		textFieldNomeProfile.setBounds(291, 171, 210, 21);
		profilePane.add(textFieldNomeProfile);
		
		
		textFieldEmailProfile = new JTextField();
		textFieldEmailProfile.setSelectionColor(new Color(255, 255, 102));
		textFieldEmailProfile.setColumns(10);
		textFieldEmailProfile.setBackground(Color.WHITE);
		textFieldEmailProfile.setBounds(291, 203, 210, 21);
		profilePane.add(textFieldEmailProfile);
		
		JButton btnEditFotoProfile = new JButton("");//TODO EDIT PROFILE PIC
		btnEditFotoProfile.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/edit-icon.png")));
		btnEditFotoProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnEditFotoProfile.setContentAreaFilled(false);
		btnEditFotoProfile.setBorderPainted(false);
		btnEditFotoProfile.setBorder(null);
		btnEditFotoProfile.setBackground(Color.WHITE);
		btnEditFotoProfile.setBounds(53, 296, 32, 32);
		profilePane.add(btnEditFotoProfile);
		
		JLabel lblFotoProfile = new JLabel("Foto 150x150");
		lblFotoProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoProfile.setForeground(Color.WHITE);
		lblFotoProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblFotoProfile.setBorder(new EmptyBorder(1, 1, 1, 1));
		lblFotoProfile.setBackground(Color.DARK_GRAY);
		lblFotoProfile.setBounds(53, 178, 150, 150);
		profilePane.add(lblFotoProfile);
		
		JButton btnUpdateProfile_1 = new JButton("Ir");//TODO Atualizar dados perfil
		btnUpdateProfile_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateProfile_1.setContentAreaFilled(false);
		btnUpdateProfile_1.setBorderPainted(false);
		btnUpdateProfile_1.setBorder(null);
		btnUpdateProfile_1.setBackground(Color.WHITE);
		btnUpdateProfile_1.setBounds(522, 192, 32, 32);
		profilePane.add(btnUpdateProfile_1);
		
		textFieldSenhaAtualProfile = new JPasswordField();
		textFieldSenhaAtualProfile.setSelectionColor(new Color(255, 255, 102));
		textFieldSenhaAtualProfile.setColumns(10);
		textFieldSenhaAtualProfile.setBackground(Color.WHITE);
		textFieldSenhaAtualProfile.setBounds(291, 247, 210, 21);
		profilePane.add(textFieldSenhaAtualProfile);
		
		textFieldNovaSenhaProfile_1 = new JPasswordField();
		textFieldNovaSenhaProfile_1.setSelectionColor(new Color(255, 255, 102));
		textFieldNovaSenhaProfile_1.setColumns(10);
		textFieldNovaSenhaProfile_1.setBackground(Color.WHITE);
		textFieldNovaSenhaProfile_1.setBounds(291, 280, 210, 21);
		profilePane.add(textFieldNovaSenhaProfile_1);
		
		textFieldNovaSenhaProfile_2 = new JPasswordField();
		textFieldNovaSenhaProfile_2.setSelectionColor(new Color(255, 255, 102));
		textFieldNovaSenhaProfile_2.setColumns(10);
		textFieldNovaSenhaProfile_2.setBackground(Color.WHITE);
		textFieldNovaSenhaProfile_2.setBounds(291, 312, 210, 21);
		profilePane.add(textFieldNovaSenhaProfile_2);
		
		JButton btnUpdateProfile_2 = new JButton("Ir");//TODO UPDATE PROFILE PASSWORD
		btnUpdateProfile_2.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnUpdateProfile_2.setContentAreaFilled(false);
		btnUpdateProfile_2.setBorderPainted(false);
		btnUpdateProfile_2.setBorder(null);
		btnUpdateProfile_2.setBackground(Color.WHITE);
		btnUpdateProfile_2.setBounds(522, 296, 32, 32);
		profilePane.add(btnUpdateProfile_2);
		
		JButton btnExcludeProfile = new JButton("");//TODO REMOVE PROFILE
		btnExcludeProfile.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeProfile.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnExcludeProfile.setContentAreaFilled(false);
		btnExcludeProfile.setBorderPainted(false);
		btnExcludeProfile.setBorder(null);
		btnExcludeProfile.setBackground(Color.WHITE);
		btnExcludeProfile.setBounds(522, 118, 32, 32);
		profilePane.add(btnExcludeProfile);
		
		JButton btnBackProfile = new JButton("");
		btnBackProfile.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackProfile.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackProfile.setContentAreaFilled(false);
		btnBackProfile.setBorderPainted(false);
		btnBackProfile.setBounds(0, 0, 32, 32);
		profilePane.add(btnBackProfile);
		btnBackProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel labelTitleProfile = new JLabel("Editar Perfil");
		labelTitleProfile.setForeground(Color.GRAY);
		labelTitleProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		labelTitleProfile.setBounds(42, 121, 392, 28);
		profilePane.add(labelTitleProfile);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setName("Menu Principal");
		separator_10.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_10.setBounds(30, 158, 546, 2);
		profilePane.add(separator_10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.GRAY);
		lblEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblEmail.setBounds(213, 203, 43, 21);
		profilePane.add(lblEmail);
		
		JLabel lblNomeProfile = new JLabel("Nome:");
		lblNomeProfile.setForeground(Color.GRAY);
		lblNomeProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNomeProfile.setBounds(213, 171, 43, 21);
		profilePane.add(lblNomeProfile);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setName("Menu Principal");
		separator_11.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_11.setBounds(211, 235, 363, 2);
		profilePane.add(separator_11);
		
		JLabel lblSenhaAtual = new JLabel("Senha atual:");
		lblSenhaAtual.setForeground(Color.GRAY);
		lblSenhaAtual.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblSenhaAtual.setBounds(213, 248, 68, 21);
		profilePane.add(lblSenhaAtual);
		
		JLabel lblNovaSenha = new JLabel("Nova senha:");
		lblNovaSenha.setForeground(Color.GRAY);
		lblNovaSenha.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNovaSenha.setBounds(213, 280, 68, 21);
		profilePane.add(lblNovaSenha);
		
		JLabel lblConfirmao = new JLabel("Confirma\u00E7\u00E3o:");
		lblConfirmao.setForeground(Color.GRAY);
		lblConfirmao.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblConfirmao.setBounds(213, 312, 68, 21);
		profilePane.add(lblConfirmao);
		
		JLabel bgProfile = new JLabel("");
		bgProfile.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgProfile.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgProfile.setBackground(Color.WHITE);
		bgProfile.setBounds(0, 0, 603, 370);
		profilePane.add(bgProfile);
	//profile ends
	//TODO viewUsers starts
		JPanel viewUsersPane = new JPanel();
		contentPane.add(viewUsersPane, "ViewUsers");
		viewUsersPane.setLayout(null);
		
		JComboBox<String> comboBoxNomeViewUsers = new JComboBox<String>();
		comboBoxNomeViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxNomeViewUsers.setBackground(Color.WHITE);
		comboBoxNomeViewUsers.setBounds(316, 179, 202, 21);
		viewUsersPane.add(comboBoxNomeViewUsers);
		
		JLabel lblIdViewUsers = new JLabel("<id>");
		lblIdViewUsers.setForeground(Color.BLACK);
		lblIdViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblIdViewUsers.setBounds(316, 210, 202, 21);
		viewUsersPane.add(lblIdViewUsers);
		
		JLabel lblEmailViewUsers = new JLabel("<email>");
		lblEmailViewUsers.setForeground(Color.BLACK);
		lblEmailViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblEmailViewUsers.setBounds(314, 242, 202, 21);
		viewUsersPane.add(lblEmailViewUsers);
		
		JComboBox comboBoxColabViewUsers = new JComboBox();
		comboBoxColabViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		comboBoxColabViewUsers.setBackground(Color.WHITE);
		comboBoxColabViewUsers.setBounds(316, 274, 202, 21);
		viewUsersPane.add(comboBoxColabViewUsers);
		
		JLabel lblTipoViewUsers = new JLabel("<user ou admin>");
		lblTipoViewUsers.setForeground(Color.BLACK);
		lblTipoViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblTipoViewUsers.setBounds(316, 306, 202, 21);
		viewUsersPane.add(lblTipoViewUsers);
		
		JLabel lblFotoViewUsers = new JLabel("Foto 150x150");
		lblFotoViewUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotoViewUsers.setForeground(Color.WHITE);
		lblFotoViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblFotoViewUsers.setBorder(new EmptyBorder(1, 1, 1, 1));
		lblFotoViewUsers.setBackground(Color.DARK_GRAY);
		lblFotoViewUsers.setBounds(53, 178, 150, 150);
		viewUsersPane.add(lblFotoViewUsers);
		
		JButton btnPromoteViewUsers = new JButton("");
		btnPromoteViewUsers.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/crown-iconpressed.png")));
		btnPromoteViewUsers.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/crown-icon.png")));
		btnPromoteViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnPromoteViewUsers.setContentAreaFilled(false);
		btnPromoteViewUsers.setBorderPainted(false);
		btnPromoteViewUsers.setBorder(null);
		btnPromoteViewUsers.setBackground(Color.WHITE);
		btnPromoteViewUsers.setBounds(480, 118, 32, 32);
		viewUsersPane.add(btnPromoteViewUsers);
		
		JButton btnExcludeViewUsers = new JButton("");
		btnExcludeViewUsers.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-icon.png")));
		btnExcludeViewUsers.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/trash-iconpressed.png")));
		btnExcludeViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnExcludeViewUsers.setContentAreaFilled(false);
		btnExcludeViewUsers.setBorderPainted(false);
		btnExcludeViewUsers.setBorder(null);
		btnExcludeViewUsers.setBackground(Color.WHITE);
		btnExcludeViewUsers.setBounds(522, 118, 32, 32);
		viewUsersPane.add(btnExcludeViewUsers);
		
		JButton btnBackViewUsers = new JButton("");
		btnBackViewUsers.setPressedIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-leftpressed.png")));
		btnBackViewUsers.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/arrow-left-edited1.png")));
		btnBackViewUsers.setContentAreaFilled(false);
		btnBackViewUsers.setBorderPainted(false);
		btnBackViewUsers.setBounds(0, 0, 32, 32);
		viewUsersPane.add(btnBackViewUsers);
		btnBackViewUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMainMenu(contentPane);
			}
		});
		
		JLabel lblGerenciarUsurio = new JLabel("Gerenciar usu\u00E1rio");
		lblGerenciarUsurio.setForeground(Color.GRAY);
		lblGerenciarUsurio.setFont(new Font("Nirmala UI", Font.PLAIN, 20));
		lblGerenciarUsurio.setBounds(42, 121, 157, 28);
		viewUsersPane.add(lblGerenciarUsurio);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setName("Menu Principal");
		separator_12.setBorder(new EmptyBorder(1, 1, 1, 1));
		separator_12.setBounds(30, 158, 546, 2);
		viewUsersPane.add(separator_12);
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setForeground(Color.GRAY);
		lblEmail_1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblEmail_1.setBounds(254, 242, 32, 21);
		viewUsersPane.add(lblEmail_1);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(Color.GRAY);
		lblId.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblId.setBounds(272, 210, 14, 21);
		viewUsersPane.add(lblId);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setForeground(Color.GRAY);
		lblNome_1.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNome_1.setBounds(253, 178, 33, 21);
		viewUsersPane.add(lblNome_1);
		
		JLabel lblColaboraes = new JLabel("Colabora\u00E7\u00F5es:");
		lblColaboraes.setForeground(Color.GRAY);
		lblColaboraes.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblColaboraes.setBounds(213, 274, 73, 21);
		viewUsersPane.add(lblColaboraes);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.GRAY);
		lblTipo.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblTipo.setBounds(261, 307, 25, 21);
		viewUsersPane.add(lblTipo);
		
		JLabel bgViewUsers = new JLabel("");
		bgViewUsers.setIcon(new ImageIcon(MainMenuFrame.class.getResource("/view/img/bg-base.jpg")));
		bgViewUsers.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		bgViewUsers.setBackground(Color.WHITE);
		bgViewUsers.setBounds(0, 0, 603, 370);
		viewUsersPane.add(bgViewUsers);
	}
	public DefaultTableModel getTableData(){
		String col[] = {"Nome", "Cidade", "Habilidade"};
		DefaultTableModel tableModel = new DefaultTableModel(col, metaHumans.getAllmetaHumans().size());
		for(int i=0;i<metaHumans.getAllmetaHumans().size();i++){
			String nome = metaHumans.getAllmetaHumans().get(i).getName();
			String cidade = metaHumans.getAllmetaHumans().get(i).getHomeTown();
			String habilidade = metaHumans.getAllmetaHumans().get(i).getAbility();
			
			Object[] objs = {nome, cidade, habilidade};
			tableModel.addRow(objs);
		}
		return tableModel;
	}
	public int getComboBoxIndex(int type, String name){
		int index = 0;
		if(type == 1){//city
			for(String city : cities.getNames()){
				if(name.equals(city)){
					return index;
				}
				index++;
			}
		}
		else{
			for(String ability : abilities.getNames()){
				if(name.equals(ability)){
					return index;
				}
				index++;
			}
		}
		return -1;
	}
}
