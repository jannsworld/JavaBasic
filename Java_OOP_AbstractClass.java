abstract class Animal {
    abstract void cry();
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹야옹~");
    }
}

class Animal2 {
    void fly() {
        System.out.println("날다!");
    }
}

public class Java_OOP_AbstractClass {
    public static void main(String[] args) {

        // 추상클래스는 구체적 내용이 없기에 객체 생성할 수 없다.
        Animal2 dragon = new Animal2();
        dragon.fly();

        // 추상클래스 사용은 상속을 받아 사용한다
        // 추상(부모)클래스를 상속받은 자식 클래스에서 해당 메서드를 오버라이딩해 재정의한 후 사용

        Dog dog = new Dog();
        dog.cry();

        Cat cat = new Cat();
        cat.cry();

    }
}
