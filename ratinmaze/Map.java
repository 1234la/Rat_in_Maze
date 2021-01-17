package com.finalproject.ratinmaze;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner map;
	private String mapArr[] = new String[14]; //14 tiles going down
	private Image grass, wall, finish;
	
	//constructor
	public Map() {
		
		ImageIcon img = new ImageIcon("C://Java-OOP//Final-Project//Assets//img//grass.png");
		grass = img.getImage();
		
		img = new ImageIcon("C://Java-OOP//Final-Project//Assets//img//wall.png");
		wall = img.getImage();
		
		img = new ImageIcon("C://Java-OOP//Final-Project//Assets//img//finish-line.png");
		finish = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass() {
		return grass;
	}
	
	public Image getWall() {
		return wall;
	}
	
	public Image getFinish() {
		return finish;
	}
	
	public String getMap(int x, int y) {
		String index = mapArr[y].substring(x, x + 1);
		return index;
	}
	
	private void openFile() {
		// TODO Auto-generated method stub
		//opening the file
		try {
			map = new Scanner(new File("C://Java-OOP//Final-Project//Assets//Map.txt"));
		} catch (Exception e) {
			System.out.println("Error loading map");
		}
	}
	
	private void readFile() {
		// TODO Auto-generated method stub
		while(map.hasNext()) {
			for(int i = 0; i < 14; i++) { //load the file
				mapArr[i] = map.next();
			}
		}
		
	}
	
	private void closeFile() {
		// TODO Auto-generated method stub
		map.close();
	}


}
