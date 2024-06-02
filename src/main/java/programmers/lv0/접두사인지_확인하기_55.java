package programmers.lv0;

public class 접두사인지_확인하기_55 {
    public int solution(String my_string, String is_prefix) {
        // my_string의 길이에서 is_prefix의 길이를 뺀 값이
        // 0 이상이면 is_prefix는 my_string의 접두사
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void testCase(String my_string, String is_prefix, int expected) {
        접두사인지_확인하기_55 solution = new 접두사인지_확인하기_55();

        int result = solution.solution(my_string, is_prefix);

        System.out.println("입력값 〉 "
                + '"' + my_string + '"' + ", "
                + '"' + is_prefix + '"'
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
        String[] my_string = {"banana", "banana", "banana", "banana"};
        String[] is_prefix = {"ban", "nan", "abcd", "bananan"};
        int[] expects = {1, 0, 0, 0};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(my_string[i], is_prefix[i], expects[i]);
        }
    }
}
