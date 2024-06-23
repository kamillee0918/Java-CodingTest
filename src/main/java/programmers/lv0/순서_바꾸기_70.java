package programmers.lv0;

import java.util.Arrays;

public class 순서_바꾸기_70 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int index = 0;

        // n 번째 이후의 원소들을 먼저 추가함
        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }

        return answer;
    }

    public static void testCase(int[] num_list, int n, int[] expected) {
        순서_바꾸기_70 solution = new 순서_바꾸기_70();

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
        int[] n = { 1, 3 };
        int[][] expects = { {1, 6, 2}, {7, 5, 5, 2, 1} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_list[i], n[i], expects[i]);
        }
    }
}
