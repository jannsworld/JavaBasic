
class Machine {
    // 속성 (특징)
    int price;
    int year;
    String color;

    // 동작, 기능, 행동 - method -> 공통적인 동작
    void move() {
        System.out.println("Machine is moving forward.");
    }

    void dig() {
        System.out.println("Machine is digging.");
    }

    void grind() {
        System.out.println("Machine is grinding.");
    }
}

public class Java_OOP {
    public static void main(String[] args) {

        // 객체 생성
        Machine mc = new Machine(); // new를 통해 메모리 공간에 생성 + 주소 값 반환
        System.out.println(mc);

        // 생성된 객체 속성 값 입력
        mc.price = 10000;
        mc.year = 2022;
        mc.color = "yellow";

        //속성 값 출력
        String mc_price = String.format("%,d", mc.price); //1번방식
        System.out.println(mc_price);

        System.out.println(String.format("%,d", mc.price)); //2번방식

        System.out.println(mc.year);
        System.out.println(mc.color);

        // 동작 수행하기
        mc.move();
        mc.dig();
        mc.grind();
    }
}
