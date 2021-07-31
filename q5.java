import java.util.Scanner;

public class q5 {
    public static boolean solve(int num) {
        boolean status = false;
        int q = num;
        int newNum = 0;
        while (num != 0) {
            int p = num % 10;
            newNum = newNum * 10 + p;
            num = num / 10;
        }
        if (newNum == q) {
            status = true;
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
