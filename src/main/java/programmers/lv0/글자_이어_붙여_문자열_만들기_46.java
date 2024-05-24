package programmers.lv0;

import java.util.Arrays;

public class 글자_이어_붙여_문자열_만들기_46 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int i : index_list) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void testCase(String my_string, int[] index_list, String expected) {
        글자_이어_붙여_문자열_만들기_46 solution = new 글자_이어_붙여_문자열_만들기_46();

        String result = solution.solution(my_string, index_list);

        System.out.println("입력값 〉 "
                + my_string + ", "
                + Arrays.toString(index_list)
        );
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] my_string = {"cvsgiorszzzmrpaqpe", "zpiaz"};
        int[][] index_list = { {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}, {1, 2, 0, 0, 3} };
        String[] expects = {"programmers", "pizza"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], index_list[i], expects[i]);
        }
    }
}
