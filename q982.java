import java.util.*;

public class q982 {
    public static int solve(int[] rooms, int target) {
        int posn = -1;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] >= target) {
                posn = rooms[i];
                break;
            }
        }
        return posn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int p = sc.nextInt();
        int[] rooms = new int[p];
        for (int i = 0; i < rooms.length; i++) {
            int q = sc.nextInt();
            rooms[i] = q;
        }
        System.out.println(solve(rooms, target));
        sc.close();
    }
}
