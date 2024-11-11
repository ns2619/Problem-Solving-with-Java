// Pattern-5: Inverted Right Pyramid

import java.util.Scanner;

public class Pattern5 {

    public static void pattern(int N) {

        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();

        pattern(n);
        sc.close();
    }
}
