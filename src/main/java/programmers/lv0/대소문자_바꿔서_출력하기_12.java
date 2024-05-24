package programmers.lv0;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.length() <= 20) {
                if (Character.isLowerCase(ch)) {
                    output += Character.toUpperCase(ch);
                } else if (Character.isUpperCase(ch)) {
                    output += Character.toLowerCase(ch);
                } else {
                    output += ch;
                }
            }
        }

        System.out.println(output);
    }
}
