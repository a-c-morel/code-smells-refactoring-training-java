package mars_rover;

import java.util.Objects;

import static mars_rover.Command.*;
import static mars_rover.Direction.*;
import static mars_rover.Rotation.isRotateRightCommand;

class Rover {

    private Direction direction;
    private int y;
    private int x;

    Rover(int x, int y, Direction direction) {
        this.direction = direction;
        this.y = y;
        this.x = x;
    }

    void receive(String commandsSequence) {

        for (int currentCommandPositionInSequence = 0; currentCommandPositionInSequence < commandsSequence.length(); currentCommandPositionInSequence++) {
            String command = currentCommand(commandsSequence, currentCommandPositionInSequence);

            if (isRotationCommand(command)) {
                rotate(command);
            } else {
                move(command);
            }
        }
    }

    private void move(String command) {
        int displacement = isCommandMoveForward(command) ? 1 : -1;

        switch (direction) {
            case N:
                y += displacement;
                break;
            case S:
                y -= displacement;
                break;
            case W:
                x -= displacement;
                break;
            case E:
                x += displacement;
                break;
        }
    }

    private void rotate(String command) {
        if (isFacingNorth(direction)) {
            rotateWhileFacingNorth(command);
        } else if (isFacingSouth(direction)) {
            rotateWileFacingSouth(command);
        } else if (isFacingWest(direction)) {
            rotateWhileFacingWest(command);
        } else {
            rotateWhileFacingEast(command);
        }
    }

    private void rotateWhileFacingEast(String command) {
        if (isRotateRightCommand(command)) {
            direction = faceSouth();
        } else {
            direction = faceNorth();
        }
    }

    private void rotateWhileFacingWest(String command) {
        if (isRotateRightCommand(command)) {
            direction = faceNorth();
        } else {
            direction = faceSouth();
        }
    }

    private void rotateWileFacingSouth(String command) {
        if (isRotateRightCommand(command)) {
            direction = faceWest();
        } else {
            direction = faceEast();
        }
    }

    private void rotateWhileFacingNorth(String command) {
        if (isRotateRightCommand(command)) {
            direction = faceEast();
        } else {
            direction = faceWest();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (y != rover.y) return false;
        if (x != rover.x) return false;
        return Objects.equals(direction, rover.direction);

    }
}
