package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_5_49 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            if (intStr.length() >= s + l) {
                int number = Integer.parseInt(intStr.substring(s, s + l));
                if (number > k) {
                    answer.add(number);
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void testCase(String[] intStrs, int k, int s, int l, int[] expected) {
        배열_만들기_5_49 solution = new 배열_만들기_5_49();

        int[] result = solution.solution(intStrs, k, s, l);

        System.out.println("입력값 〉 "
                + Arrays.toString(intStrs) + ", "
                + k + ", "
                + s + ", "
                + l
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
        String[][] intStrs = { {"0123456789", "9876543210", "9999999999999"} };
        int[] k = {50000};
        int[] s = {5};
        int[] l = {5};
        int[][] expects = { {56789, 99999} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(intStrs[i], k[i], s[i], l[i], expects[i]);
        }
    }
}
