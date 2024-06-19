package programmers.lv0;

import java.util.Arrays;

public class 리스트_자르기_64 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        return switch (n) {
            case 1 -> sliceArray(num_list, 0, b + 1);
            case 2 -> sliceArray(num_list, a, num_list.length);
            case 3 -> sliceArray(num_list, a, b + 1);
            case 4 -> sliceArrayWithInterval(num_list, a, b + 1, c);
            default -> new int[0];
        };
    }

    private int[] sliceArray(int[] arr, int start, int end) {
        int[] slicedArr = new int[end - start];
        if (end - start >= 0) System.arraycopy(arr, start, slicedArr, 0, end - start);

        return slicedArr;
    }

    private int[] sliceArrayWithInterval(int[] arr, int start, int end, int interval) {
        int length = (end - start + interval - 1) / interval;
        int[] slicedArr = new int[length];
        for (int i = 0; i < length; i++) {
            slicedArr[i] = arr[start + i * interval];
        }

        return slicedArr;
    }

    public static void testCase(int n, int[] slicer, int[] num_list, int[] expected) {
        리스트_자르기_64 solution = new 리스트_자르기_64();

        int[] result = solution.solution(n, slicer, num_list);

        System.out.println("입력값 〉 "
                + n + ", "
                + Arrays.toString(slicer) + ", "
                + Arrays.toString(num_list)
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
        int[] n = {3, 4};
        int[][] slicer = { {1, 5, 2}, {1, 5, 2} };
        int[][] num_list = { {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9} };
        int[][] expects = { {2, 3, 4, 5, 6}, {2, 4, 6} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(n[i], slicer[i], num_list[i], expects[i]);
        }
    }
}

