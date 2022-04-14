// 배열내 숫자들의 각 빈도 수를 출력하는 코드 구현
// [ 1, 3, 3, 2, 1, 1, 3, 0, 1, 2 ] 각 숫자별 빈도 수는?

public class Java_Pattern {
    public static void main(String[] args) {
        // 배열 생성
        int[] target = {1, 3, 3, 2, 1, 1, 3, 0, 1, 2};

        // target 배열 원소의 갯수만큼 ar 배열 생성 : 0,1,2,3 - 4개
        int[] ar = new int[4];

        // target 배열 내 숫자가 ar 배열의 인덱스로 적용되 해당 인덱스의 ar 배열 요소의 값을 1씩 증가시킨다.
        for (int i = 0; i < target.length; i++) {
            ar[target[i]]++;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i + " 번 숫자 : " + ar[i] + " 회");
        }
        System.out.println();
    }
}














