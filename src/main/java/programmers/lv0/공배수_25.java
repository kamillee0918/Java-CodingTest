package programmers.lv0;

public class 공배수_25 {
    public int solution(int number, int n, int m) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (number % n == 0 && number % m == 0) {
                answer = 1;
            } else {
                return answer;
            }
        }

        return answer;
    }

    public static void testCase(int number, int n, int m, int expected) {
        공배수_25 solution = new 공배수_25();

        int result = solution.solution(number, n, m);

        System.out.println("입력값 〉 "
                + number + ", "
                + n + ", "
                + m
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
        int[] number = {60, 55};
        int[] n = {2, 10};
        int[] m = {3, 5};
        int[] expects = {1, 0};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(number[i], n[i], m[i], expects[i]);
        }
    }
}
