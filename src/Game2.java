
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Game extends JPanel {
	 private static ImageIcon icon = new ImageIcon("C:\\Users\\smaillhk\\eclipse-workspace\\tryagain\\src\\8821inner.png"); 
	 private static Image image = null;
	    private static ImageIcon ii = null;
	JLabel thumb = new JLabel();
/*	double x[] = {100,200,300,400,500,600,700,800};
	double y[] = {100,200,300,400,500,600,700,800};
	int angel[] = {360,360,360,360,360,360,360,360};*/

	/*private void moveBall() {
		int r= 70;
	
		for(int i=0;i<8;i++)
		{
		
		if ( angel[i]>= 0)
		{
		angel[i]--;
		}
		else
		{ 
			angel[i] = 360;
			angel[i]--;
		}
		x[i]=  (x[i] +(r* Math.cos(angel[i])));
		y[i]=  (y[i] +(r* Math.sin(angel[i])));
		}
	}*/

	@Override
	public void paint(Graphics g) {
		//Game();
		
		//super.paint(g);
		 ii = (ImageIcon) icon;
	        image = ii.getImage();
	        g.fillOval(726, 467, 5, 5);
	      //  g.drawImage(image, 0, 0, ii.getIconWidth(), ii.getIconHeight(), null);
	/*	Graphics2D g2d = (Graphics2D) g;labe
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		//g2d.fillOval((int)x, (int)y, 30, 30);
		g2d.setColor(Color.red);
		//g.fillOval(x, y, diameter, diameter);
		for(int i=0;i<8;i++)
		{
		g2d.drawOval((int)x[i],(int) y[i],30, 30);
		}*/
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Image img;
		
		 circlepanel panel = new circlepanel();
		// background back = new background();
		JFrame frame = new JFrame("Mini Tennis");
		Game game = new Game();  
	/*---------------add background-
		 ImageIcon icon = new ImageIcon("C:\\Users\\smaillhk\\eclipse-workspace\\tryagain\\src\\8821inner.png");
		  JLabel label = new JLabel(icon);
		  frame.add(label);		
  */ 
		ii = (ImageIcon) icon;
		image = ii.getImage();
		frame.add(game);//
		frame.setSize(ii.getIconWidth(), ii.getIconHeight());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground( Color.black );
		double rx = 726, ry = 467; //714, 493
		try {
	
			panel.addCirvle(new circle(rx,ry, 5, Color.blue,	 0.0,1.0,1.0,{100,200,300,400},{100,200,300,400}));
			panel.addCirvle(new circle(rx,ry, 5, Color.red,	 0.0,6.0,3.0));  // it bigger one time by increase r one time
			panel.addCirvle(new circle(rx,ry, 5, Color.green,	 0.0,8.0,2.0));
			panel.addCirvle(new circle(rx,ry, 5, Color.yellow, 0.0,3.0,3.0));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.add(panel);// so important. add panel to frame.. to draw
		while (true) {
			/*try {
					frame.getContentPane().add(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\smaillhk\\eclipse-workspace\\tryagain\\src\\8821innerer.png")))));
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			frame.pack();
			frame.setVisible(true);
			*/
		//	game.moveBall();
			game.repaint();// to refreach
		//	frame.setBackground( Color.black );
			panel.repaint();// to draw circle
		//	panel.printangel();
			Thread.sleep(70);
			
			 
		}
	}
	public Game() {
		//setBackground( Color.black );
		setLayout(new BorderLayout());
		
   //     JLabel background=new JLabel(new ImageIcon("C:\\Users\\smaillhk\\eclipse-workspace\\tryagain\\src\\8821inner.png"));
		thumb.setIcon(icon);
      //  add(background);
		add(thumb);
   //     background.setLayout(new FlowLayout());
		thumb.setLayout(new FlowLayout());
        
      //  System.out.println(background.getSize().getHeight()+" "+ background.getSize().getWidth());
	}
}