

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

public class circlepanel extends JPanel {
	private List<circle> circles = new LinkedList<circle>();
	public void addCirvle(circle circle)
	{
		circles.add(circle);
		//this.repaint();
	}
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
	//	System.out.println("called");
		
		for (circle c : circles)
		{
			c.draw(g);
			
			
		/*	super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			//g2d.fillOval((int)x, (int)y, 30, 30);
			g2d.setColor(c.getColor());
			//g.fillOval(x, y, diameter, diameter);
			g2d.drawOval((int)c.getX(),(int) c.getY(),30, 30);*/
		}
	}
	public void print()
	{
		//System.out.println("called x");
		
		for (circle c : circles)
		{
			System.out.println( c.getX()+" "+ c.getY());
		}
		
	}
	public void printangel()
	{
		for (circle c : circles)
		{
			System.out.println( c.getangel());
		}
	}
	public void printY()
	{
		for (circle c : circles)
		{

		System.out.println(c.getY());
	
		}
	}
	
}
 