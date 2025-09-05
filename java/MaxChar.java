import java.util.*;

public class Solution {

    public static int CharCount(String str) {
        int len = str.length();
        int max = 0, count = 0;
        for (int i = 0; i < len; i++) {
            char check = str.charAt(i);
            for (char ch : str.toCharArray()) {
                if (ch == check)
                    count++;
            }
            if (count > max)
                max = count;
            // Updating the count value as max
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CharCount(str));
        sc.close();
    }
}