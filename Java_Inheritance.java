class Person {
    // Field
    int gender;
    int power;

    //Constructor
    Person() {
        this.gender = 1; // 1 남성, 2 여성
        this.power = 100;
    }

    //Method
    void walk() {
        System.out.println("걸어가는 중!");
    }
}

class Hero extends Person {
    // Field
    String name;
    int age;

    // Constructor
    Hero() {
    }

    Hero(String name, int age) {
        super(); // 생략해도 자동으로 상속받은 부모의 생성자 먼저 호출됨
        this.name = name;
        this.age = age;
    }

    //Method - Override : 상속받아 사용하나 재정의
    void walk() {
        System.out.println("2배로 빨리 걸어가는 중!");
    }

    void eat() {
        System.out.println("밥 먹는 중~");
    }

    void displayPerson() {
        System.out.println("이름 :" + name + ", 나이 :" + age + ", 성별 :" + gender + ", 파워: " + power);
    }
}

class Villain {
}

public class Java_Inheritance {
    public static void main(String[] args) {

        // 객체생성
        Person p1 = new Person();
        p1.walk(); //p1.eat(); 경우 에러 - 해당 클래스에 없는 메소드이기에

        // 상속을 통한 슈퍼맨 객체 생성
        Hero h1 = new Hero("슈퍼맨", 20);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gender); // 부모클래스 필드(변수)사용 가능
        System.out.println(h1.power); // 부모클래스 필드(변수)사용 가능
        h1.displayPerson();


    }
}
