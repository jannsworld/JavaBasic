// scores = {88, 50, 35, 100, 91, 100, 99, 61}; 내림차순으로 1등부터 정렬

import java.util.Arrays;
import java.util.Collections;

public class Java_OrderDescending {
    public static void main(String[] args) {

        Integer[] scores = {88, 50, 35, 100, 91, 100, 99, 61}; // int의 Wrapper class인 Integer로 배열 선언
        Arrays.sort(scores, Collections.reverseOrder()); // 내림차순 정렬시, Arrays.sort(배열명, Collections.reversOrder())

        System.out.print("내림차순으로 정렬된 Scores :");
        for (int i : scores) {
            System.out.print( i + "  ");
        }
    }
}
