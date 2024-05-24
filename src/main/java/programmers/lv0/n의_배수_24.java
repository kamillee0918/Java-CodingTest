package programmers.lv0;

public class n의_배수_24 {
    public int solution(int num, int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (num % n == 0) {
                answer = 1;
            } else {
                return answer;
            }
        }

        return answer;
    }

    public static void testCase(int num, int n, int expected) {
        n의_배수_24 solution = new n의_배수_24();

        int result = solution.solution(num, n);

        System.out.println("입력값 〉 "
                + num + ", "
                + n
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
        int[] num = {98, 34};
        int[] n = {2, 3};
        int[] expects = {1, 0};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(num[i], n[i], expects[i]);
        }
    }
}
