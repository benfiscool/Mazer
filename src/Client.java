import java.util.Scanner;

public class Client {
	public static String[][] maze;
	static int rows = 5;
	static int columns = 8;
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("What line would you like to start on? ");
		int l = scan.nextInt();
		while (l < 1 || l > rows) {
			System.out.print("Please enter a valid number between 1 and " + rows + "! ");
			l = scan.nextInt();
		}
		l -= 1;
		Mazer m = new Mazer(rows,columns);
		maze = m.grid();
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < columns; c++) {
				System.out.print("\t" + maze[r][c]);
			}
			System.out.println();
		}
	}
}
