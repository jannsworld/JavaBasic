// 정수로 이루어진 배열에서 최대값

public class Java_Max {
    public static void main(String[] args) {

        // 배열 선언
        int[] ar = {5, 13, 17, 19, 0, -1};

        // Math.max, Math.min 함수
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));

        // 배열 내 첫번째 원소 값이 제일 크다 가정하고 초기화
//        int max = Integer.MIN_VALUE;
        int max = ar[0];
        System.out.println("비교 전 배열 내 가장 큰 값 :" + max);

        //  for문 돌며 비교해 출력 : 비교 2번째부터 시작 i=1부터
        for (int i = 1; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];

            }
        }
        System.out.println("현재 배열 내 가장 큰 값 :" + max);

    }
}
