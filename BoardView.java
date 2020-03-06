/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.JFrame;

/**
 * A tester class to test GUI
 * @author blybr
 */
public class BoardViewer {
	private static int width = 1000;
	private static int height = 1000;
	public static void main(String[] args)
	{
		JFrame aFrame = new BoardFrame();
		aFrame.setSize(width, height);//setting frame size
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ensuring program will stop when closed
		aFrame.setVisible(true);// making frame viewable                
	}
}
