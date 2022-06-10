package collection;

import java.util.ArrayList;

public class ArrayList2<T> {
    public static void main(String[] args) {

        // [0] ArrayList 객체 생성 : 제네릭 사용
        ArrayList<String> ar = new ArrayList<String>();

        // [1] 추가
        ar.add("홍길동");
        ar.add("강감찬");
        ar.add("장발장");
        ar.add("이순신");
        ar.add("을지문덕");
        ar.add("홍길동");
        System.out.println(ar.get(3)); // 형 변환 없이 바로 사용 가능해 타입 안전성이 높아짐
        ar.get(0);

        // [2] 수정 : set(인덱스, 수정값)
        ar.set(3, "징기스칸");
        System.out.println(ar.get(3));

        // [3] 삭제 : 1)하나 삭제== remove(인덱스) 2) 모두 삭제 == removeall(인덱스)
        ar.remove(3);

        // [4] 출력 : 향상된 for문
        for (String str1 : ar)
            System.out.print(str1 + " ");
        System.out.println();

        // [5] 출력2
        for (int i = 0; i < ar.size(); i++)
            System.out.print(ar.get(i) + " ");

        // [6] 출력3
        for (int i = 0; i < ar.size(); i++)
            System.out.printf("%d번 학생의 이름은 %s 입니다. %n", i, ar.get(i));

    }
}
