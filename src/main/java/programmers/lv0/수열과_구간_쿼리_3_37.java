package programmers.lv0;

import java.util.Arrays;

public class 수열과_구간_쿼리_3_37 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int index1 = query[0];
            int index2 = query[1];

            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

        return arr;
    }

    public static void testCase(int[] arr, int[][] queries, int[] expected) {
        수열과_구간_쿼리_3_37 solution = new 수열과_구간_쿼리_3_37();

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
        int[][] arr = { {0, 1, 2, 3, 4} };
        int[][][] queries = { { {0, 3}, {1, 2}, {1, 4} } };
        int[][] expects = { {3, 4, 1, 0, 2} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], queries[i], expects[i]);
        }
    }
}
