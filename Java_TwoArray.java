public class Java_TwoArray {
    public static void main(String[] args) {

        // String 타입의 2차원 배열
        String[][] places = {
                {"A", "B", "C"},
                {"D", "E", "F"},
        };
        System.out.println(places[0]); //1차원 배열 주소 참조하는 값 출력

        System.out.println(places[0][1]); // 실제 요소의 값 출력
        System.out.println(places[1][1]);

        System.out.println(places.length); // 2
        System.out.println(places[0].length); // 3

        // 반복문 활용한 String 2차원 배열
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                System.out.print(places[i][j] + " ");
                System.out.println();
            }
        }

        // charAt()메서드 -> 해당 인덱스 값 반환 ->char 배열에 한글자씩 저장
        String[] names = {"Aone", "Bone", "Cone"};
        System.out.print(names[0].charAt(1)+ " "); // o
        System.out.print(names[1].charAt(2)+ " "); // n
        System.out.print(names[2].charAt(3)+ " ");  // e

        System.out.println();

        // length : 배열의길이, length() : 문자열의 길이
        for(int i =0; i< names.length; i++){
            for(int j=0; j<names[i].length(); j++){
                System.out.print(names[i].charAt(j));
            }
        }
    }
}
