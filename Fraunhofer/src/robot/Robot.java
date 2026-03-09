package robot;

public class Robot {
    private int row;
    private int col;
    private Direction direction;
    private final Table table;

    public Robot(int row, int col, Direction direction, Table table) {
        if (!table.isValidPosition(row, col)) {
            throw new IllegalArgumentException("Initial robot position is outside the table.");
        }
        this.row = row;
        this.col = col;
        this.direction = direction;
        this.table = table;
    }

    public void move() {
        int newRow = row + direction.getRowDelta();
        int newCol = col + direction.getColDelta();

        if (table.isValidPosition(newRow, newCol)) {
            row = newRow;
            col = newCol;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public String getPosition() {
        return row + " " + col + " " + direction;
    }
}