import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int i;
        for (i = n; x < arr[i - 1]; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = x;
        for (i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}