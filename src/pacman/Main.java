package pacman;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {

	public static void main(String[] args) {
		Frame app=new Frame("PacMan");
		app.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}			
		});
		PacModel world=new PacModel();
		PacView screen=new PacView(world);		
		app.add(screen);
		app.pack();
		app.setVisible(true);
		
		screen.addKeyListener(new PacListener(world));
		
		while(!world.endgame())
		{
			world.changeworld();
			screen.repaint();
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}
			
		}

	}

}
