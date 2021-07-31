import java.util.Scanner;
import java.util.ArrayList;
//todo
public class q215 {
    public static ArrayList<Integer> extractDigit(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 0) {
            int p = n % 10;
            arr.add(p);
            n = n / 10;
        }
        return arr;
    }

    public static boolean solve(int n) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}
