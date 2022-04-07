public class Java_Switch {
    public static void main(String[] args) {
        // 입력된 연령대에 맞게 구역 추천
        int age = 19;

        // 사용자 입력 예외처리
        if (age > 10 && age < 20) {
            age = 10;
        } else if (age > 20 && age < 30) {
            age = 20;
        } else if (age > 30 && age < 40) {
            age = 30;
        } else {
            if (age < 10) {
                System.out.println("최소 입력 가능한 연령은 10대 이상으로, 프로그램은 종료됩니다.");
                System.exit(0);
            }
        }

        // switch 조건문, 변수 조건은 정수형
        switch (age) {
            case 10:
                System.out.println(age + "대 입니다. A구역을 추천합니다");
                break;
            case 20:
                System.out.println(age + "대 입니다. B구역을 추천합니다");
                break;
            case 30:
                System.out.println(age + "대 입니다. C구역을 추천합니다");
                break;
            default:
                System.out.println(age + "대 입니다. AA구역을 추천합니다");
                break;
        }
    }
}