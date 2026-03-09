package commands;

import robot.Robot;

public class LeftCommand implements Command {

    @Override
    public void execute(Robot robot) {
        robot.turnLeft();
    }
}
