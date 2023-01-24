/**
 * @Process: fix
 * @Project_Name: module
 * @Package_Name: pattern.adapter
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: Program.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.adapter.robot;

import pattern.command.Robot;
import pattern.command.RobotKit;

class CommandOrderAdapter extends Command {
    private Order order;

    public CommandOrderAdapter (Order _order) {
        order = _order;
    }

    public void execute () {
        order.run(robot);
    }
}

public class Program {

    public static void main(String[] args) {
        RobotKit robotKit = new RobotKit();
/*
        robotKit.addCommand(new pattern.adapter.robot.MoveForwardCommand(2));
        robotKit.addCommand(new pattern.adapter.robot.TurnCommand(Robot.Direction.LEFT));
        robotKit.addCommand(new pattern.adapter.robot.MoveForwardCommand(1));
        robotKit.addCommand(new pattern.adapter.robot.TurnCommand(Robot.Direction.RIGHT));
        robotKit.addCommand(new pattern.adapter.robot.PickupCommand());
*/
        robotKit.start();
    }
}