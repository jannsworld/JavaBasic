public class Java_IntString {
    public static void main(String[] args) {

        int a = 1000; // 정수 선언
        String str = "1000";
        System.out.println(str.length()); // str의 자릿수(길이) 구하기, 숫자의 자릿수를 구하기 위해 문자열로 선언

        String stra = String.valueOf(a); // 정수 ->문자열로 변환 -> 자릿수 구하기
        System.out.println(stra.length());

        System.out.println(str + 1); // 문자열로 계산
        System.out.println(a + 1); // 정수의 합으로 계산

        int b = Integer.valueOf(str); // 문자열 ->정수로 변환
        System.out.println(b + 1); // 정수의 합으로 계산 int b = Integer.valueOf(str); // 문자열 ->정수로 변환
    }

}
