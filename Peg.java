import java.util.ArrayList;

public class Peg
{
	private int[] coordinates = new int[2];
	private int numBeads = 0;
	private Bead[] beads = new Bead[4];

	public Peg(int x, int y)
	{
		Debug.log("Creating peg at: " + x + ", " + y);
	}

	public void addBead(boolean colour, int x, int y, int z)
	{
		beads[numBeads] = new Bead(colour, x, y, z);
		numBeads++;
	}

	public void removeBead(Bead bead)
	{
		numBeads--;
	}
}