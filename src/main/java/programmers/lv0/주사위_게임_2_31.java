package programmers.lv0;

public class 주사위_게임_2_31 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int square = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        int cube = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a == b && b == c) {
            answer += (a + b + c) * (square * cube);
        } else if (a == b || a == c || b == c) {
            answer += (a + b + c) * square;
        } else {
            answer += a + b + c;
        }

        return answer;
    }

    public static void testCase(int a, int b, int c, int expected) {
        주사위_게임_2_31 solution = new 주사위_게임_2_31();

        int result = solution.solution(a, b, c);

        System.out.println("입력값 〉 "
                + a + ", "
                + b + ", "
                + c
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
        int[] a = {2, 5, 4};
        int[] b = {6, 3, 4};
        int[] c = {1, 3, 4};
        int[] expects = {9, 473, 110592};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], c[i], expects[i]);
        }
    }
}
