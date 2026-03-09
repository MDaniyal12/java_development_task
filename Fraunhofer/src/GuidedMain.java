
import commands.Command;
import commands.CommandFactory;
import robot.GuidedInputReader;
import robot.Robot;
import robot.SimulationInput;
import robot.Table;

import java.util.Scanner;

public class GuidedMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuidedInputReader reader = new GuidedInputReader();
        CommandFactory commandFactory = new CommandFactory();

        boolean continueRunning = true;

        while (continueRunning) {
            try {
                SimulationInput input = reader.read();

                Table table = new Table(input.getRows(), input.getCols());
                Robot robot = new Robot(
                        input.getStartRow(),
                        input.getStartCol(),
                        input.getDirection(),
                        table
                );

                for (char commandChar : input.getCommands().toCharArray()) {
                    Command command = commandFactory.getCommand(commandChar);
                    command.execute(robot);
                }

                System.out.println("\nFinal robot position:");
                System.out.println(robot.getPosition());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("\nDo you want to run another simulation? (Y/N)");
            String choice = scanner.next().trim().toUpperCase();
            continueRunning = choice.equals("Y");
        }

        System.out.println("Program finished.");
    }
}