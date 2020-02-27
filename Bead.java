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
		Debug.log("Creating bead at: (x: " + x + ", y: " + y +", z: " + z + ")");
		Debug.log("Number of white beads: " + numWhite);
		Debug.log("Number of black beads: " + numBlack);
		Debug.log("Colour: " + colour);
		Debug.log("Bead Id: " + beadId);
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