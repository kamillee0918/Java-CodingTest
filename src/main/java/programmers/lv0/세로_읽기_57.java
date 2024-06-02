package programmers.lv0;

public class 세로_읽기_57 {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }

    public static void testCase(String my_string, int m, int c, String expected) {
        세로_읽기_57 solution = new 세로_읽기_57();

        String result = solution.solution(my_string, m, c);

        System.out.println("입력값 〉 " + '"' + my_string + '"');
        System.out.println("기댓값 〉 " + '"' + expected + '"');

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] my_string = {"ihrhbakrfpndopljhygc", "programmers"};
        int[] m = {4, 1};
        int[] c = {2, 1};
        String[] expects = {"happy", "programmers"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], m[i], c[i], expects[i]);
        }
    }
}
