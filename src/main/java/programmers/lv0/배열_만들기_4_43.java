package programmers.lv0;

import java.util.Arrays;
import java.util.Stack;

public class 배열_만들기_4_43 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for (int j : arr) {
            while (!stk.isEmpty() && stk.peek() >= j) {
                stk.pop();
            }
            stk.push(j);
        }

        int[] answer = new int[stk.size()];

        for (int i = stk.size() - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }

        return answer;
    }

    public static void testCase(int[] arr, int[] expected) {
        배열_만들기_4_43 solution = new 배열_만들기_4_43();

        int[] result = solution.solution(arr);

        System.out.println("입력값 〉 " + Arrays.toString(arr));
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 4, 2, 5, 3} };
        int[][] expects = { {1, 2, 3} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], expects[i]);
        }
    }
}
