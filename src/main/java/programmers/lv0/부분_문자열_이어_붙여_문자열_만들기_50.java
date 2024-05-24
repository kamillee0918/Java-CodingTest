package programmers.lv0;

import java.util.Arrays;

public class 부분_문자열_이어_붙여_문자열_만들기_50 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            int[] part = parts[i];
            int start = part[0];
            int end = part[1];

            answer.append(str, start, end + 1);
        }

        return answer.toString();
    }

    public static void testCase(String[] my_strings, int[][] parts, String expected) {
        부분_문자열_이어_붙여_문자열_만들기_50 solution = new 부분_문자열_이어_붙여_문자열_만들기_50();

        String result = solution.solution(my_strings, parts);

        System.out.println("입력값 〉 "
                + Arrays.toString(my_strings) + ", "
                + Arrays.deepToString(parts)
        );
        System.out.println("기댓값 〉 " + '"' + expected + '"');

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[][] my_strings = {
                {"progressive", "hamburger", "hammer", "ahocorasick"},
                {"metronome", "available", "siberia", "arise"}
        };
        int[][][] parts = {
                { {0, 4}, {1, 2}, {3, 5}, {7, 7} },
                { {0, 2}, {0, 1}, {3, 4}, {3, 4} }
        };
        String[] expects = {"programmers", "metaverse"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_strings[i], parts[i], expects[i]);
        }
    }
}
