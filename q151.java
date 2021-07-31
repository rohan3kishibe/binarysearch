import java.util.*;

public class q151 {
    public static int solve(int x, int y) {
        int setBits = 0;
        int p = x ^ y;
        while (p > 0) {
            setBits += p & 1;
            p >>= 1;
        }
        return setBits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(solve(x,y));
        sc.close();
    }
}
