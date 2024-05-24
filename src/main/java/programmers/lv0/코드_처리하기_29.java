package programmers.lv0;

public class 코드_처리하기_29 {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                mode = 1 - mode;
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        ret.append(c);
                    }
                } else {
                    if (i % 2 != 0) {
                        ret.append(c);
                    }
                }
            }
        }

        if (ret.isEmpty()) {
            return "EMPTY";
        }

        return ret.toString();
    }

    public static void testCase(String code, String expected) {
        코드_처리하기_29 solution = new 코드_처리하기_29();

        String result = solution.solution(code);

        System.out.println("입력값 〉 " + code);
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] code = {"abc1abc1abc", ""};
        String[] expects = {"acbac", "EMPTY"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(code[i], expects[i]);
        }
    }
}
