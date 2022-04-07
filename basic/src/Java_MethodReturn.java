import java.util.Arrays;

public class Java_MethodReturn {

    // return 값이 2개 이상일 때는 배열로 값 받기
    public static int[] testMethod() {
        int num1 = 10;
        int num2 = 20;
        return new int[]{num1, num2};
    }

    public static void main(String[] args) {

        // 배열 변수 선언 -> 메서드로부터 반환받을 값이 배열이기 때문
        int result[] = testMethod();

        System.out.println(result[0] + " " + result[1]); // 각각 출력
        System.out.println(result[0] + result[1]); // 300
        System.out.println(Arrays.toString(result)); // 한번에 모든 요소 출력

        System.out.println(result); // 주소값 출력
    }
}
