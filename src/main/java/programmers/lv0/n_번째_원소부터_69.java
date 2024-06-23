package programmers.lv0;

import java.util.Arrays;

public class n_번째_원소부터_69 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

    public static void testCase(int[] num_list, int n, int[] expected) {
        n_번째_원소부터_69 solution = new n_번째_원소부터_69();

        int[] result = solution.solution(num_list, n);

        System.out.println("입력값 〉 "
                + Arrays.toString(num_list) + ", "
                + n
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
        int[][] num_list = { {2, 1, 6}, {5, 2, 1, 7, 5} };
        int[] n = { 3, 2 };
        int[][] expects = { {6}, {2, 1, 7, 5} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_list[i], n[i], expects[i]);
        }
    }
}
