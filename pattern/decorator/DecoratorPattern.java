/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.decorator
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: DecoratorPattern.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {

        new XWingFighter().attack();

        new LaserDecorator(new XWingFighter()).attack();


        new PlasmaDecorator(
                new MissileDecorator(
                        new LaserDecorator(
                                new XWingFighter()
                        ))).attack();

    }
}