import java.util.ArrayList;

public class Peg
{
	private int xCoord = 0;
	private int yCoord = 0;
	private int numBeads = 0;
	private ArrayList<Bead> beads = new ArrayList<Bead>();

	public Peg(int x, int y)
	{
		Debug.log("Creating Peg at: (x: " + x + ", y: " + y +")");
		xCoord = x;
		yCoord = y;
	}

	public void addBead(boolean colour)
	{
		Bead bead = new Bead(colour, xCoord, yCoord, numBeads);
		beads.add(bead);
		numBeads++;
	}

	public void removeBead(Bead bead)
	{
		numBeads--;
	}
}