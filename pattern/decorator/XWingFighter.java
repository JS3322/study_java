package pattern.decorator;

public class XWingFighter implements Fighter {
    @Override
    public void attack () {
        System.out.println("bullet firing");
    }
}