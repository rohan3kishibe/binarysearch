import java.util.Scanner;

public class q750 {
    public static boolean solve(int n) {
        boolean status = false;
        if (n == 0) {
            return true;
        }
        for (int i = 1; i < (int) Math.ceil((double) Math.sqrt((double) n) + 1); i++) {
            if (i * i == n) {
                status = true;
                break;
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
}
