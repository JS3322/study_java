/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.mediator
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: MediatorPattern.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.mediator;

public class MediatorPattern {
    public static void main(String[] args) {

        ModeSwitch modeSwitch = new ModeSwitch();
        ModeMediator modeMediator = new ModeMediator();

        modeSwitch.setModeMediator(modeMediator);

        modeMediator.addListener(new ListView());
        modeMediator.addListener(new GalleryView());
        modeMediator.addListener(new DataDownloader());

        modeSwitch.toggleMode();

        modeSwitch.toggleMode();

    }
}