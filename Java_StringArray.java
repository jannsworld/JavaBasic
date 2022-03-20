public class Java_StringArray {

    public static void main(String[] args) {

        // String 형태 배열 선언과 동시에 특정 값으로 초기화
        String[] names = {"Aone", "Bone", "Cone" };
        System.out.println(names[1]);

        // 반복문 이용해 배열 값 모두 출력
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");

        }
        System.out.println();
        // 향상된 for문으로 출력
        for (String aaa : names)
            System.out.print(aaa + " ");

    }
}