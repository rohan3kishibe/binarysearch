package binsearch_java;

public class q750 {
    public boolean solve(int n) {
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
}
