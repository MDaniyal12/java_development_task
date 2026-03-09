package commands;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    public Command getCommand(char commandChar) {
        switch (commandChar) {
            case 'M':
                return new MoveCommand();
            case 'L':
                return new LeftCommand();
            case 'R':
                return new RightCommand();
            default:
                throw new IllegalArgumentException("Invalid command: " + commandChar);
        }
    }
}