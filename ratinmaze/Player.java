package com.finalproject.ratinmaze;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
//	private int x, y;
	private int tileX, tileY;
	private Image player;
	
	//constructor
	public Player() {
		ImageIcon img = new ImageIcon("C://Java-OOP//Final-Project//Assets//img//player.png");
		player = img.getImage();
		
		/* 32 is the original position */
//		x = 32; //initial variable
//		y = 32; 
		
		tileX = 1;
		tileY = 1;
	}
	
	public void move(int tx, int ty) {
//		x += dx;
//		y += dy;
		
		tileX += tx;
		tileY += ty;	
	}
	
	public Image getPlayer() {
		return player;
	}
	
//	public int getX() {
//		return x;
//	}
//	
//	public int getY() {
//		return y;
//	}
	
	public int getTileX() {
		return tileX;
	}
	
	public int getTileY() {
		return tileY;
	}
}
