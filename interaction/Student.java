package interaction;

public class Student {

    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo() {

        int total = korea.score + math.score;
        System.out.println(studentName + "님의 총점은 " + total + "점 입니다.");
    }

}
