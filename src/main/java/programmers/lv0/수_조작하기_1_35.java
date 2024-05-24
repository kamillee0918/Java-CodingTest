package programmers.lv0;

public class 수_조작하기_1_35 {
    public int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                n += 1;
            } else if (control.charAt(i) == 's') {
                n -= 1;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            }
        }

        return n;
    }

    public static void testCase(int n, String control, int expected) {
        수_조작하기_1_35 solution = new 수_조작하기_1_35();

        int result = solution.solution(n, control);

        System.out.println("입력값 〉 "
                + n + ", "
                + control
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
        int[] n = {0, 10};
        String[] control = {"wsdawsdassw", "wsadwsadwsad"};
        int[] expects = {-1, 10};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(n[i], control[i], expects[i]);
        }
    }
}
