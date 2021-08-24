

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
	public void angel(int ind)
	{
		double [][] index = new double [6][2]; 
		double [][] ans = new double [6][6]; 
		System.out.println("called");
		int n = 0;
		double rx = 0, ry = 0;
		if (ind == 0)
		{
			for (circle c : circles)
			{ 
				rx = c.getrX();
				ry = c.getrY();
				index[n][0] = c.getX();
				index[n][1] = c.getY();
				n++;
			//System.out.println(c.getX()+" "+ c.getY());
		
			}
		}
		else
		{
			--ind;
			for (circle c : circles)
			{
				rx = c.getrX();
				ry = c.getrY();
				index[n][0] = c.getaX(ind);
				index[n][1] = c.getaY(ind);
				n++;
			
		//		System.out.println(c.getaX(ind)+" "+ c.getaY(ind));
		
			}
		}
	//	System.out.println(rx+" "+ry);
		for(int i = 0; i <6; i++)
		{
			for(int j = 0; j <6; j++)
			{
				ans[i][j]= calculateAngle(rx,ry,index[i][0],index[i][1],index[j][0],index[j][1] );
				System.out.print(ans[i][j]+"	");
			}
			System.out.println(" ");
		}
		
		
		
		
	}
//https://www.triangle-calculator.com/?what=vc&a=959&a1=531&3dd=3D&a2=&b=974&b1=554&b2=&c=997&c1=593&c2=&submit=Solve&3d=0
	//http://www.ambrsoft.com/TrigoCalc/Triangles/3Points.htm
	double calculateAngle(double P1X, double P1Y, double P2X, double P2Y,
            double P3X, double P3Y){
 
    /*    double numerator = P2Y*(P1X-P3X) + P1Y*(P3X-P2X) + P3Y*(P2X-P1X);
        double denominator = (P2X-P1X)*(P1X-P3X) + (P2Y-P1Y)*(P1Y-P3Y);
        double ratio = numerator/denominator;

        double angleRad = Math.atan(ratio);
        double angleDeg = (angleRad*180)/Math.PI;

        if(angleDeg<0){
            angleDeg = 180+angleDeg;
        }

        return angleDeg;
        
		*/
		double ans = Math.atan((P2Y - P1Y)/(P2X-P1X))- Math.atan((P3Y-P1Y)/(P3X-P1X)) ;
		double angleRad = Math.atan(ans);
        double angleDeg = (angleRad*180)/Math.PI;

        if(angleDeg<0){
            angleDeg = 180+angleDeg;
        }

		return angleDeg;
    }
}
 