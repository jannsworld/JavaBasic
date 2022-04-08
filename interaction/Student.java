package interaction;

public class Student {

    String studentName;
    int studentID;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public void showStudentInfo() {
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

}
