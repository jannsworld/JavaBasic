// 랜덤으로 10개의 정수값을 추출하고, 그 중 최대값 최소값을 각각 구하기

public class Java_Random {
    public static void main(String[] args) {

        // 정수 배열 선언
        int[] ar = new int[10];

        System.out.print("랜덤 10개의 정수 값 : ");
        // 반복문 돌며 랜덤 10개 정수값 :Math.random - (int) 형
        for (int i = 0; i < ar.length; i++) {

            ar[i] = (int) (Math.random() * 10);
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        //최대값, 최소값 변수 초기화 : 첫번째 원소를 동일하게 max, min으로 설정 가능
        int max = ar[0], min = ar[0];
//        System.out.println(max);
//        System.out.println(min);

        // 반복문 돌며 최대값, 최소값 비교
        for (int i = 0; i < ar.length; i++) {

            // 최대값 비교
            if (max < ar[i]) {
                max = ar[i];
            }

            // 최소값 비교
            if (min > ar[i]) {
                min = ar[i];
            }
        }

        System.out.println("ar 배열 내 최대값 : "+ max);
        System.out.println("ar 배열 내 최소값 : "+ min);
    }
}
