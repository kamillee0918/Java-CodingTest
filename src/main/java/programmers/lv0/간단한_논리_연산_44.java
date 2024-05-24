package programmers.lv0;

public class 간단한_논리_연산_44 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }

    public static void testCase(boolean x1, boolean x2, boolean x3, boolean x4, boolean expected) {
        간단한_논리_연산_44 solution = new 간단한_논리_연산_44();

        boolean result = solution.solution(x1, x2, x3, x4);

        System.out.println("입력값 〉 "
                + x1 + ", "
                + x2 + ", "
                + x3 + ", "
                + x4
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
        boolean[] x1 = {false, true};
        boolean[] x2 = {true, false};
        boolean[] x3 = {true, false};
        boolean[] x4 = {true, false};
        boolean[] expects = {true, false};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(x1[i], x2[i], x3[i], x4[i], expects[i]);
        }
    }
}
