package programmers.lv0;

import java.util.Arrays;

public class 마지막_두_원소_34 {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];

        System.arraycopy(num_list, 0, answer, 0, n);

        if (num_list[n - 1] > num_list[n - 2]) {
            answer[n] = num_list[n - 1] - num_list[n - 2];
        } else {
            answer[n] = num_list[n - 1] * 2;
        }

        return answer;
    }

    public static void testCase(int[] num_list, int[] expected) {
        마지막_두_원소_34 solution = new 마지막_두_원소_34();

        int[] result = solution.solution(num_list);

        System.out.println("입력값 〉 " + Arrays.toString(num_list));
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] num_lists = { {2, 1, 6}, {5, 2, 1, 7, 5} };
        int[][] expects = { {2, 1, 6, 5}, {5, 2, 1, 7, 5, 10} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_lists[i], expects[i]);
        }
    }
}
