package controller;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public abstract class ImageOpener {
	public ImageIcon getImage(ActionEvent e, JButton btn){
		ImageIcon icon = new ImageIcon();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Image Files", "jpg", "png", "gif", "jpeg");
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(filter);
		fc.setCurrentDirectory(new File(System.getProperty("user.home") 
				+ System.getProperty("file.separator")+ "Desktop" 
				+ System.getProperty("file.separator")+ "metadex_fotos"));
		//Handle open button action.
	    if (e.getSource() == btn) {
	        int returnVal = fc.showOpenDialog(btn);

	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = fc.getSelectedFile();
	            //This is where a real application would open the file.
	            btn.setText(fc.getName(file)); //altera nome do botao para nome do arquivo
	            BufferedImage img = null;
	            try {
	                img = ImageIO.read(file);
	            } catch (IOException ioe) {
	            }
	            icon.setImage(img);
	        }
	   }
	   return icon;
		
	}
}
