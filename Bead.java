public class Bead
{
	private static int numWhite;
	private static int numBlack;
	private boolean colour;
	private int beadId;
	private int xCoord;
	private int yCoord;
	private int zCoord;

	public Bead(boolean colour, int x, int y, int z)
	{
		Debug.log("Creating bead.");
		if (colour == false)
		{
			colour = false;
			beadId = numWhite + 1;
			numWhite++;
		}
		else
		{
			colour = true;
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
		return this.beadId;
	}
}