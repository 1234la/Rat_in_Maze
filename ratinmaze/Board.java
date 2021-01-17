package com.finalproject.ratinmaze;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private Map map;
	private Player rat;
	private Menu menu;
	private boolean win = false;
	private String message = "";
	private Font font = new Font("Poppins", Font.BOLD, 48);
	
	public static enum STATE{
		MENU,
		GAME
	};
	
	public static STATE state = STATE.MENU;
	
	//constructor
	public Board() {
		map = new Map();
		rat = new Player();
		menu = new Menu();
		
		addKeyListener(new ActionListener());
		setFocusable(true);
		this.addMouseListener(new MouseInput());
		
		timer = new Timer(25, this);
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(state == STATE.GAME) {
			if(map.getMap(rat.getTileX(), rat.getTileY()).equals("f")) {
			message = "You Win!";
				win = true;
			}
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		if(state == STATE.GAME) {
			if(!win){
				for(int y = 0; y < 14; y++) {
					for(int x = 0; x < 14; x++) {
						if(map.getMap(x, y).equals("g")) {
							g.drawImage(map.getGrass(), x * 32, y * 32, null);
						}
						if(map.getMap(x, y).equals("w")) {
							g.drawImage(map.getWall(), x * 32, y * 32, null);
						}
						if(map.getMap(x, y).equals("f")) {
							g.drawImage(map.getFinish(), x * 32, y * 32, null);
						}
					}
				}
				g.drawImage(rat.getPlayer(), rat.getTileX() * 32, rat.getTileY() * 32, null);
			} 
			
			if(win){
//				JOptionPane.showMessageDialog(null, "Congratulations, you've beaten the level!", "End Game", JOptionPane.INFORMATION_MESSAGE);
				g.setColor(Color.BLACK);
				g.setFont(font);
				g.drawString(message, 100, 243);
			}
		
		}
		else if(state == STATE.MENU) {
			menu.paint(g);
		}
//		g.fillRect(45, 60, 32, 32);
		
	}

	public class ActionListener extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			
			if(state == STATE.GAME) {
				if(keycode == KeyEvent.VK_W) {
					if(!map.getMap(rat.getTileX(), rat.getTileY() - 1).equals("w"))
						rat.move(0, -1);
				}
				if(keycode == KeyEvent.VK_A) {
					if(!map.getMap(rat.getTileX() - 1, rat.getTileY()).equals("w"))
						rat.move(-1, 0);
				}
				if(keycode == KeyEvent.VK_S) {
					if(!map.getMap(rat.getTileX(), rat.getTileY() + 1).equals("w"))
						rat.move(0, 1);
				}
				if(keycode == KeyEvent.VK_D) {
					if(!map.getMap(rat.getTileX() + 1, rat.getTileY()).equals("w"))
						rat.move(1, 0);
				}
			}
			
		}
		
		public void keyReleased(KeyEvent e) {
			
		}
		
		public void keyTyped(KeyEvent e) {
			
		}
	}
}
