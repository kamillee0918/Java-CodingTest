package programmers.lv0;

import java.util.Arrays;

public class 카운트_다운_62 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int index = 0;

        for (int i = start_num; i >= end_num; i--) {
            answer[index++] = i;
        }

        return answer;
    }

    public static void testCase(int start_num, int end_num, int[] expected) {
        카운트_다운_62 solution = new 카운트_다운_62();

        int[] result = solution.solution(start_num, end_num);

        System.out.println("입력값 〉 "
                + start_num + ", "
                + end_num
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
        int[] start_num = {10, 10};
        int[] end_num = {3, 5};
        int[][] expects = {
                {10, 9, 8, 7, 6, 5, 4, 3},
                {10, 9, 8, 7, 6, 5}
        };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(start_num[i], end_num[i], expects[i]);
        }
    }
}
