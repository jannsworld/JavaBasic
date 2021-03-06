class Peoplee {
    // Field
    String name;
    int age;
    int weight;

    // Constructor
    Peoplee() {
    }

    Peoplee(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Method
    void wash() {
        System.out.println("씻다!");
    }

    void study() {
        System.out.println("공부하다!");
    }

    void play() {
        System.out.println("놀다!");
    }
}

interface Allowance {
    // Field
    // 변수는 안되나 상수는 가능하므로 public static final 붙여주는데 이는 생략 가능! * 인터페이스 내 모든 멤버 필드(변수)
    public static final String aaa = "한국";
    int bbb = 100;

    // Abstract Method - 인터페이스 내 모든 메서드는 public abstract 이어야 하고, default 값으로 생략 가능!
    public abstract void in(int price, String name);

    abstract void out(int price, String name);
}

interface Train {
    abstract void train(int train_pay, String name);
}

class Friend extends Peoplee implements Allowance, Train {
    // Field

    // Constructor
    Friend() {
    }

    Friend(String name, int age, int weight) {
        super(name, age, weight);
    }

    // Method
    public void in(int price, String name) {
        System.out.printf("%s에게서 %d만원 받았습니다",name, price);
    }

    public void out(int price, String name) {
        System.out.printf("%d만원 %s에서 사용했습니다",price, name);
    }

    public void train(int train_pay, String name) {
        System.out.printf("%s -> %d원 입금되었습니다",name,train_pay);
    }
}

public class Java_OOP_Interface {
    public static void main(String[] args) {

        // 객체 생성
        Friend f1 = new Friend("Jane", 20, 50);

        // 클래스와 인터페이스로부터 상속(Peoplee)과 구현(Allowance, Train) 메서드들 호출
        f1.wash();
        f1.study();
        f1.play();
        f1.in(10,"엄마");
        System.out.println();
        f1.out(5, "영화관");
        System.out.println();
        f1.train(5000, "동생");

        // 상수 필드 사용
        System.out.println();
        System.out.println(f1.aaa);
        System.out.println(f1.bbb);
    }
}

// Peoplee 클래스 - 부모
// A 인터페이스 - 부모
// B 인터페이스 - 부모

// Friend 클래스 - 자식
// 메인클래스 ( 메인 메서드가 포함 )
