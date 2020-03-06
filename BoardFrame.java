/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *Ensures every board is built identically
 * @author blybr
 */
public class BoardFrame extends JFrame{
	private BoardComponent board;
	private JPanel panel;

	/**
	* makes a panel and a board
	*/
	 public BoardFrame()
	{
		board = new BoardComponent();
		panel = new PlayerPanel(board); // panel made to add component
		panel.setSize(300,300);
		panel.setLocation(500,0);
		add(panel);
		add(board); // board added to frame
	}	 
}