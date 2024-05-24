package programmers.lv0;

public class 주사위_게임_3_45 {
    public int solution(int a, int b, int c, int d) {
        // 1. 네 주사위 숫자가 모두 같은 경우
        if (a == b && b == c && c == d) {
            return 1111 * a;
        }

        // 2. 세 주사위 숫자가 같고 나머지 하나가 다른 경우
        if (a == b && b == c || a == b && b == d || a == c && c == d || b == c && c == d) {
            int same = a == b ? a : c;
            int diff = a != same ? a : b != same ? b : c != same ? c : d;
            return (10 * same + diff) * (10 * same + diff);
        }

        // 3. 두 주사위 숫자가 같은 경우
        if (a == b && c == d || a == c && b == d || a == d && b == c) {
            int same = b != a ? b : c;
            return (a + same) * Math.abs(a - same);
        }

        // 4. 두 주사위 숫자가 같고 나머지 두 주사위 숫자가 다른 경우
        if (a == b || a == c || a == d || b == c || b == d || c == d) {
            int same = a == b ? a : a == c ? a : a == d ? a : b == c ? b : b == d ? b : c;
            int diff1 = a != same ? a : b != same ? b : c;
            int diff2 = b != same && b != diff1 ? b : c != same && c != diff1 ? c : d;
            return diff1 * diff2;
        }

        // 5. 네 주사위 숫자가 모두 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static void testCase(int a, int b, int c, int d, int expected) {
        주사위_게임_3_45 solution = new 주사위_게임_3_45();

        int result = solution.solution(a, b, c, d);

        System.out.println("입력값 〉 "
                + a + ", "
                + b + ", "
                + c + ", "
                + d
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
        int[] a = {2, 4, 6, 2, 6};
        int[] b = {2, 1, 3, 5, 4};
        int[] c = {2, 4, 3, 2, 2};
        int[] d = {2, 4, 6, 6, 5};
        int[] expects = {2222, 1681, 27, 30, 2};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], c[i], d[i], expects[i]);
        }
    }
}
