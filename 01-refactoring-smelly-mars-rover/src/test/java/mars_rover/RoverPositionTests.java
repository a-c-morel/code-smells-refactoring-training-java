package mars_rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RoverPositionTests {
    @Test
    public void facingNorthMoveForward() {
        Rover rover = new Rover(0, 0, Direction.N);

        rover.receive("f");

        assertEquals(new Rover(0, 1, Direction.N), rover);
    }

    @Test
    public void facingNorthMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.N);

        rover.receive("b");

        assertEquals(new Rover(0, -1, Direction.N), rover);
    }

    @Test
    public void facingSouthMoveForward() {
        Rover rover = new Rover(0, 0, Direction.S);

        rover.receive("f");

        assertEquals(new Rover(0, -1, Direction.S), rover);
    }

    @Test
    public void facingSouthMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.S);

        rover.receive("b");

        assertEquals(new Rover(0, 1, Direction.S), rover);
    }

    @Test
    public void facingWestMoveForward() {
        Rover rover = new Rover(0, 0, Direction.W);

        rover.receive("f");

        assertEquals(new Rover(-1, 0, Direction.W), rover);
    }

    @Test
    public void facingWestMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.W);

        rover.receive("b");

        assertEquals(new Rover(1, 0, Direction.W), rover);
    }

    @Test
    public void facingEastMoveForward() {
        Rover rover = new Rover(0, 0, Direction.E);

        rover.receive("f");

        assertEquals(new Rover(1, 0, Direction.E), rover);
    }

    @Test
    public void facingEastMoveBackward() {
        Rover rover = new Rover(0, 0, Direction.E);

        rover.receive("b");

        assertEquals(new Rover(-1, 0, Direction.E), rover);
    }
}
