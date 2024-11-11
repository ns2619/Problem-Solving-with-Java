// Pattern - 3: Right-Angled Number Pyramid
import java.util.Scanner;

public class Pattern3 {
        public static void pattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
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
