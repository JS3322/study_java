package exam01_anonymous_extends;

public class Person implements WayToWork {
    void wake() {
        System.out.println("매일 매일 6시에 일어납니다!");
    }

    @Override
    public void run() {
        System.out.println("Override1");
    }

    @Override
    public void car() {
        System.out.println("Override2");
    }
}
