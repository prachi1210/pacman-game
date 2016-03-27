package pacman;

import java.awt.Frame;

public class Main {

	public static void main(String[] args) {
		Frame app=new Frame("PacMan");
		
		PacModel world=new PacModel();
		PacView screen=new PacView(world);
		
		app.add(screen);
		app.pack();
		app.setVisible(true);

	}

}
