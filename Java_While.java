public class Java_While {
    public static void main(String[] args) {
        // while 반복문으로 홀수, 짝수 구하기 : 1-30까지 중 홀수, 짝수만 출력

        //변수 선언
        int i = 1;

        //반복문을 돌며 홀수, 짝수 체크
        while(i<=30){
          if (i%2 == 0)
                System.out.print(i+ "  ");
//          if (i%2 != 0)
//                System.out.print(i+ "  ");

            //반복문 빠져나오기 위해 i 값을 반복 때마다 증가
            i++;
        }
    }
}
