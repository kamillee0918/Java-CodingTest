package programmers.lv0;

import java.util.Scanner;

public class 문자열_출력하기_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (!str.isEmpty() && str.length() <= 1000000) {
            System.out.println(str);
        }
    }
}
