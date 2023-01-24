package exam01_anonymous_extends;

public class Anonymous {

    //필드로 익명객체 사용법

    Person field = new Person() {
        int fieldInt;

        @Override
        void wake() {
            fieldInt = 9;
            System.out.println("늦잠 자서 7시에 일어납니다!");
            System.out.println(fieldInt+"까지 출근 해야 합니다!");
            work();
        }

        private void work() {
            System.out.println("학생들을 가르치는 교사입니다!");
        }
    };

    void method1() {
        //매개변수(인자값 혹은 전역변수의 라이프사이클에 따라 살아있다

        //지역변수 (메서드의 라이프사이클에 따라 변수가 활용(살아있다)
        int outputInt;

        //익명객체의 라이프 사이클 start
        Person localVar = new Person() {
            @Override
            void wake() {
                System.out.println("늦잠 자서 10시에 일어납니다!");
                work();
            }

            private void work() {
                System.out.println("학생들을 가르치는 교사입니다!!!!");
            }
        };
        //익명객체의 라이프 사이클 end


        localVar.wake();
    }

    void method2(Person person_1){
        person_1.wake();
    }

}
