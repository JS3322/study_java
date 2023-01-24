public class MyObject {
    @MyAnnotation
    public void testMethod1() {
        System.out.println("this is testMethod1");
    }

    @MyAnnotation(value = "my new Annotaion", test = "test value")
    public void testMethod2() {
        System.out.println("this is testMethod1");
    }
}
