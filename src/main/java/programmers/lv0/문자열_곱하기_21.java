package programmers.lv0;

public class 문자열_곱하기_21 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        return answer;
    }

    public static void testCase(String my_string, int k, String expected) {
        문자열_곱하기_21 solution = new 문자열_곱하기_21();

        String result = solution.solution(my_string, k);

        System.out.println("입력값 〉 "
                + my_string + ", "
                + k
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
        String[] my_string = {"string", "love"};
        int[] k = {3, 10};
        String[] expects = {"stringstringstring", "lovelovelovelovelovelovelovelovelovelove"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], k[i], expects[i]);
        }
    }
}
