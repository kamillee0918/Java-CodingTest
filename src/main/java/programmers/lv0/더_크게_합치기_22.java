package programmers.lv0;

public class 더_크게_합치기_22 {
    public int solution(int a, int b) {
        String condition1 = Integer.toString(a) + b;
        String condition2 = Integer.toString(b) + a;

        int parse1 = Integer.parseInt(condition1);
        int parse2 = Integer.parseInt(condition2);

        return Math.max(parse1, parse2);
    }

    public static void testCase(int a, int b, int expected) {
        더_크게_합치기_22 solution = new 더_크게_합치기_22();

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
        int[] a = {9, 89};
        int[] b = {91, 8};
        int[] expects = {991, 898};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], expects[i]);
        }
    }
}
