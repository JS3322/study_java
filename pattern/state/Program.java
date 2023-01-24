/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.state
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: Program.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.state;

public class Program {
    public static void main(final String[] args) {
        final ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onSwitch(); // "FROM LIGHT TO DARK"
        modeSwitch.onSwitch(); // "FROM DARK TO LIGHT"
        modeSwitch.onSwitch(); // "FROM LIGHT TO DARK"
        modeSwitch.onSwitch(); // "FROM DARK TO LIGHT"
    }
}