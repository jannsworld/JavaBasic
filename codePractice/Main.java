package codePractice;

public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        A b2 = new B(1);
        System.out.println(b1.a + b2.a);
    }
}
