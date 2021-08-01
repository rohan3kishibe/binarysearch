package binsearch_java;

import java.util.*;

public class q151 {
    public int solve(int x, int y) {
        int setBits = 0;
        int p = x ^ y;
        while (p > 0) {
            setBits += p & 1;
            p >>= 1;
        }
        return setBits;
    }
}