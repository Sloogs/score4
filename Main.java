import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main
{
	public static void main(String[] args)
	{
		Debug.enable(); // This enables debugging messages.
		System.out.println("Welcome to Score 4!");

		Debug.log("Initalizing game and creating elements.");
		Board board = new Board();

		BoardTestViewer boardTestViewer = new BoardTestViewer(board);

		Player player1 = new Player(Colour.WHITE);
		Player player2 = new Player(Colour.BLACK);

		Scanner input = new Scanner(System.in);
		System.out.println("Please type a command: ");
		boolean running = true;
		while (running) {
			String inputString = input.nextLine();
			if (inputString.startsWith("add")) {
				String pattern = "add (black|white) bead to ([A-D][1-4]).";
				Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(inputString);
				m.matches();

				System.out.println(m.group(1));
				System.out.println(m.group(2));
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
}