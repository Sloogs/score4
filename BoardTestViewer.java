import java.util.ArrayList;

public class BoardTestViewer {

    Board board;

    public BoardTestViewer(Board b)
    {
        board = b;
    }

    public void showBoard()
    {
        Peg[][] pegs = board.getGrid().getAllPegs();
        for(Peg[] row: pegs)
        {
            for (Peg peg: row) {
                int FirstRun=0;
                String[] XChange = {"A","B","C","D"};
                System.out.print("\n");
                ArrayList<Bead> beads = peg.getAllBeads();
                for (Bead bead: beads)
                {
                    FirstRun++;
    
                        if(FirstRun==1)
                            System.out.print(XChange[bead.getXCoord()] + bead.getYCoord() + ": ");
                        if(bead.getColour()==Colour.WHITE)
                            System.out.print("W");
                        else
                            System.out.print("B");
                }
            }
        }
    }

}
