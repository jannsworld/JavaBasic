package algorithm;
/*
* [?] 주어진 배열의 값 중, 최댓값과 최솟값과 각각의 위치 구하기
 */

public class MinMax {

    public static void main(String[] args) {

        int[] arr = {10, 55, 23, 2, 79, 120, 0, 16, 82, 30, 45};

        int min = arr[0];
        int max = arr[0];
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
                minPos = i + 1;
            }

            // min과 max 비교를 위해 if 2개 모두 시행 되어야 하기에, if ~else 아닌, if 2개
            if (max < arr[i]) {
                max = arr[i];
                maxPos = i + 1;
            }
        }

        System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
        System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");
    }

}
