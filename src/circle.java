
import java.awt.Color;
import java.awt.Graphics;
public class circle 
{
	private double x;
	private double y;
	private int diameter;
	private Color color;
	private double angel;
	private double r;
	private double v;
	//private double radians = 0;
	public double getX() {
		return x;
	}
	public double getY() {
		return y; 
	}
	public int getDiameter() {
		return diameter;
	}
	public Color getColor() 
	{
		return color;
	}
	public double getr()
	{
		return r;
	}
	public double getangel()
	{
		return angel;
	}
	public void update2()
	{
	/*	if ( angel > 1)
		{
		angel= angel - 1.0;
			
		}
		else
		{ 
			angel = 360;
			
			angel= angel - 1.0;
		}*/
		angel = angel + v;
		double radians = Math.toRadians(angel);
		x = x+ ((Math.cos(radians)) * r);//*R
	//	x = x+((Math.cos(angel))*r); 
		//System.out.println(x);
		y =  y+ ((Math.sin(radians))*r);
	//	y = y+((Math.sin(angel))*r); 
		
	}
	public void draw(Graphics g)
	{
	
		g.setColor(color);
		g.fillOval((int)x, (int)y, diameter, diameter);
		//g.drawOval(x, y,diameter, diameter);
	//	int r= 30;
		update2();
		
		
	}
	public circle(double x, double y, int diameter, Color color, double angel, double r, double v) {
		super();
		double radians = Math.toRadians(angel);
		//*R(Math.cos(radians))
		double mis = 56.7943250646551;// r of a 1:1 circle.. don't know what it mean yet
		double mis2 = r/v;  // how much time it is bigger than 1:1
		this.x = x	; //56.7943250646551  //113.5886501293097
		this.y = y - (mis *mis2);
		this.diameter = diameter;
		this.color = color;
		this.angel = angel;
		this.r = r;
		this.v = v;
	}

}
