package programmers.lv0;

public class 문자열_섞기_19 {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            if (i < str2.length()) {
                answer += str2.charAt(i);
            }
        }

        return answer;
    }

    public static void testCase(String str1, String str2, String expected) {
        문자열_섞기_19 solution = new 문자열_섞기_19();

        String result = solution.solution(str1, str2);

        System.out.println("입력값 〉 "
                + str1 + ", "
                + str2
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
        String[] str1 = {"aaaaa", "ccccc"};
        String[] str2 = {"bbbbb", "ddddd"};
        String[] expects = {"ababababab", "cdcdcdcdcd"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(str1[i], str2[i], expects[i]);
        }
    }
}