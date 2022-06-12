package collection;

import java.util.ArrayList;

public class ArrayListTwoArr<T> {
    public static void main(String[] args) {

        //[1] 객체 생성
        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();

        // [2] 요소 추가 : add()
        arr.add(new Integer[]{11, 12, 13, 14});
        arr.add(new Integer[]{21, 22, 23, 24});
        arr.add(new Integer[]{31, 32, 33, 34, 35, 36});

        //System.out.println(arr.get(0).length);  배열 int[], Interger[], String[] 길이를 알고 싶을 때
        //System.out.println(arr.get(0).length()); 문자열 길이 알고 싶을 때
        //System.out.println(arr.get(0).size()); 컬렉션 프레임워크 타입의 길이 알고 싶을 때

        // [3] 출력
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length; j++)
                System.out.print(arr.get(i)[j] + " ");
            System.out.println();
        }
    }
}
