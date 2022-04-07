abstract class Car {
    abstract void run();
}

class Ambulance extends Car {
    void run() {
        System.out.println("앰블런스 삐뽀삐뽀");
    }
}

class Cultivator extends Car {
    void run() {
        System.out.println("경운기 덜컹덜컹");
    }
}

class SportsCar extends Car {
    void run() {
        System.out.println("스포츠카 씽씽 ");
    }
}

public class Java_OOP_PolymorphismExample {
    public static void main(String[] args) {

        Car a1 = new Ambulance();
        Car a2 = new Cultivator();
        Car a3 = new SportsCar();

        a1.run();
        a2.run();
        a3.run();

        System.out.println("=======");

        // 배열로 Car 객체 배열 선언
        // Car[] cars = new Car[3];
        // System.out.println( cars[0] );  // null -> 각 배열에는 null 값만 존재.
        // cars = new Car[]{ new Ambulance(), new Cultivator(), new SportsCar() }; cars 배열 초기화

        //  자식 클래스로 객체 생성 -> 타입은 부모 타입 -> 생성된 객체들로 바로 배열 초기화 : 다형성 특징
        Car[] cars = {new Ambulance(), new Cultivator(), new SportsCar()};

        // 반복문 돌면서 각 객체의 run() 메서드 호출
        for (int i = 0; i < cars.length; i++)
            // System.out.println( cars[i] );  // 각 객체가 생성된 메모리 공간의 주소 값을 출력.
            cars[i].run();

        // 향상된 for문
        System.out.println("=======");
        for (Car obj : cars)
            // System.out.println( obj );
            obj.run();

    }
}
