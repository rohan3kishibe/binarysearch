import java.util.*;

public class p804 {

    public static boolean solve(String typed, String target) {
        /**
         * boolean status = false; String reducedString = ""; reducedString +=
         * typed.charAt(0); for (int i = 1; i < typed.length(); i++) { if
         * (typed.charAt(i) == typed.charAt(i - 1)) { continue; } else if
         * (typed.charAt(i) != typed.charAt(i - 1) && i != typed.length() - 1) {
         * reducedString += typed.charAt(i - 1); } else if (typed.charAt(i) !=
         * typed.charAt(i - 1) && i == typed.length() - 1) { reducedString +=
         * typed.charAt(i); } } if (reducedString == target) { status = true; } return
         * status;
         */
        // using sorted set
        SortedSet<Character> ts = new TreeSet<>();
        boolean status = false;
        for (int i = 0; i < typed.length(); i++) {
            ts.add(typed.charAt(i));
        }
        SortedSet<Character> ts2 = new TreeSet<>();
        for (int i = 0; i < target.length(); i++) {
            ts2.add(typed.charAt(i));
        }
        if (ts.equals(ts2)) {
            status = true;
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(solve(a, b));
        sc.close();
    }
}