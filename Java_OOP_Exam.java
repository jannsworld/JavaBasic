class Person2 {

    // 속성 Attribute
    int age;
    String name;

    // 생성자 Constructor
    Person2() {
    }

    Person2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 메서드 Method
    void printPerson() {
        System.out.println("나이 :" + age + ", 이름 :" + name);
    }
}

public class Java_OOP_Exam {
    public static void main(String[] args) {

        //객체생성
        Person2 p1 = new Person2(20, "AAA");
        p1.printPerson();

        Person2 p2 = new Person2(40, "BBB");
        p2.printPerson();

    }
}
