public class Java_MethodCall {

    // [!] Call by value -> 값에 의한 호출 = 값에 의해서(메서드)호출 : 메서드로 인자값을 넘길 때 해당 값을 복사해 넘기는 방식
    public static void sum(int a){
        a += 40;
        System.out.println(a);
    }

    // [!] Call by reference -> 참조값에 의한 호출
    public static void sum2(int[] b){
        System.out.println("sum2() 메서드 안에서 b 값 : " +b);
    }

    public static void main(String[] args) {

        //변수 선언과 메서드 호출
        int a = 10;
        sum(a);
        System.out.println(a);

        // Wrapper 클래스의 Integer 클래스 타입으로 변수b 선언, new 객체 생성해 해당 주소 값 메서드로 보내기
        // 객체 변수 선언
       int [] b = new int[3];
        sum2(b);
        System.out.println("main() 메서드 안에서 b 값 : " +b);
}
}
