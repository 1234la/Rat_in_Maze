package com.finalproject.ratinmaze;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

public class Menu{
	public Rectangle playButton = new Rectangle(Maze.WIDTH / 8 + 120, 150, 100, 50);
	public Rectangle helpButton = new Rectangle(Maze.WIDTH / 8 + 120, 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Maze.WIDTH / 8 + 120, 350, 100, 50);
	
	public void paint (Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		Font font = new Font("Poppins", Font.BOLD,40);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("RAT IN MAZE", Maze.WIDTH /5, 100);
		
		Font font1 = new Font("Poppins",Font.BOLD,20);
		g.setFont(font1);
		g.drawString("Play", playButton.x + 27 , playButton.y + 33 );
		g2d.draw(playButton);
		g.drawString("Help", helpButton.x + 27 , helpButton.y + 33 );
		g2d.draw(helpButton);
		g.drawString("Quit", quitButton.x + 27 , quitButton.y + 33 );
		g2d.draw(quitButton);
	}
}
