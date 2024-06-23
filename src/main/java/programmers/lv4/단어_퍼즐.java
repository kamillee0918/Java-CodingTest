package programmers.lv4;

import java.util.Arrays;

public class 단어_퍼즐 {
    public int solution(String[] strs, String t) {
        int tLength = t.length();
        int[] dp = new int[tLength + 1];
        Arrays.fill(dp, tLength + 1);
        dp[0] = 0;

        for (int i = 1; i <= tLength; i++) {
            for (String str : strs) {
                if (t.startsWith(str, i - str.length())) {
                    dp[i] = Math.min(dp[i], dp[i - str.length()] + 1);
                }
            }
        }

        return dp[tLength] > tLength ? -1 : dp[tLength];
    }

    public static void testCase(String[] strs, String t, int expected) {
        단어_퍼즐 solution = new 단어_퍼즐();

        int result = solution.solution(strs, t);

        System.out.println("입력값 〉 "
                + Arrays.toString(strs) + ", "
                + '"' + t + '"'
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
        String[][] strs = {
                {"ba", "na", "n", "a"},
                {"app", "ap", "p", "l", "e", "ple", "pp"},
                {"ba", "an", "nan", "ban", "n"}
        };
        String[] t = {"banana", "apple", "banana"};
        int[] expects = {3, 2, -1};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(strs[i], t[i], expects[i]);
        }
    }
}
