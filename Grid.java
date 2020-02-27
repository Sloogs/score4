public class Grid
{
	private final int ROWS = 4;
	private final int COLUMNS = 4;
	private Peg[][] pegs = new Peg[ROWS][COLUMNS];

	public Grid()
	{
		Debug.log("Creating grid.");
		for (int x = 0; x < ROWS; x++)
		{
			for (int y = 0; y < COLUMNS; y++) {
				pegs[x][y] = new Peg(x, y);
			}
		}
	}
}