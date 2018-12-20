import java.util.Random;

public class Mazer {
	private static int rows;
	private static int columns;
	public static String[][] maze = new String[5][8];
	public String[][] grid() {	
		Random rand = new Random();
		int prob;
		String obstacle = "";
		boolean enabled = true;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				if (enabled == true) {
					prob = rand.nextInt(9) + 1;
					if (prob == 1) {obstacle = "|"; enabled = false;}
					else if (prob == 2 || prob == 3) {obstacle = "/"; enabled = false;}
					else if (prob == 4 || prob == 5) {obstacle = "\\"; enabled = false;}
					else {obstacle = ""; enabled = true;}
				}
				else {enabled = true; obstacle = "";}
				maze[r][c] = obstacle;
			}
		}
		return maze;
	}
	
	Mazer(int rin, int cin){
		rows = rin;
		columns = cin;
	}
}
