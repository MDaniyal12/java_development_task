package robot;

import java.util.Scanner;

public class InputParser {

    public SimulationInput read() {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();
        Direction direction = Direction.valueOf(scanner.next().toUpperCase());

        String commands = scanner.next().toUpperCase();

        return new SimulationInput(rows, cols, startRow, startCol, direction, commands);
    }
}