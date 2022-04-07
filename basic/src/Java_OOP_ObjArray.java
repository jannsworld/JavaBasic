class People {
    // Field
    private String name;
    private int age;

    // Constructor
    People(){}
    People(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName(){return name;}
    public void setName(String name){this.name =name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
}

// 참조형 타입의 객체가 원소인 객체 배열 구현
public class Java_OOP_ObjArray {
    public static void main(String[] args) {

        // 객체생성
        int[] ar1 = {1, 2, 3}; //정수형 타입의 배열
        char[] ar2 = {'A', 'B', 'C'}; // 문자열 타입의 배열

        People[] pa = new People[3]; // <People 타입>의 객체 배열 공간 3개 생성
        pa[0] = new People("홍길동", 20);
        pa[1] = new People("춘향", 40);
        pa[2] = new People("몽룡", 35);


        // 출력

        // private 선언된 변수의 경우 getter, setter 메서드 사용해 값값 출력
       for (int i = 0; i < pa.length; i++) {
            System.out.println(pa[i].getName() + " " +pa[i].getAge() );
        }
        System.out.println();
    }
}
