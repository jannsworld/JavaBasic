public class Java_OOP_ParseInt {

    public static void main(String[] args) {

        // 숫자로 연산
        int a = 1;
        int b = 10;
        int c = a + b;
        System.out.println("a+b=" + c); // 11

        // 문자로 연산
        String a1 = "1";
        String b1 = "10";
        String c1 = a1 + b1;
        System.out.println("a1+b1=" + c1); //110
        System.out.println(c1.getClass().getName());

        // 문자열 -> 숫자로 바꿔 연산
        // Integer.parseInt()사용
        // parseInt() -> Integer 클래스의 static으로 지정, 객체 생성없이 바로 클래스명.parseInt()사용

        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        System.out.println(a2 + b2); // 11



    }
}
