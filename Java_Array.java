public class Java_Array {
    // 배열의 선언 -> 배열 크기 지정 -> 배열 공간 값은 자동으로 초기화 셋팅(정수형:0, 실수형:0.0)

    //배열의 선언 1) 데이터타입 []배열명 = new 데이터타입[배열크기];
    //          2) 데이터타입 배열명[] = new 데이터타입[배열크기];

    public static void main(String[] args) {

        // 10명에 대한 값을 저장하는 배열 선언 및 크기 지정
        int[] scores = new int[10];
        int size = scores.length;

        System.out.println(size);

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[9]);

        // 5에 대한 값을 저장하는 배열 선언 및 크기 지정
        int [] table = new int[5];

        // 배열에 값 넣어주기
        table[0] =2;
        table[1] =11;
        table[2] =22;
        table[3] =33;
        table[4] =44;

        System.out.println(table[0]);
        System.out.println(table[4]);

    }
}