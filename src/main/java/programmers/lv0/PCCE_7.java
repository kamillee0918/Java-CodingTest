package programmers.lv0;

public class PCCE_7 {

    // "target" 모드
    public int func1(int humidity, int val_set) {
        if (humidity < val_set) {
            return 3;
        }

        return 1;
    }

    // "auto" 모드
    public int func2(int humidity) {
        if (humidity >= 50) {
            return 0;
        } else if (humidity >= 40) {
            return 1;
        } else if (humidity >= 30) {
            return 2;
        } else if (humidity >= 20) {
            return 3;
        } else if (humidity >= 10) {
            return 4;
        } else {
            return 5;
        }
    }

    // "minimum" 모드
    public int func3(int humidity, int val_set) {
        if (humidity < val_set) {
            return 1;
        }

        return 0;
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if (mode_type.equals("\"auto\"")) {
            answer = func2(humidity);
        } else if (mode_type.equals("\"target\"")) {
            answer = func1(humidity, val_set);
        } else if (mode_type.equals("\"minimum\"")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }

    public static void testCase(String mode_type, int humidity, int val_set, int expected) {
        PCCE_7 solution = new PCCE_7();

        int result = solution.solution(mode_type, humidity, val_set);

        System.out.println("입력값 〉 "
                + mode_type + ", "
                + humidity + ", "
                + val_set
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
        String[] mode_type = {"\"auto\"", "\"target\"", "\"minimum\""};
        int[] humidities = {23, 41, 10};
        int[] val_sets = {45, 40, 34};
        int[] expects = {3, 1, 1};

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(mode_type[i], humidities[i], val_sets[i], expects[i]);
        }
    }
}
