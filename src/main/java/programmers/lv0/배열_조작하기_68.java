package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_조작하기_68 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();

        // 초기 배열을 리스트로 변환
        for (int num : arr) {
            answer.add(num);
        }

        for (int i = 0; i < query.length; i++) {
            int index = query[i];

            if (i % 2 == 0) {
                // 짝수 인덱스: 뒷부분 자르기
                answer = answer.subList(0, index + 1);
            } else {
                // 홀수 인덱스: 앞부분 자르기
                answer = answer.subList(index, answer.size());
            }
        }

        // 리스트를 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void testCase(int[] arr, int[] query, int[] expected) {
        배열_조작하기_68 solution = new 배열_조작하기_68();

        int[] result = solution.solution(arr, query);

        System.out.println("입력값 〉 "
                + Arrays.toString(arr) + ", "
                + Arrays.toString(query)
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
        int[][] arr = { {0, 1, 2, 3, 4, 5} };
        int[][] query = { {4, 1, 2} };
        int[][] expects = { {1, 2, 3} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(arr[i], query[i], expects[i]);
        }
    }
}
