package programmers.lv0;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class 접미사_배열_52 {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }

        String[] answer = new String[list.size()];
        list.toArray(answer);
        Arrays.sort(answer);

        return answer;
    }

    public static void testCase(String my_string, String[] expected) {
        접미사_배열_52 solution = new 접미사_배열_52();

        String[] result = solution.solution(my_string);

        System.out.println("입력값 〉 " + '"' + my_string + '"');
        System.out.println("기댓값 〉 " + Arrays.toString(expected));

        if (Arrays.equals(expected, result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + Arrays.toString(result)
                    + "이 기댓값 " + Arrays.toString(expected) + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] my_string = {"banana", "programmers"};
        String[][] expects = {
                {"a", "ana", "anana", "banana", "na", "nana"},
                {"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"}
        };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], expects[i]);
        }
    }
}
