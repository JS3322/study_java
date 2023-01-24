/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.factorymethod
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: FactoryMethod.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.factorymethod;

class FactoryMethod {

    public static void main(String[] args) {
        new Console().withoutFactory();
        new Console().withFactory();
    }
}