package pacman;
import java.util.ArrayList;

public class PacModel {

	private String startboard=
			 "###################\n"
			+"#o...............o#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.....##..##......#\n"
			+"#.....#....#......#\n"
			+"#.....######......#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#.................#\n"
			+"#o...............o#\n"
			+"###################\n";
	
	private ArrayList<ArrayList<Character>> board = new ArrayList<ArrayList<Character>>();
	
	public PacModel()
	{
		for(String row:startboard.split("\n")){
			
			ArrayList<Character> r= new ArrayList<Character>();
			for(int i=0;i<row.length();i++)
			{
				r.add(row.charAt(i));
			}
				
			board.add(r);
		}
	}

	public int getHeight() {
		return board.size();
	}

	public int getWidth() {
		return board.get(0).size();
	}

	public char getCell(int x, int y) {	
		return board.get(y).get(x);
	}	
}
