public class Bead
{
	private static int numWhite;
	private static int numBlack;
	private Colour colour;
	private int beadId;
	private int xCoord;
	private int yCoord;
	private int zCoord;

	public Bead(Colour colour, int x, int y, int z)
	{
		Debug.log("Creating bead at: (x: " + x + ", y: " + y +", z: " + z + ")");
		if (colour == Colour.WHITE)
		{
			colour = Colour.WHITE;
			beadId = numWhite + 1;
			numWhite++;
		}
		else
		{
			colour = Colour.BLACK;
			beadId = numBlack + 1;
			numBlack++;
		}

		Debug.log("Number of white beads: " + numWhite);
		Debug.log("Number of black beads: " + numBlack);
		Debug.log("Colour: " + colour);
		Debug.log("Bead Id: " + beadId);
	}

	public Colour getColour()
	{
		return this.colour;
	}

	public int getId()
	{
		return this.beadId;
	}

	public int getXCoord()
	{
		return xCoord;
	}

	public int getYCoord()
	{
		return xCoord;
	}

	public int getZCoord()
	{
		return xCoord;
	}
}