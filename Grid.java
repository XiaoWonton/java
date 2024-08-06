public class Grid {

    // Declare instance variables
    private int numRows;
    private int numCols;
    private String[][] grid;

    // Constructor for Grid
    public Grid(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.grid = new String[numRows][numCols];
        initializeGrid();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumcols() {
        return numCols;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    public String[][] getGrid() {
        return grid;
    }

    // Method to initialize grid 
    private void initializeGrid() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = " ";
            }
        }
    }

    // display() method prints out grid
    public void display() {
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                System.out.print("[" + grid[i][j] + "] ");
            }
            System.out.print("\n");
        }
    }

    // place() method to put String into grid
    public void place(String str, int row, int col) {
        grid[row][col] = str;
    }
}
