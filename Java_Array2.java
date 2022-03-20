import java.util.Arrays;

public class Java_Array2 {

    public static void main(String[] args) {

        // 배열 선언과 동시에 특정 값으로 초기화
        int[] table = {11, 22, 33, 44, 55};
        // int [] table2 = new int[] {11, 22, 33, 44, 55};

        // 반복문을 사용하여 모든 값 출력
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }

        System.out.println();

        // 반복문 사용하지 않고 메서드로 배열의 요소 값 출력 - Arrays.toString()
        // toString() 인자 배열명, java.util.Arrays 임포트 후
        System.out.println(Arrays.toString(table));

    }
}