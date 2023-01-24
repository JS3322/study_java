package driver;

public class Beginner {

    private static Beginner beginner_1 = new Beginner();
    private Beginner(){};
    public static Beginner getInstance() {
        return beginner_1;
    }
}
