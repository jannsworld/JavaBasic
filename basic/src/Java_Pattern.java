// 배열내 숫자들의 각 빈도 수를 출력하는 코드 구현
// [ 1, 3, 3, 2, 1, 1, 3, 0, 1, 2 ] 각 숫자별 빈도 수는?


public class Java_Pattern {
    public static void main(String[] args) {

        // 배열 생성
        int[] target = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};

        int[] ar = new int[4];

        for (int i = 0; i < target.length; i++)
            ar[target[i]]++;

        for (int i = 0; i < ar.length; i++)
            System.out.println(i + " 번 숫자 --> " + ar[i] + " 회");
        System.out.println();

    }
}














