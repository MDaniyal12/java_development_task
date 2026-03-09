package commands;

import robot.Robot;

public class MoveCommand implements Command {

    @Override
    public void execute(Robot robot) {
        robot.move();
    }
}