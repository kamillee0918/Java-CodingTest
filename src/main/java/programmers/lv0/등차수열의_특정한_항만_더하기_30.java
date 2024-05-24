package programmers.lv0;

import java.util.Arrays;

public class 등차수열의_특정한_항만_더하기_30 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }

    public static void testCase(int a, int d, boolean[] include, int expected) {
        등차수열의_특정한_항만_더하기_30 solution = new 등차수열의_특정한_항만_더하기_30();

        int result = solution.solution(a, d, include);

        System.out.println("입력값 〉 "
                + a + ", "
                + d + ", "
                + Arrays.toString(include)
        );
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 7};
        int[] d = {4, 1};
        boolean[][] included = { {true, false, false, true, true}, {false, false, false, true, false, false, false} };
        int[] expects = {37, 10};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], d[i], included[i], expects[i]);
        }
    }
}
