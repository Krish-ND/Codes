import java.util.*;

class OddCount {

    public static int oddnum(int n) {
        return (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int lowcount = oddnum(low - 1);
        int highcount = oddnum(high);
        System.out.println(highcount - lowcount);
        sc.close();
    }
}