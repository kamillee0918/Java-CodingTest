package programmers.lv3;

import java.util.Arrays;

public class 거스름돈 {
    public int solution(int n, int[] money) {
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int coin : money) {
            System.out.println("coin = " + coin);
            for (int i = coin; i <= n; i++) {
                dp[i] += dp[i - coin];
            }
            System.out.println("2_dp: " + Arrays.toString(dp));
        }
        return dp[n] % 1000000007;
    }

    public static void testCase(int n, int[] money, int expected) {
        거스름돈 solution = new 거스름돈();

        int result = solution.solution(n, money);

        System.out.println("입력값 〉 "
                + n + ", "
                + Arrays.toString(money)
        );
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] n = {5};
        int[][] money = { {1, 2, 5} };
        int[] expects = {4};

        for (int i = 0; i < n.length; i++) {
            System.out.println("테스트 " + (i+1));
            testCase(n[i], money[i], expects[i]);
        }
    }
}
