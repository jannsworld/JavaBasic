package collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        // [1] ArrayList를 제네릭 아닌 Object 타입으로 사용하는 경우
        ArrayList list1 = new ArrayList();

        // [2] 데이터 추가
        list1.add("홍길동"); // 문자열 자료 저장
        list1.add(20);      // 정수 자료형 저장
        list1.add("이순신");
        list1.add(20); // 데이터 중복 가능

        // [3] 데이터 가져오기 : get() 이 때, 해당 데이터로 형 변환하여 사용
        // System.out.println(list1.get(0));
        // String str = list1.get(0) 불가한 이유가 Object 타입이기 때문

        String str = (String) list1.get(0);
        System.out.println(str.length());

        int num = (int) list1.get(1);
        System.out.println(num + 1000);

        System.out.println("====================");

        // [4] 출력 시, 반복문 사용 ( 배열 크기) : 객체명.size()

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
