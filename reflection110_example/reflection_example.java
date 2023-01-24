import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * class타입의 객체 가져오기
 */
public class reflection_example {
    public static void main(String[] args) throws Exception {


//        Class<Member> memberClass = Member.class;
//        System.out.println(System.identityHashCode(memberClass));
//
//        Member member = new Member("js", 23, "developer");
//        Class<? extends Member> memberClass2 = member.getClass();
//        System.out.println(System.identityHashCode(memberClass2));

        System.out.printf("----------------------------------------");

        Member member = new Member("js", 33, "develop");
        Class<? extends Member> memberClass = member.getClass();

        // 필드 접근 : getDeclaredFields() 인스턴스 변수를 가져옴
        Field[] fields = memberClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.get(member));
        }
        fields[0].set(member, "js2");
        System.out.println(member);

        // 메소드 접근
        Method speakMethod = memberClass.getDeclaredMethod("speak", String.class);
        speakMethod.invoke(member, "리플렉션 테스트");

        Method secretMethod = memberClass.getDeclaredMethod("secret");
        secretMethod.setAccessible(true);
        secretMethod.invoke(member);

    }
}
