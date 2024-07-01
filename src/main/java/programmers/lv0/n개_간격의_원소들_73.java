package programmers.lv0;

import java.util.Arrays;

public class n개_간격의_원소들_73 {

    public int[] solution(int[] num_list, int n) {
        int resultSize = (num_list.length - 1) / n + 1;
        int[] result = new int[resultSize];

        for (int i = 0; i < resultSize; i++) {
            result[i] = num_list[i * n];
        }

        return result;
    }

    public static void testCase(int[] num_list, int n, int[] expected) {
        n개_간격의_원소들_73 solution = new n개_간격의_원소들_73();

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
        int[][] num_list = { {4, 2, 6, 1, 7, 6}, {4, 2, 6, 1, 7, 6} };
        int[] n = { 2, 4 };
        int[][] expects = { {4, 6, 7}, {4, 7} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_list[i], n[i], expects[i]);
        }
    }
}
