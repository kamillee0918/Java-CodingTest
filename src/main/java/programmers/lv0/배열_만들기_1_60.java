package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_1_60 {
    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void testCase(int n, int k, int[] expected) {
        배열_만들기_1_60 solution = new 배열_만들기_1_60();

        int[] result = solution.solution(n, k);

        System.out.println("입력값 〉 "
                + n + ", "
                + k
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
        int[] n = {10, 15};
        int[] k = {3, 5};
        int[][] expects = { {3, 6, 9}, {5, 10, 15} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(n[i], k[i], expects[i]);
        }
    }
}
