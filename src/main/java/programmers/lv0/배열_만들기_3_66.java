package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_3_66 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        // 첫 번째 구간에 해당하는 배열 구하기
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer.add(arr[i]);
        }

        // 두 번째 구간에 해당하는 배열 구하기
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void testCase(int[] arr, int[][] intervals, int[] expected) {
        배열_만들기_3_66 solution = new 배열_만들기_3_66();

        int[] result = solution.solution(arr, intervals);

        System.out.println("입력값 〉 "
                + Arrays.toString(arr) + ", "
                + Arrays.deepToString(intervals)
        );
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4, 5} };
        int[][][] intervals = { { {1, 3}, {0, 4} } };
        int[][] expects = { {2, 3, 4, 1, 2, 3, 4, 5} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], intervals[i], expects[i]);
        }
    }
}
