package programmers.lv0;

public class 문자열_겹쳐쓰기_18 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length());

        return answer;
    }

    public static void testCase(String my_string, String overwrite_string, int s, String expected) {
        문자열_겹쳐쓰기_18 solution = new 문자열_겹쳐쓰기_18();

        String result = solution.solution(my_string, overwrite_string, s);

        System.out.println("입력값 〉 "
                + my_string + ", "
                + overwrite_string + ", "
                + s
        );
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] my_string = {"He11oWor1d", "Program29b8UYP"};
        String[] overwrite_string = {"lloWorl", "merS123"};
        int[] s = {2, 7};
        String[] expects = {"HelloWorld", "ProgrammerS123"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], overwrite_string[i], s[i], expects[i]);
        }
    }
}