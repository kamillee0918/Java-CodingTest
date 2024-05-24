package programmers.lv0;

import java.util.Arrays;

public class 콜라츠_수열_만들기_42 {
    public int[] solution(int n) {
        int[] answer = new int[1000]; // 최대 1000개의 수를 저장할 수 있는 배열
        int index = 0;

        answer[index++] = n;

        // 콜라츠 수열
        while (n != 1) {
            if (n % 2 == 0) { // n이 짝수라면
                n /= 2;
            } else { // n이 홀수라면
                n = 3 * n + 1;
            }
            answer[index++] = n;
        }

        return Arrays.copyOf(answer, index);
    }

    public static void testCase(int n, int[] expected) {
        콜라츠_수열_만들기_42 solution = new 콜라츠_수열_만들기_42();

        int[] result = solution.solution(n);

        System.out.println("입력값 〉 " + n);
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] n = {10};
        int[][] expects = { {10, 5, 16, 8, 4, 2, 1} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(n[i], expects[i]);
        }
    }
}
