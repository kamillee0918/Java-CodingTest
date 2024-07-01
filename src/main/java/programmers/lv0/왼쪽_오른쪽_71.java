package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 왼쪽_오른쪽_71 {

    public String[] solution(String[] str_list) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                // "l"이 먼저 나온 경우에는 왼쪽의 문자열들을 반환함
                return result.toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                // "r"이 먼저 나온 경우에는 오른쪽의 문자열들을 반환함
                List<String> rightList = new ArrayList<>();
                for (int j = i + 1; j < str_list.length; j++) {
                    rightList.add(str_list[j]);
                }

                return rightList.toArray(new String[0]);
            } else {
                // "l"이나 "r"이 아닌 경우, 결과 리스트에 추가함
                result.add(str_list[i]);
            }
        }

        return new String[0];
    }

    public static void testCase(String[] str_list, String[] expected) {
        왼쪽_오른쪽_71 solution = new 왼쪽_오른쪽_71();

        String[] result = solution.solution(str_list);

        System.out.println("입력값 〉 " + Arrays.toString(str_list));
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[][] str_list = { {"u", "u", "l", "r"}, {"l"} };
        String[][] expects = { {"u", "u"}, {} };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(str_list[i], expects[i]);
        }
    }
}


