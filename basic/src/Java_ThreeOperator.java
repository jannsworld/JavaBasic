public class Java_ThreeOperator {
    public static void main(String[] args) {

        int hour=10;

        //삼항연산자 활용 : 10보다 크거나 같으면 100을 곱하고, 그 이외의 경우 변수 그대로 출력
        int test = hour>=10?hour*100:hour;
        System.out.println(test);

        // 12보다 작으면 오전, 12보다 크거나 같으면 오후
        String str = hour<12?"오전":"오후"; // 문자열 출력이기에 String 선언
        System.out.println(str);

    }
}
