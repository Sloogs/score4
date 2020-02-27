import java.util.ArrayList;

public class Peg
{
	private int[] coordinates = new Integer[2];
	private int numBeads = 0;
	private ArrayList<Bead> beads = new ArrayList<Bead>;

	public void addBead(boolean colour, int x, int y)
	{
		beads.add(new Bead(colour, x, y));
		numBeads++;
	}

	public void removeBead(Bead bead)
	{
		beads.remove(bead);
		numBeads--;
	}
}