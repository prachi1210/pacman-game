package pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacListener implements KeyListener {
	
	PacModel world;
	public PacListener(PacModel world) {
		this.world=world;
	}

	//@Override
	public void keyPressed(KeyEvent ke) {
		int code= ke.getKeyCode();
		if(code==KeyEvent.VK_LEFT){
			world.pacdirection=PacModel.left;
		}
		else if(code==KeyEvent.VK_RIGHT){
			world.pacdirection=PacModel.right;
		}
		else if(code==KeyEvent.VK_UP){
			world.pacdirection=PacModel.up;
		}
		else if(code==KeyEvent.VK_DOWN){
			world.pacdirection=PacModel.down;
		}
	}

	//@Override
	public void keyReleased(KeyEvent arg0) {}

	//@Override
	public void keyTyped(KeyEvent arg0) {}
}
