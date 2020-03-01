public class Player
{
	Colour colour;

	public Player (Colour c)
	{
		colour = c;
	}

	public void placeBead(Board board, int x, int y)
	{
		board.getGrid().getPeg(x, y).addBead(colour);
	}
}