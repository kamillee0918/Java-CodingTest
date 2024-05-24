package programmers.lv0;

import java.util.Arrays;

public class 문자_리스트를_문자열로_변환하기_20 {
    public String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public static void testCase(String[] arr, String expected) {
        문자_리스트를_문자열로_변환하기_20 solution = new 문자_리스트를_문자열로_변환하기_20();

        String result = solution.solution(arr);

        System.out.println("입력값 〉 " + Arrays.toString(arr));
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[][] arrs = { {"a", "b", "c"}, {"d", "e", "f"} };
        String[] expects = {"abc", "def"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arrs[i], expects[i]);
        }
    }
}
