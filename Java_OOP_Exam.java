class Person {

    // 속성 Attribute
    int age;
    String name;

    // 생성자 Constructor
    Person() {
    }

    Person(int age, String name) {
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
        Person p1 = new Person(20, "AAA");
        p1.printPerson();

        Person p2 = new Person(40, "BBB");
        p2.printPerson();

    }
}
