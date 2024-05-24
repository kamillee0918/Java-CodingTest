package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_만들기_2_40 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).replace("0", "").replace("5", "").isEmpty()) {
                list.add(i);
            }
        }

        int[] answer = !list.isEmpty() ? list.stream().mapToInt(i->i).sorted().toArray() : new int[]{-1};

        return answer;
    }

    public static void testCase(int l, int r, int[] expected) {
        배열_만들기_2_40 solution = new 배열_만들기_2_40();

        int[] result = solution.solution(l, r);

        System.out.println("입력값 〉 "
                + l + ", "
                + r
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
        int[] l = {5, 10};
        int[] r = {555, 20};
        int[][] expects = { {5, 50, 55, 500, 505, 550, 555}, {-1} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(l[i], r[i], expects[i]);
        }
    }
}
