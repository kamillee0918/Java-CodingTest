package programmers.lv0;

import java.util.Arrays;

public class 수_조작하기_2_36 {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i - 1] + 1 == numLog[i]) {
                answer.append("w");
            } else if (numLog[i - 1] - 1 == numLog[i]) {
                answer.append("s");
            } else if (numLog[i - 1] + 10 == numLog[i]) {
                answer.append("d");
            } else if (numLog[i - 1] - 10 == numLog[i]) {
                answer.append("a");
            }
        }

        return answer.toString();
    }

    public static void testCase(int[] numLog, String expected) {
        수_조작하기_2_36 solution = new 수_조작하기_2_36();

        String result = solution.solution(numLog);

        System.out.println("입력값 〉 " + Arrays.toString(numLog));
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] numLogs = { {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1} };
        String[] expects = {"wsdawsdassw"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(numLogs[i], expects[i]);
        }
    }
}
