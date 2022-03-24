
public class Java_Method {
    // # 메서드 종류 > 크게 4가지
    //1) 반환값 X , 인자값 X : 리턴타입 없다 - void
    //2) 반환값 X , 인자값 O : 호출부에서 파라미터 값을 넘긴다
    //3) 반환값 O, 인자값 X : 반환값 있다는 것은 호출에 따른 리턴값이 있는 것이므로 호출 시 리턴값을 받는 변수를 정의
    //4) 반환값 O, 인자값 O

    public static void showMenu() {
        System.out.println("showMenu() 메서드 호출");
    }

    public static void plusMethod(int a, int b) {

        //단순 출력
        System.out.printf("인자 넘겨받은 2개의 값 %d, %d입니다.%n", a, b);

        //연산 출력
        int rst = a + b;
        System.out.println("두 수를 더한 값 = " + rst);
    }

    public static int returnMethod() {
        int ret = 10;
        ret *= 10;
        return ret; //100
    }

    public static String capitalMethod(String str) {
        //문자열 변수 선언
        String rett = str.toUpperCase();
        return rett;

    }

    public static void main(String[] args) {

        //1) 반환값 X , 인자값 X 호출
        showMenu();

        //2) 반환값 X , 인자값 O : 호출부에서 파라미터 값을 넘긴다
        int a = 10, b = 20;
        plusMethod(a, b);

        //3) 반환값 O, 인자값X
        int rst2;
        rst2 = returnMethod();
        System.out.println("메서드 호출에 따른 리턴 값은 =" + rst2);

        //4) 반환값 O, 인자값 O
        // 문자열 변수 선언
        String rstt;
        rstt = capitalMethod("korea");
        System.out.println("입력한 소문자의 대문자는 =" + rstt);


    }
}
