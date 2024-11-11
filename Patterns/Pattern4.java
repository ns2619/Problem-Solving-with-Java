// Pattern - 4: Right-Angled Number Pyramid - II

import java.util.Scanner;

public class Pattern4 {
    public static void pattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
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
