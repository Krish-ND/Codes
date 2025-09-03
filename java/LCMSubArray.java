import java.util.*;

public class LCMSubArray {

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int res = 1;
            for (int j = i; j < n; j++) {
                if (arr[j] > k)
                    break;
                res = lcm(res, arr[j]);
                if (res == k)
                    count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}