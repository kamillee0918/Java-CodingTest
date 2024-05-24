package programmers.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 이어_붙인_수_33 {
    public int solution(int[] num_list) {
        int answer = 0;

        String odd = Arrays.stream(num_list)
                .filter(x -> x % 2 != 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());

        String even = Arrays.stream(num_list)
                .filter(x -> x % 2 == 0)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());

        answer += Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }

    public static void testCase(int[] num_list, int expected) {
        이어_붙인_수_33 solution = new 이어_붙인_수_33();

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
        int[][] num_lists = { {3, 4, 5, 2, 1}, {5, 7, 8, 3} };
        int[] expects = {393, 581};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_lists[i], expects[i]);
        }
    }
}
