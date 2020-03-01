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

	public void addBead(Colour colour)
	{
		Bead bead = new Bead(colour, xCoord, yCoord, numBeads);
		beads.add(bead);
		numBeads++;
	}

	public void removeBead(Bead bead)
	{
		int x = bead.getXCoord();
		int y = bead.getYCoord();
		int z = bead.getZCoord();
		Debug.log("Removing bead at: (x: " + x + ", y: " + y + ", z: " + z);
		beads.remove(bead);
		numBeads--;
	}

	public Bead getBead(int n)
	{
		Bead bead = beads.get(n - 1);
		int x = bead.getXCoord();
		int y = bead.getYCoord();
		int z = bead.getZCoord();
		Debug.log("Getting bead at: (x: " + x + ", " + y + ")");
		return bead;
	}

	public ArrayList<Bead> getAllBeads()
	{
		Debug.log("Getting all beads.");
		return beads;
	}

	public int getXCoord() {
		return xCoord;
	}

	public int getYCoord() {
		return yCoord;
	}
}