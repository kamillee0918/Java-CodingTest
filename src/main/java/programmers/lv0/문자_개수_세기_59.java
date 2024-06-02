package programmers.lv0;

import java.util.Arrays;

public class 문자_개수_세기_59 {
    public int[] solution(String my_string) {
        // 길이 52의 정수 배열
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 'A' && ch <= 'Z') { // 대문자 'A'부터 'Z'까지의 등장 횟수 세기
                answer[ch - 'A']++;
            } else { // 소문자 'a'부터 'z'까지의 등장 횟수 세기
                answer[ch - 'a' + 26]++;
            }
        }

        return answer;
    }

    public static void testCase(String my_string, int[] expected) {
        문자_개수_세기_59 solution = new 문자_개수_세기_59();

        int[] result = solution.solution(my_string);

        System.out.println("입력값 〉 " + '"' + my_string + '"');
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] my_string = {"Programmers", "KamilLee"};
        int[][] expects = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], expects[i]);
        }
    }
}
