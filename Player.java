public class Player
{
	boolean colour;

	public Player (boolean c)
	{
		colour = c;
	}

	public void placeBead(Board board, int x, int y)
	{
		board.getGrid().getPeg(x, y).addBead(colour);
	}
}