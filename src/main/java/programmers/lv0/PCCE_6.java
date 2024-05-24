package programmers.lv0;

import java.util.Arrays;

public class PCCE_6 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "\"Same\"";
            } else {
                answer[i] = "\"Different\"";
            }
        }
        return answer;
    }

    public static void testCase(int[] numbers, int[] our_score, int[] score_list, String[] expected) {
        PCCE_6 solution = new PCCE_6();

        String[] result = solution.solution(numbers, our_score, score_list);

        System.out.println("입력값 〉 "
                + Arrays.toString(numbers) + ", "
                + Arrays.toString(our_score) + ", "
                + Arrays.toString(score_list)
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
        int[][] numbers = { {1}, {3, 4} };
        int[][] our_scores = { {100}, {85, 93} };
        int[][] score_lists = { {100, 80, 90, 84, 20}, {85, 92, 38, 93, 48, 85, 92, 56} };
        String[][] expects = { {"\"Same\""}, {"\"Different\"", "\"Same\""} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(numbers[i], our_scores[i], score_lists[i], expects[i]);
        }
    }
}
