package robot;

public enum Direction {
    N(-1, 0),
    E(0, 1),
    S(1, 0),
    W(0, -1);

    private final int rowDelta;
    private final int colDelta;

    Direction(int rowDelta, int colDelta) {
        this.rowDelta = rowDelta;
        this.colDelta = colDelta;
    }

    public int getRowDelta() {
        return rowDelta;
    }

    public int getColDelta() {
        return colDelta;
    }

    public Direction turnLeft() {
        return values()[(this.ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(this.ordinal() + 1) % 4];
    }
}