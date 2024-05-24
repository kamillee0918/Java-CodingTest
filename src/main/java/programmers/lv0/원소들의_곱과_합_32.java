package programmers.lv0;

import java.util.Arrays;

public class 원소들의_곱과_합_32 {
    public int solution(int[] num_list) {
        int answer = 0;
        int compare1 = 1;
        int compare2 = 0;

        for (int num : num_list) {
            compare1 *= num;
            compare2 += num;
        }
        compare2 = compare2 * compare2;

        if (compare1 < compare2) {
            answer += 1;
        }

        return answer;
    }

    public static void testCase(int[] num_list, int expected) {
        원소들의_곱과_합_32 solution = new 원소들의_곱과_합_32();

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
        int[][] num_list = { {3, 4, 5, 2, 1}, {5, 7, 8, 3} };
        int[] expects = {1, 0};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num_list[i], expects[i]);
        }
    }
}
