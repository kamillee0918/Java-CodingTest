package programmers.lv0;

import java.util.Arrays;

public class PCCE_5 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];

        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }

        answer[0] = east;
        answer[1] = north;

        return answer;
    }

    public static void testCase(String route, int[] expected) {
        PCCE_5 solution = new PCCE_5();

        int[] result = solution.solution(route);

        System.out.println("입력값 〉 " + route);
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] routes = {"NSSNEWWN", "EESEEWNWSNWWNS"};
        int[][] expects = { {-1, 1}, {0, 0} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(routes[i], expects[i]);
        }
    }
}
