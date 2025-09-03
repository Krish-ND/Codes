import java.util.*;

public class NumFactors {
    static void factor(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (i * i == n)
                continue;
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);
        sc.close();
    }
}
