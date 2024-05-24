package programmers.lv0;

public class 구로_나눈_나머지_47 {
    public int solution(String number) {
        int answer = 0;

        for (int i = 0; i < number.length(); i++) {
            answer += (number.charAt(i) - '0');
        }

        return answer % 9;
    }

    public static void testCase(String number, int expected) {
        구로_나눈_나머지_47 solution = new 구로_나눈_나머지_47();

        int result = solution.solution(number);

        System.out.println("입력값 〉 " + '"' + number + '"');
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[] numbers = {"123", "78720646226947352489"};
        int[] expects = {6, 2};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(numbers[i], expects[i]);
        }
    }
}
