package mars_rover;

import static mars_rover.Rotation.isRotateLeftCommand;
import static mars_rover.Rotation.isRotateRightCommand;

class Command {

    private  Command() {
    }

    static boolean isRotationCommand(String command) {
        return isRotateLeftCommand(command) || isRotateRightCommand(command);
    }

    static boolean isCommandMoveForward(String command) {
        return command.equals("f");
    }

    static String currentCommand(String commandsSequence, int currentCommandPositionInSequence) {
        return commandsSequence.substring(currentCommandPositionInSequence, currentCommandPositionInSequence + 1);
    }
}
