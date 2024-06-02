package programmers.lv0;

public class 문자열의_앞의_n글자_54 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

    public static void testCase(String my_string, int n, String expected) {
        문자열의_앞의_n글자_54 solution = new 문자열의_앞의_n글자_54();

        String result = solution.solution(my_string, n);

        System.out.println("입력값 〉 "
                + '"' + my_string + '"' + ", "
                + n
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
        String[] my_string = {"ProgrammerS123", "He110W0r1d"};
        int[] n = {11, 5};
        String[] expects = {"ProgrammerS", "He110"};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], n[i], expects[i]);
        }
    }
}
