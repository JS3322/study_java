package pattern.command;

public class Robot {
    public enum Direction { LEFT, RIGHT }

    public void moveForward (int space) {
        System.out.println(space + " forward");
    }

    public void turn (Direction _direction) {
        System.out.println(
                (_direction == Direction.LEFT ? "left" : "right") + "change direction"
        );
    }

    public void pickup () {
        System.out.println("pick up");
    }
}