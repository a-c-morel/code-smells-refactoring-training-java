package mars_rover;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RoverEqualityTests {
    @Test
    public void equalRovers() {
        assertEquals(new Rover(1, 1, Direction.N), new Rover(1, 1, Direction.N));
    }

    @Test
    public void notEqualRovers() {
        assertNotEquals(new Rover(1, 1, Direction.N), new Rover(1, 1, Direction.S));
        assertNotEquals(new Rover(1, 1, Direction.N), new Rover(1, 2, Direction.N));
        assertNotEquals(new Rover(1, 1, Direction.N), new Rover(0, 1, Direction.N));
    }
}
