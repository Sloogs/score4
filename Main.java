public class Main
{
	public static void main(String[] args)
	{
		// This enables debugging.
		Debug.enable();
		Debug.log("Initalizing game and creating elements.");
		Board board = new Board();
		Player player = new Player(false);
		player.placeBead(board, 1,1);
	}
}