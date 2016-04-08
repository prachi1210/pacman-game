package pacman;
import java.util.ArrayList;

public class PacModel {

	private String startboard=
			 "###################\n"
			+"#o...............o#\n"
			+"#.......##........#\n"
			+"#.....######......#\n"
			+"#.......##........#\n"
			+"#..#...........#..#\n"
			+"#.................#\n"
			+"#.....###.###.....#\n"
			+"#.....#.....#.....#\n"
			+"#.....#######.....#\n"
			+"#.................#\n"
			+"#..#...........#..#\n"
			+"#.......##........#\n"
			+"#.....######......#\n"
			+"#.......##........#\n"
			+"#o...............o#\n"
			+"###################\n";
	
	public float pacx=5, pacy=6;
	
	public final static int still=0, left =1, right =2, up=3, down =4;
	public int pacdirection = right;
	public int time=0;
	
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
	
	public void changeworld()
	{
		time+=1;
		if(pacdirection==left){
			pacx-=.1;
		}
		else if(pacdirection == right)
			pacx+=.1;
		else if (pacdirection==up)
			pacy-=.1;
		else if(pacdirection==down)
			pacy+=.1;
	}

	public boolean endgame() {
		return false;
	}
}
