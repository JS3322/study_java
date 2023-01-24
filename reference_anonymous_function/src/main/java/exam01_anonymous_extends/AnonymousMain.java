package exam01_anonymous_extends;

public class AnonymousMain {
    public static void main(String[] args) {

        //1. 필드값으로 익명객체 사용
        Anonymous anonymous_1 = new Anonymous();
        anonymous_1.field.wake();
        anonymous_1.field.run();

        System.out.println("---------------------");
        //2. 메서드(지역변수)로 익명객체 사용
        anonymous_1.method1();

        //3. 매개변수로 익명객체 사용
        anonymous_1.method2(
                new Person() {
                    @Override
                    void wake() {
                        System.out.println("11시에 일어났습니다!!!");
                    }
                }
        );


    }
}
