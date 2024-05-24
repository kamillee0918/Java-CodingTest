package programmers.lv0;

import java.util.Scanner;

public class PCCE_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 3
        int c = sc.nextInt(); // 5
        int b_square = (c*c - a*a);

        System.out.println(b_square); // 16
    }
}
