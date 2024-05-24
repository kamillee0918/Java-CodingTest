package programmers.lv3;

import java.util.Arrays;

public class 금과_은_운반하기 {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long left = 0;
        long right = (long) 1e15; // 10^5
        long answer = right;

        // 이분 탐색 시작
        while (left <= right) {
            long mid = (left + right) / 2;
            long gold = 0, silver = 0, total = 0;

            // 주어진 시간(mid)동안 각 도시에서 운반할 수 있는 금, 은의 양을 계산
            for (int i = 0; i < g.length; i++) {
                long roundTrip = mid / (t[i] * 2L); // 왕복 가능한 횟수
                if (mid % (t[i] * 2L) >= t[i]) {
                    roundTrip++; // 남은 시간으로 편도 가능한 경우
                }
                long maxTransport = roundTrip * w[i]; // 최대 운반 가능량

                gold += Math.min(g[i], maxTransport);
                silver += Math.min(s[i], maxTransport);
                total += Math.min(g[i] + s[i], maxTransport);
            }

            // 금, 은의 조건이 충족하는지 확인
            if (gold >= a && silver >= b && total >= (long) a + b) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static void testCase(int a, int b, int[] g, int[] s, int[] w, int[] t, int expected) {
        금과_은_운반하기 solution = new 금과_은_운반하기();

        long result = solution.solution(a, b, g, s, w, t);

        System.out.println("입력값 〉 "
                + a + ", "
                + b + ", "
                + Arrays.toString(g) + ", "
                + Arrays.toString(s) + ", "
                + Arrays.toString(w) + ", "
                + Arrays.toString(t)
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
        int[] a = {10, 90};
        int[] b = {10, 500};
        int[][] g = { {100}, {70, 70, 0} };
        int[][] s = { {100}, {0, 0, 500} };
        int[][] w = { {7}, {100, 100, 2} };
        int[][] t = { {10}, {4, 8, 1} };
        int[] expects = {50, 499};

        for (int i = 0; i < a.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(a[i], b[i], g[i], s[i], w[i], t[i], expects[i]);
        }
    }
}
