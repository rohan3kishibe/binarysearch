package binsearch_java;

public class q85 {
    public int solve(int n) {
        int sum = 0;
        while (n != 0) {
            int p = n % 10;
            sum += p;
            n = n / 10;
        }
        return sum;
    }
}
