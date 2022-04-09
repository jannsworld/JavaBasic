package interaction;

public class SubjectTest {

    public static void main(String[] args) {

        Student st = new Student(20220408, "HJ");
        st.setKoreaSubject("국어", 95);
        st.setMathSubject("수학", 92);

        Student st2 = new Student(2020, "YH");
        st2.setKoreaSubject("국어", 85);
        st2.setMathSubject("수학", 72);

        st.showScoreInfo();
        st2.showScoreInfo();
    }
}
