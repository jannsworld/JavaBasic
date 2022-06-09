package collection;

// 컴파일 에러는 안 나지만, 실행 시(형변환 관련) 에러 발생하는 경우

class Person {
    // Field
    public Object obj;

    // Constructor
    Person(Object obj) {
        this.obj = obj;
    }
}

class Student {
    // Field
    public int grade;

    // Constructor
    Student(int grade) {
        this.grade = grade;
    }

}

class Teacher {
}

public class Generic2 {
    public static void main(String[] args) {

        // [1] 객체 생성
        Person p1 = new Person("홍길동");
        System.out.println(p1.obj);

        Person p2 = new Person(new Student(2));
        System.out.println(p2.obj);

        // [2] 형 변환 Cast
        Teacher t1 = (Teacher) p1.obj; // 컴파일 에러는 안 나지만, 실행 시 에러 발생

    }
}
