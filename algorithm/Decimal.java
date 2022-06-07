package algorithm;

// 사용자가 숫자를 입력하면, 소수인지를 판별하는 알고리즘

import java.util.*;

public class Decimal {

    public static void main(String[] args) {

        int num, j;
        Boolean isPrime = true;
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        //System.out.print(num);
        for (j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }//if
        }//for
        if (isPrime) {
            System.out.println("소수이다");
        } else {
            System.out.println("소수가 아니다");
        }
    }
}

