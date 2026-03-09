package robot;

import java.util.Scanner;

public class GuidedInputReader {

    private final Scanner scanner = new Scanner(System.in);

    public SimulationInput read() {
        int rows = readPositiveInt("Enter table size - rows:");
        int cols = readPositiveInt("Enter table size - columns:");

        int startRow = readNonNegativeInt("Enter robot start row:");
        int startCol = readNonNegativeInt("Enter robot start column:");
        Direction direction = readDirection();

        String commands = readCommands();

        return new SimulationInput(rows, cols, startRow, startCol, direction, commands);
    }

    private int readPositiveInt(String message) {
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > 0) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid value. Please enter a positive integer.");
        }
    }

    private int readNonNegativeInt(String message) {
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value >= 0) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid value. Please enter 0 or a positive integer.");
        }
    }

    private Direction readDirection() {
        while (true) {
            System.out.println("Enter robot direction (N, E, S, W):");
            String value = scanner.next().trim().toUpperCase();

            try {
                return Direction.valueOf(value);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid direction. Please enter one of: N, E, S, W.");
            }
        }
    }

    private String readCommands() {
        while (true) {
            System.out.println("Enter movement commands (M, L, R):");
            String value = scanner.next().trim().toUpperCase();

            if (value.matches("[MLR]+")) {
                return value;
            }

            System.out.println("Invalid commands. Use only the letters M, L, and R.");
        }
    }
}