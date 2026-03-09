
import commands.Command;
import commands.CommandFactory;
import robot.InputParser;
import robot.Robot;
import robot.SimulationInput;
import robot.Table;

public class Main {

    public static void main(String[] args) {
        try {
            InputParser parser = new InputParser();
            SimulationInput input = parser.read();

            Table table = new Table(input.getRows(), input.getCols());
            Robot robot = new Robot(
                    input.getStartRow(),
                    input.getStartCol(),
                    input.getDirection(),
                    table
            );

            CommandFactory commandFactory = new CommandFactory();

            for (char commandChar : input.getCommands().toCharArray()) {
                Command command = commandFactory.getCommand(commandChar);
                command.execute(robot);
            }

            System.out.println(robot.getPosition());

        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}