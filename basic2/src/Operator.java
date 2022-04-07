public class Operator {
    public static void main(String[] args) {

        int gameScore = 150;
        int lastScore = ++gameScore; // gameScore += 1; gameScore = gameScore+1;
        int lastScore2 = gameScore++;

        System.out.println(lastScore);
        System.out.println(gameScore);

    }

}

// ++ val = (--)++num; 문장 이전에 먼저 (감소)증가
//++ val = num++(--); 문장 끝나고 증가(감소)

