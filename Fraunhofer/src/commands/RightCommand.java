package commands;

import robot.Robot;

public class RightCommand implements Command {

    @Override
    public void execute(Robot robot) {
        robot.turnRight();
    }
}