class Friends {
    String str1 = "난 부모 클래스";

    void method1() {
        System.out.println("에이에이~ 오예!");
    }

    void aa() {
        System.out.println("aa 출력!");
    }
}

class Coworker extends Friends {
    String str2 = "난 자식 클래스";

    void method1() {
        System.out.println("오버라이딩 aa");
    }

    void cc() {
        System.out.println("cc 출력! ");
    }
    void x(){
        method1();
        super.method1();
    }
}

public class Java_OOP_Polymorphism {
    public static void main(String[] args) {

        // 객체 생성 :
        Coworker c1 = new Coworker(); //부모 + 자식 클래스의 모든 자원을 다 쓸 수 있다.
        System.out.println(c1.str1);
        System.out.println(c1.str2);
        c1.method1();
        c1.aa();
        c1.cc();
        c1.x(); // 자식 클래스에서 오버라이딩된 부모 클래스 원본 메소드 호출하고자 super 사용

        System.out.println("");

        Friends c2 = new Coworker(); // 부모 자원만 쓸 수 있다. 하위(자식)클래스로 객체 만들면서 타입은 상위(부모) 타입을 쓰는 것 가능 - 다형성
        System.out.println(c2.str1);
//      System.out.println(c2.str2); c2.ccc();자식의 자원은 쓸 수 없다.
        c2.method1(); // 오버라이딩 - 자식의 메서드 실행 됨
        c2.aa();
        ((Coworker)c2).cc();   // 캐스트 하여 자식 메서드 호출

        System.out.println("");

        Friends f1 = new Friends();
        // Coworker f2 = new Friends(); 상위(부모)클래스를 객체로 생성하면서 타입은 하위(자식) 타입 쓰는 것은 불가
        System.out.println(f1.str1);
        f1.method1();



    }
}
