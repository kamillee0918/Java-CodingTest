package programmers.lv0;

import java.util.Arrays;

public class 수열과_구간_쿼리_2_38 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = Integer.MAX_VALUE;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                }
            }

            if (min == Integer.MAX_VALUE) {
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }

        return answer;
    }

    public static void testCase(int[] arr, int[][] queries, int[] expected) {
        수열과_구간_쿼리_2_38 solution = new 수열과_구간_쿼리_2_38();

        int[] result = solution.solution(arr, queries);

        System.out.println("입력값 〉 "
                + Arrays.toString(arr) + ", "
                + Arrays.deepToString(queries)
        );
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {0, 1, 2, 4, 3} };
        int[][][] queries = { { {0, 4, 2}, {0, 3, 2}, {0, 2, 2} } };
        int[][] expects = { {3, 4, -1} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], queries[i], expects[i]);
        }
    }
}
