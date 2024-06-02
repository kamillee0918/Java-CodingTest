package programmers.lv0;

public class qr_code_58 {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = r; i < code.length(); i += q) {
            answer.append(code.charAt(i));
        }

        return answer.toString();
    }

    public static void testCase(int q, int r, String code, String expected) {
        qr_code_58 solution = new qr_code_58();

        String result = solution.solution(q, r, code);

        System.out.println("입력값 〉 "
                + q + ", "
                + r + ", "
                + '"' + code + '"'
        );
        System.out.println("기댓값 〉 " + '"' + expected + '"');

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] q = {3, 1};
        int[] r = {1, 0};
        String[] code = {"qjnwezgrpirldywt", "programmers"};
        String[] expects = {"jerry", "programmers"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(q[i], r[i], code[i], expects[i]);
        }
    }
}
