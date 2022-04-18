// 메소드로 구구단

public class Gugudan_Method {
    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    // 메인만 별도 클래스를 분리해, 메소드와 클래스 분리
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = calculate(i);
            print(result);
        }
    }
}