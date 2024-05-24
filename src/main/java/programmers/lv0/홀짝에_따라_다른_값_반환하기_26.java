package programmers.lv0;

public class 홀짝에_따라_다른_값_반환하기_26 {
    public int solution(int n) {
        int answer = 0;

        // n의 값이 홀수이면...
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else { // n의 값이 짝수이면...
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }

        return answer;
    }

    public static void testCase(int n, int expected) {
        홀짝에_따라_다른_값_반환하기_26 solution = new 홀짝에_따라_다른_값_반환하기_26();

        int result = solution.solution(n);

        System.out.println("입력값 〉 " + n);
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] n = {7, 10};
        int[] expects = {16, 220};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(n[i], expects[i]);
        }
    }
}
