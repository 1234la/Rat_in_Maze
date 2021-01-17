package com.finalproject.ratinmaze;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		public Rectangle playButton = new Rectangle(Maze.WIDTH / 8 + 120, 150, 100, 50);
//		public Rectangle helpButton = new Rectangle(Maze.WIDTH / 8 + 120, 250, 100, 50);
//		public Rectangle quitButton = new Rectangle(Maze.WIDTH / 8 + 120, 350, 100, 50);
		int x = e.getX();
		int y = e.getY();
		
		//Play Button
		if (x >= Maze.WIDTH / 8 && x <= Maze.WIDTH / 8 + 220)
		{
			if(y >= 150 && y <= 200)
			{
				//Pressed Play Button
				Board.state = Board.STATE.GAME;
			}
		}
		
		//Help Button
		if (x >= Maze.WIDTH / 8 && x <= Maze.WIDTH / 8 + 220)
		{
			if(y >= 250 && y <= 300)
			{
				//Pressed Help Button
				JOptionPane.showMessageDialog(null, "Bantulah si tikus untuk mencari jalan keluar ! Tekan 'W', 'A' , 'S' , 'D' untuk menjalankan si tikus", "Help", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		//Quit Button
		if (x >= Maze.WIDTH / 8 && x <= Maze.WIDTH / 8 + 220)
		{
			if(y >= 350 && y <= 400)
			{
				//Pressed Quit Button
				System.exit(1);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
