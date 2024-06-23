package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숫자2의_영역_67 {
    public int[] solution(int[] arr) {
        List<Integer>  isTwoInIndices = new ArrayList<Integer>();

        // 1. 인덱스 2를 모두 찾음
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                isTwoInIndices.add(i);
            }
        }

        // 2. 인덱스 2가 없는 경우 [-1]를 반환함
        if (isTwoInIndices.isEmpty()) {
            return new int[]{-1};
        }

        // 3. 첫 번째 2와 마지막 2의 인덱스를 찾음
        int start = isTwoInIndices.get(0);
        int end = isTwoInIndices.get(isTwoInIndices.size() - 1);

        // 정답 배열 생성
        int[] answer = new int[end - start + 1];

        if (end + 1 - start >= 0) System.arraycopy(arr, start, answer, start - start, end + 1 - start);

        return answer;
    }

    public static void testCase(int[] arr, int[] expected) {
        숫자2의_영역_67 solution = new 숫자2의_영역_67();

        int[] result = solution.solution(arr);

        System.out.println("입력값 〉 " + Arrays.toString(arr));
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 1, 4, 5, 2, 9}, {1, 2, 1}, {1, 1, 1}, {1, 2, 1, 2, 1, 10, 2, 1} };
        int[][] expects = { {2, 1, 4, 5, 2}, {2}, {-1}, {2, 1, 2, 1, 10, 2} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], expects[i]);
        }
    }
}
