package collection;

class SampleCase<T> {
    // Field
    private T obj;

    // Constructor
    SampleCase(T x) {
        this.obj = x;
    }

    // Method
    T getObj() {
        return obj;
    }

    void printInfo() {
        System.out.println(obj.getClass().getName());
    }
}
public class Generic3 {
    public static void main(String[] args) {

        // [1] 객체 생성 : String
        SampleCase<String> s1 = new SampleCase<String>("안녕!");
        System.out.println(s1.getObj());
        s1.printInfo();

        // [2] 객체 생성 : Integer
        SampleCase<Integer> s2 = new SampleCase<Integer>(1000);
        System.out.println(s2.getObj());
        s2.printInfo();

        // [3] 형변환 없이 사용하기
        System.out.println(s1.getObj().length());

    }
}
