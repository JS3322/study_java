/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.command
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: Program.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.command;

public class Program {

    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();

        robotKit.addCommand(new MoveForwardCommand(2));
        robotKit.addCommand(new TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new MoveForwardCommand(1));
        robotKit.addCommand(new TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new PickupCommand());

        robotKit.start();
    }
}