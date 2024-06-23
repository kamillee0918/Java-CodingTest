package programmers.lv0;

import java.util.Arrays;

public class 첫_번째로_나오는_음수_65 {

    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void testCase(int[] num_list, int expected) {
        첫_번째로_나오는_음수_65 solution = new 첫_번째로_나오는_음수_65();

        int result = solution.solution(num_list);

        System.out.println("입력값 〉 " + Arrays.toString(num_list));
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] num_list = { {12, 4, 15, 46, 38, -2, 15}, {13, 22, 53, 24, 15, 6} };
        int[] expects = {5, -1};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_list[i], expects[i]);
        }
    }
}
