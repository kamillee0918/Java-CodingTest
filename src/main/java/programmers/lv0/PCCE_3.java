package programmers.lv0;

import java.util.Scanner;

public class PCCE_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(); // 30
        String age_type = sc.next(); // Korea
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer); // 2001
    }
}
