package exam;

import jdk.dynalink.beans.StaticClass;

public class ForExam1 {

    public static void main(String[] args) {
        System.out.println(ForExam1.check(1));
    }

    // static 메소드는 객체 생성 없이 메소드 사용 가능
    static String check (int num){
        return (num >=0) ? "positive" : "negative";
    }
}
