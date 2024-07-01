package programmers.lv0;

import java.util.Arrays;

public class 가까운_1_찾기_63 {
    public int solution(int[] arr, int idx) {
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
