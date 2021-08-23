import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class background {
	private Icon icon = null;
    private final Dimension dimension = new Dimension(100, 100);
    private Image image = null;
    private ImageIcon ii = null;
    //private SizeMode sizeMode = SizeMode.STRETCH;
    private int newHeight, newWidth, originalHeight, originalWidth;

	public void addback()
	{
		icon = new ImageIcon("C:\\Users\\smaillhk\\eclipse-workspace\\tryagain\\src\\8821inner.png");
		 this.icon = icon;
	        ii = (ImageIcon) icon;
	        image = ii.getImage();
	        originalHeight = ii.getIconHeight();
	        originalWidth = ii.getIconWidth();
	}
	public void paint(Graphics g) {
		 g.drawImage(image, 0, 0, ii.getIconWidth(), ii.getIconHeight(), null);
		}
	}

