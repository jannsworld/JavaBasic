public class TypeConversion {
    public static void main(String[] args) {
        double dNum = 1.2;
        float fNum = 0.9F;

        int Num1 = (int) dNum + (int) fNum;
        int Num2 = (int) (dNum + fNum);

        System.out.println(Num1);
        System.out.println(Num2);

        int myNum = 10;
        int yourNum = 20;

        myNum += yourNum;
        System.out.println(myNum);
    }
}
