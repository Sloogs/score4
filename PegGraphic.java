/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics2D;
import java.awt.Rectangle;


/**
* makes a peg to be drawn on screen
* @author blybr
*/
public class PegGraphic
{
	private int n = 0;
	private BeadGraphic[] bead = new BeadGraphic[4];// array for beads
	private int xCoord;
	private int yCoord;


	/**
	 * constructs a peg with specific coordinates
	 * @param x
	 * @param y 
	 */
	public PegGraphic(int x, int y)
	{
		xCoord = x;
		yCoord = y;
		for(int i = 0; i < 4; i++)
		{
			bead[i] = new BeadGraphic(x - 8, y - ((i + 1) * 10));// ensures beads appear appropriatly
		}
	}

	/**
	 * draws peg with all beads on it
	 * @param g2 
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle Rect1 = new Rectangle(xCoord, yCoord - 60, 5, 60);
		g2.draw(Rect1); 
		for(int i = 0; i < n; i++) 
		{ 
			bead[i].draw(g2);    
		}
	}
		
	/**
	 * increments counter so beads become visible
	 */
	 public void addBead()
	 {  
		if(n<4)
		{
			n++;
		}
	 }

	/**
	 * returns coordinate
	 * @return 
	 */
	public int getX()
	{
		return this.xCoord;    
	}

	/**
	 * returns coordinate
	 * @return 
	 */
	public int getY()
	{
		return this.yCoord;    
	}
}