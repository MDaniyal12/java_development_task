package robot;

public class Table {
    private final int rows;
    private final int cols;

    public Table(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Table size must be greater than zero.");
        }
        this.rows = rows;
        this.cols = cols;
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}