class Personn {
    // Field
    private String name;
    private int age;
    private int height;

    // Constructor
    Personn() {
    }

    Personn(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void move() {
        System.out.println("이동 중~!");
    }
}

class Villainn extends Personn {
    // Field
    String unique_key;
    int weapon;

    // Constructor
    Villainn(String name, int age, int height ,String unique_key, int weapon) {
        super(name, age, height);
        this.unique_key = unique_key;
        this.weapon = weapon;
    }

    // Method
    public String getUnique_key() {
        return unique_key;
    }

    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public void printPersonn(){
        System.out.println("이름 " + getName());
        System.out.println("나이 " + getAge());
        System.out.println("키 " + getHeight());
        System.out.println("넘버 " + getUnique_key());
        System.out.println("무기 " + getWeapon());
        System.out.println("-------------------");
    }


}

public class Java_InheritancePrac {
    public static void main(String[] args) {

        // 객체생성
        Villainn v1 = new Villainn("좀비", 20, 180, "20220331", 1);
        v1.printPersonn();
        System.out.print(v1.getName()+ " ");
        v1.move();

        Villainn v2 = new Villainn("도깨비", 50, 220, "20020330", 3);
        v2.printPersonn();
        System.out.print(v2.getName()+ " ");
        v2.move();
    }

}
