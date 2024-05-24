package programmers.lv0;

import java.util.Scanner;

public class PCCE_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();  // 28
        int before = sc.nextInt(); // 6
        int after = sc.nextInt();  // 8

        int money = start;
        int month = 1;

        while (money < 70) {
            money += before;
            month++;
        }

        while (money < 100) {
            money += after;
            month++;
        }

        System.out.println(month); // 12
    }
}
