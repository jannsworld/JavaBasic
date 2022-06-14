package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator2 {
    public static void main(String[] args) {

        // [1] 객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        // [2] 요소 추가 : add()
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // [3] Iterator(반복자) 객체 생성
        Iterator<Integer> iter = list.iterator();

        // [4] 출력 : 요소 삭제 전
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // [5-1] 요소 삭제 : 반복문없이 한 개 요소 삭제
//        System.out.println(list.get(1)); // 12
//        list.remove(1);
//        System.out.println(list.get(1)); // 13

        // [5-2] 요소 삭제 : while 반복문
        System.out.println("-----------------------");
//        for(Integer num : list){
//            System.out.print(num + " ");

        while (iter.hasNext()) {
            Integer num = iter.next();
            if (num == 2) {
                iter.remove();
                System.out.println(num + "번 삭제");
            }
        }
        System.out.println("-----------------------");

        // [6] 출력 : 요소 삭제 후
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
