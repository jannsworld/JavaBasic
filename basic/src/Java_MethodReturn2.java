import java.util.Arrays;

public class Java_MethodReturn2 {

    // return 값이 2개 이상일 때는 배열로 값 받기, String 타입

    public static String[] changeMethod(String a, String b) {
        String str1 = a.toUpperCase();
        String str2 = b.toLowerCase();

        String[] rst = {str1, str2};
        return rst;

    }

    public static void main(String[] args) {

        String[] result = changeMethod("korea", "CHINA");

        System.out.println(result); // 주소값 출력
        System.out.println(result[0]); // KOREA
        System.out.println(result[1]); // china
        System.out.println(Arrays.toString(result)); // 전체출력
    }
}
