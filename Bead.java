public class Bead
{
	private static numWhite;
	private static numBlack;
	private boolean colour;
	private int beadId;
	private int xCoord;
	private int yCoord;
	private int zCoord;

	public Bead(boolean colour, int x, int y, int z)
	{
		if (c == 0)
		{
			colour = 0;
			beadId = numWhite + 1;
			numWhite++;
		}
		else
		{
			colour = 1;
			beadId = numBlack + 1;
			numBlack++;
		}

		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public boolean getColour()
	{
		return this.colour;
	}

	public int getId()
	{
		return.this beadId;
	}
}