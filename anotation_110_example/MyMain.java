import java.lang.reflect.Method;

/**
 * (어노테이션 활용 예제)
 * 메서드(인터페이스) 여러 개 선언 한 뒤에 메서드 이름(혹은 어노테이션 속성)으로 값을 활용
 */
public class MyMain {
    public static void main(String[] args) {
        Method[] methodList = MyObject.class.getMethods();

        for (Method method : methodList) {
            if(method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation=method.getDeclaredAnnotation(MyAnnotation.class);
                String value=annotation.value();
                System.out.println(method.getName() + ":" + value);
            }
        }
    }
}
