package programmers.lv0;

import java.util.Arrays;



public class 가까운_1_찾기_63 {
    public int solution(int[] arr, int idx) {
//        int n = t.length();
//        int[] dp = new int[n + 1];
//
//        // 초기화
//        for (int i = 0; i <= n; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }
//
//        // 기저 조건
//        dp[0] = 0;
//
//        // 동적 프로그래밍
//        for (int i = 1; i <= n; i++) {
//            for (String s : strs) {
//                if (t.startsWith(s, i - s.length())) {
//                    dp[i] = Math.min(dp[i], dp[i - s.length()] + 1);
//                }
//            }
//        }
//
//        // 결과 반환
//        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void testCase(int[] arr, int idx, int expected) {
        가까운_1_찾기_63 solution = new 가까운_1_찾기_63();

        int result = solution.solution(arr, idx);

        System.out.println("입력값 〉 "
                + Arrays.toString(arr) + ", "
                + idx
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
        int[][] arr = {
                {0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0}
        };
        int[] idx = {1, 4, 3};
        int[] expects = {3, -1, 3};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], idx[i], expects[i]);
        }
    }
}
