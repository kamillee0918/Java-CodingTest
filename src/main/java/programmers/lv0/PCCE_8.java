package programmers.lv0;

import java.util.Arrays;

public class PCCE_8 {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;
            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }

            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.
        int num_max = -1;
        String answer = "";
        for (int i = 0; i < num_item; i++) {
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }

        return answer;
    }

    public static void testCase(String[] storage, int[] num, String expected) {
        PCCE_8 solution = new PCCE_8();

        String result = solution.solution(storage, num);

        System.out.println("입력값 〉 "
                + Arrays.toString(storage) + ", "
                + Arrays.toString(num)
        );
        System.out.println("기댓값 〉 " + expected);

        if (expected.equals(result)) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        String[][] storages = { {"\"pencil\"", "\"pencil\"", "\"pencil\"", "\"book\""}, {"\"doll\"", "\"doll\"", "\"doll\"", "\"doll\""} };
        int[][] nums = { {2, 4, 3, 1}, {1, 1, 1, 1} };
        String[] expects = { "\"pencil\"", "\"doll\"" };

        for (int i = 0; i < expects.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(storages[i], nums[i], expects[i]);
        }
    }
}
