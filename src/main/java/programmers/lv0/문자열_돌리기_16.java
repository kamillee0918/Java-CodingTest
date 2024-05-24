package programmers.lv0;

import java.util.Scanner;

public class 문자열_돌리기_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();

        for (int i = 0; i < answer.length(); i++) {
            if (answer.length() <= 10) {
                System.out.println(answer.charAt(i));
            }
        }
    }
}
