package interaction;

public class StudentTest {
    public static void main(String[] args) {

        Student st = new Student();

        st.studentID = 20220408;
        st.studentName = "HJ";
        st.address = "서울특별시";

        st.showStudentInfo();

        Student st2 = new Student();
        st2.studentID = 2022;
        st2.setStudentName("SSS");
        st2.address = "경기도";

        st2.showStudentInfo();
    }
}
