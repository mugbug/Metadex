package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotificationDialog extends JDialog {

	private static final long serialVersionUID = 4695815459953592780L;
	
	public final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public NotificationDialog(int type, String message) {
		setAlwaysOnTop(true); //tipo: 1.Confirm | 2. Notify | 3. Error
		setTitle("Metadex");
		setResizable(false);
		setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(NotificationDialog.class.getResource("/view/img/favicon.png")));
		setBounds(100, 100, 377, 192);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		if(type == 1){
			JButton btnNewButton = new JButton("Cancelar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
			btnNewButton.setBounds(20, 120, 89, 23);
			contentPanel.add(btnNewButton);
		}
		
		JButton btnNewButton_1 = new JButton("Ok");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(type == 1){
					//TODO atualiza banco de dados
					dispose();
				}else {
					dispose();
				}
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		btnNewButton_1.setBounds(119, 120, 89, 23);
		contentPanel.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 226, 101);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblTipo = new JLabel();
			if(type == 1){
				lblTipo.setText("Confirmação");
			}
			else if(type == 2){
				lblTipo.setText("Notificação");
			}
			else if(type == 3){
				lblTipo.setText("Erro");
			}
			lblTipo.setBounds(10, 11, 206, 14);
			panel.add(lblTipo);
			lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTipo.setForeground(Color.BLACK);
			lblTipo.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		}
		
		JEditorPane dtrpnEmailOuSenha = new JEditorPane();
		dtrpnEmailOuSenha.setBounds(15, 33, 201, 57);
		panel.add(dtrpnEmailOuSenha);
		dtrpnEmailOuSenha.setText(message);
		dtrpnEmailOuSenha.setEditable(false);
		dtrpnEmailOuSenha.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		dtrpnEmailOuSenha.setBackground(Color.WHITE);
		{
			JLabel bg = new JLabel("");
			bg.setHorizontalAlignment(SwingConstants.RIGHT);
			bg.setHorizontalTextPosition(SwingConstants.RIGHT);
			bg.setVerticalAlignment(SwingConstants.BOTTOM);
			bg.setIcon(new ImageIcon(NotificationDialog.class.getResource("/view/img/dialog-small.png")));
			bg.setBounds(0, 0, 369, 163);
			contentPanel.add(bg);
		}
		
		
	}
}
