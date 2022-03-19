public class If_Basic {
    public static void main(String[] args) {

        int kor = 10, eng = 90, math = 90; // 변수 선언
        int total_score;
        total_score = kor + eng + math;

        // if~ else if ~else 조건문
        if (total_score >= 270) {
            System.out.println("총 점수는 " + total_score + "점 입니다!");
            System.out.println("축하해요 A! 아주 잘했습니다");
        } else if (total_score >= 240) {
            System.out.println("총 점수는 " + total_score + "점 입니다!");
            System.out.println("잘했어요 B! 하지만 조금 더 노력하면 좋겠네요!");
        } else {
            System.out.println("총 점수는 " + total_score + "점 입니다!");
            System.out.println("C+! 다음번에는 더 나아진 모습을 보여줘요!");
        }
    }
}
