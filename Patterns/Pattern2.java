// Pattern-2: Right-Angled Triangle Pattern

import java.util.Scanner;

public class Pattern2 {
    
    public static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
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
