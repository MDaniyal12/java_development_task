package robot;

public class SimulationInput {
    private final int rows;
    private final int cols;
    private final int startRow;
    private final int startCol;
    private final Direction direction;
    private final String commands;

    public SimulationInput(int rows, int cols, int startRow, int startCol, Direction direction, String commands) {
        this.rows = rows;
        this.cols = cols;
        this.startRow = startRow;
        this.startCol = startCol;
        this.direction = direction;
        this.commands = commands;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getStartRow() {
        return startRow;
    }

    public int getStartCol() {
        return startCol;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getCommands() {
        return commands;
    }
}