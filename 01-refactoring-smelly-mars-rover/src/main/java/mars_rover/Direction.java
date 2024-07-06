package mars_rover;

enum Direction {
    E("E"), W("W"), N("N"), S("S");

    private final String text;

    Direction(final String text) {
        this.text = text;
    }

    static boolean isFacingNorth(Direction direction) {
        return direction.equals(faceNorth());
    }

    static Direction faceNorth() {
        return Direction.N;
    }

    static boolean isFacingSouth(Direction direction) {
        return direction.equals(faceSouth());
    }

    static Direction faceSouth() {
        return Direction.S;
    }

    static boolean isFacingWest(Direction direction) {
        return direction.equals(faceWest());
    }

    static Direction faceWest() {
        return Direction.W;
    }

    static Direction faceEast() {
        return Direction.E;
    }
}
