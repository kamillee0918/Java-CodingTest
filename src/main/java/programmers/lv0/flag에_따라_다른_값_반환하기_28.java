package programmers.lv0;

public class flag에_따라_다른_값_반환하기_28 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }

    public static void testCase(int a, int b, boolean flag, int expected) {
        flag에_따라_다른_값_반환하기_28 solution = new flag에_따라_다른_값_반환하기_28();

        int result = solution.solution(a, b, flag);

        System.out.println("입력값 〉 "
                + a + ", "
                + b + ", "
                + flag);
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[] a = {-4, -4};
        int[] b = {7, 7};
        boolean[] flag = {true, false};
        int[] expects = {3, -11};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], flag[i], expects[i]);
        }
    }
}
