package programmers.lv0;

public class 두_수의_연산값_비교하기_23 {
    public int solution(int a, int b) {
        String condition1 = Integer.toString(a) + b;
        int condition2 = 2 * a * b;

        int parse1 = Integer.parseInt(condition1);

        if (parse1 == condition2) {
            return parse1;
        } else {
            return Math.max(parse1, condition2);
        }
    }

    public static void testCase(int a, int b, int expected) {
        두_수의_연산값_비교하기_23 solution = new 두_수의_연산값_비교하기_23();

        int result = solution.solution(a, b);

        System.out.println("입력값 〉 "
                + a + ", "
                + b
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
        int[] a = {2, 91};
        int[] b = {91, 2};
        int[] expects = {364, 912};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], expects[i]);
        }
    }
}
