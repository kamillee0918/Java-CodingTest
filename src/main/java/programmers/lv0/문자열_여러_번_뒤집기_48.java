package programmers.lv0;

import java.util.Arrays;

public class 문자열_여러_번_뒤집기_48 {
    public String solution(String my_string, int[][] queries) {
        char[] chars = my_string.toCharArray();
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            reverseString(chars, start, end);
        }

        return new String(chars);
    }

    private void reverseString(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }

    public static void testCase(String my_string, int[][] queries, String expected) {
        문자열_여러_번_뒤집기_48 solution = new 문자열_여러_번_뒤집기_48();

        String result = solution.solution(my_string, queries);

        System.out.println("입력값 〉 "
                + '"' + my_string + '"' + ", "
                + Arrays.deepToString(queries)
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
        String[] my_string = {"rermgorpsam"};
        int[][][] queries = { { {2, 3}, {0, 7}, {5, 9}, {6, 10} } };
        String[] expects = {"programmers"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], queries[i], expects[i]);
        }
    }
}
