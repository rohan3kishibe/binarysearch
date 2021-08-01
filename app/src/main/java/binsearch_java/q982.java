package binsearch_java;

public class q982 {
    public int solve(int[] rooms, int target) {
        int posn = -1;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] >= target) {
                posn = rooms[i];
                break;
            }
        }
        return posn;
    }
}
