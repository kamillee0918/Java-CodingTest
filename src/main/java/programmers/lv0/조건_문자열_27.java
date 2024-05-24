package programmers.lv0;

public class 조건_문자열_27 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<")) {
            if (eq.equals("=") && n <= m) { // "<", "=" : n <= m
                answer = 1;
            } else if (eq.equals("!") && n < m) { // "<", "!" : n < m
                answer = 1;
            }
        } else if (ineq.equals(">")) {
            if (eq.equals("=") && n >= m) { // ">", "=" : n >= m
                answer = 1;
            } else if (eq.equals("!") && n > m) { // ">", "!" : n > m
                answer = 1;
            }
        }

        return answer;
    }

    public static void testCase(String ineq, String eq, int n, int m, int expected) {
        조건_문자열_27 solution = new 조건_문자열_27();

        int result = solution.solution(ineq, eq, n, m);

        System.out.println("입력값 〉 "
                + ineq + ", "
                + eq + ", "
                + n + ", "
                + m);
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] ineq = {"<", ">"};
        String[] eq = {"=", "!"};
        int[] n = {20, 41};
        int[] m = {50, 78};
        int[] expects = {1, 0};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(ineq[i], eq[i], n[i], m[i], expects[i]);
        }
    }
}
