package collection;
// 모든 타입을 다 받는 클래스

class Sample {
    //Field
    private Object obj;

    // Constructor
    Sample(Object x) {
        this.obj = x;
    }

    // Method
    public Object getObj() {
        return obj;
    }

    void printInfo() {
        System.out.println(obj.getClass().getName()); // 객체가 속하는 클래스의 정보 출력하는 메서드
    }
}

public class Generic1 {
    public static void main(String[] args) {

        // [1] 객체 생성 -> 문자열
        Sample s1 = new Sample("안녕하세요! ");
        System.out.println(s1.getObj());
        s1.printInfo();

        // [2] 객체 생성 -> 숫자
        Sample s2 = new Sample(100);
        System.out.println(s2.getObj());
        s2.printInfo();

        // [3] 객체 생성 -> Object
        Sample s3 = new Sample(new Object());
        System.out.println(s3.getObj());
        s3.printInfo();

    }
}
