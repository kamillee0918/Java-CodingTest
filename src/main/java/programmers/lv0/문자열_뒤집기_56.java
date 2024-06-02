package programmers.lv0;

import java.util.Arrays;

public class 문자열_뒤집기_56 {
    public String solution(String my_string, int s, int e) {
        char[] answer = my_string.toCharArray();
        reverseString(answer, s, e);
        System.out.println("chars = " + Arrays.toString(answer));
        return new String(answer);
    }

    private void reverseString(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public static void testCase(String my_string, int s, int e, String expected) {
        문자열_뒤집기_56 solution = new 문자열_뒤집기_56();

        String result = solution.solution(my_string, s, e);

        System.out.println("입력값 〉 "
                + '"' + my_string + '"' + ", "
                + s + ", "
                + e
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
        String[] my_string = {"Progra21Sremm3", "Stanley1yelnatS"};
        int[] s = {6, 4};
        int[] e = {12, 10};
        String[] expects = {"ProgrammerS123", "Stanley1yelnatS"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], s[i], e[i], expects[i]);
        }
    }
}
