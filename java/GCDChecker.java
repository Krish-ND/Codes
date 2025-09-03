import java.util.*;

class GCDChecker {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = gcd(res, arr[i]);
        }
        System.out.println(res);
        sc.close();
    }
}