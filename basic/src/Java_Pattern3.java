// 짝수만, 5*5 형태로 출력

public class Java_Pattern3 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            for(int j=0; j<10; j++){

                int result = i*10 +j;
                System.out.print(result + " ");
                j++;
            }
            System.out.println();
        }
    }
}
