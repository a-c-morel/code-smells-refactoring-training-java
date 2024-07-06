package mars_rover;

class Rotation {

    private Rotation() {
    }

    static boolean isRotateRightCommand(String command) {
        return command.equals("r");
    }

    static boolean isRotateLeftCommand(String command) {
        return command.equals("l");
    }

}
