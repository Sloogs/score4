import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Score 4!");
		// Debug.enable(); // This enables debugging messages.
		Debug.log("Initalizing game and creating elements.");
		Board board = new Board();
		BoardTestViewer boardTestViewer = new BoardTestViewer(board);
		Player player = new Player(Colour.WHITE);
		player.placeBead(board, 1,1);
		player.placeBead(board, 1,1);
		player.placeBead(board, 1,1);
		player.placeBead(board, 1,1);
		player.placeBead(board, 1,1);
		Peg[][] pegs = board.getGrid().getAllPegs();

		Scanner input = new Scanner(System.in);

		System.out.println("Please type a command: ");

		boolean running = true;
		while (running) {
			String inputString = input.nextLine();
			if (inputString.contains("show beads")) {
				showBeads(pegs);
			}
			else if (inputString.contains("show board"))
			{
				boardTestViewer.showBoard();
			}
			else if (inputString.contains("quit"))
			{
				running = false;
			}
		}
	}

	public static void showBeads(Peg[][] pegs) {
		for (Peg[] row: pegs)
		{
			for(Peg peg: row)
			{
				ArrayList<Bead> beads = peg.getAllBeads();
				for (Bead bead: beads)
				{
					System.out.println("Bead (id: " + bead.getId()
							+ ") at: (x: " + bead.getXCoord()
							+ ", y:" + bead.getYCoord() + ")");
				}
			}

		}
	}
}