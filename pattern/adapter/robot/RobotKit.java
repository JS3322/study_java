package pattern.adapter.robot;

import java.util.ArrayList;

public class RobotKit {
    private Robot robot = new Robot();
    private ArrayList<pattern.adapter.robot.Command> commands = new ArrayList<pattern.adapter.robot.Command>();

    public void addCommand (pattern.adapter.robot.Command command) {
        commands.add(command);
    }
    public void start () {
        for (pattern.adapter.robot.Command command : commands) {
            command.setRobot(robot);
            command.execute();
        }
    }
}