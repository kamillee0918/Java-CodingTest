package programmers.lv0;

import java.util.Arrays;

public class 카운트_업_41 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }

    public static void testCase(int start_num, int end_num, int[] expected) {
        카운트_업_41 solution = new 카운트_업_41();

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
        int[] start_num = {3, 11};
        int[] end_num = {10, 15};
        int[][] expects = { {3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(start_num[i], end_num[i], expects[i]);
        }
    }
}
