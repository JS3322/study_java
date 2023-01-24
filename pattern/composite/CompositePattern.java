/**
 * @Process: complete
 * @Project_Name: module
 * @Package_Name: pattern.composite
 * @Made_By: JS
 * @The_creation_time: -
 * @File_Name: CompositePattern.java
 * @Version : v11.0.12
 * @contents: -
 */

package pattern.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Folder schoolFolder = new Folder("school");

        Folder grade1Folder = new Folder("1 grade");
        Folder grade2Folder = new Folder("2 grade");

        schoolFolder.add(grade1Folder);
        schoolFolder.add(grade2Folder);

        File enterPhoto = new File("admission photo", 256);
        grade1Folder.add(enterPhoto);

        Folder sem1Folder = new Folder("1st semester");
        Folder sem2Folder = new Folder("2st semester");

        grade2Folder.add(sem1Folder);
        grade2Folder.add(sem2Folder);

        File lecturePlan = new File("syllabus", 120);
        sem1Folder.add(lecturePlan);

        Folder projFolder = new Folder("project");
        sem2Folder.add(projFolder);

        File draft = new File("draft", 488);
        File finalResult = new File("report", 560);

        projFolder.add(draft);
        projFolder.add(finalResult);

        schoolFolder.getSize();

        schoolFolder.remove();
    }
}