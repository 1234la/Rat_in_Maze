package com.finalproject.ratinmaze;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JFrame;
//import javax.swing.Timer;

public class Maze {
	public static final int WIDTH = 462;
	public static final int HEIGHT = 485;
	
	public static void main(String[] args) {
		new Maze();
	}
	
	public Maze() {
		JFrame f = new JFrame();
		//Timer timer = new Timer(1000, this);
		f.setTitle("Rat in Maze");
		f.add(new Board());
		f.pack();
		f.setSize(WIDTH,HEIGHT); 
		f.setLocationRelativeTo(null); //set the thing perfectly centered in screen
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//timer.start();
	}
}
