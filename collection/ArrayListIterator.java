package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {

        // [1] 객체 생성
        ArrayList<String> list = new ArrayList<>();

        // [2] 요소 추가 : add
        list.add("Alligator");
        list.add("Hippo");
        list.add("Ostrich");
        list.add("Donkey");

        // [3] Iterator(반복자) 객체 생성
//        System.out.println(hasNext()); 바로 사용하면 오류 발생하므로, 객체 생성 필요
        // Collection 인터페이스 : Iterator() 메서드 정의 : 이를 상속받는 List, Set 인터페이스이므로,
        // List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해 Iterator() 메서드 사용
        Iterator<String> iter = list.iterator();

        // [4] Iterator(반복자) 메서드 사용
        System.out.println(iter.hasNext()); // true : 첫 번째 요소 있으니깐
        System.out.println(iter.next());

        // [5] 요소 출력 : 향상된 for문
        for (String s : list)
            System.out.println(s);

        // [6] 요소 출력 : while 반복문 *배열 요소 전체 출력
        // Hippo 요소만 출력, Hippo 요소만 삭제
//        System.out.println("--------- Iterator(반복자)로 출력");
//        while (iter.hasNext()) {
//            String str = iter.next();
//            if ("Hippo".equals(str))
//                System.out.println(str);
//
//        }
        System.out.println("------------Iterator(반복자)로 출력");
        while (iter.hasNext()) {
            String str = iter.next();
            if ("Hippo".equals(str)) {
                iter.remove();
                System.out.println("하마 삭제!");
            }
        }
        System.out.println("------------Iterator(반복자)로 출력");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
