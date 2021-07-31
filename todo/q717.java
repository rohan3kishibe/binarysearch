import java.util.Scanner;
import java.util.Stack;
//todo
public class q717 {
    public static int solve(String[] ops) {

        Stack<String> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            int top = Integer.parseInt(ops[i]);
            if (ops[i].equals("POP")) {
                st.pop();
            } else if (ops[i].equals("DUP")) {
                String q = st.peek();
                st.push(q);
            } else if (ops[i].equals("+")) {
                String p = st.peek();
                int pInt = Integer.parseInt(p);
                st.pop();
                String q = st.peek();
                int qInt = Integer.parseInt(q);
                st.pop();
                st.push(String.valueOf(pInt + qInt));
            } else if (ops[i].equals("-")) {
                String p = st.peek();
                int pInt = Integer.parseInt(p);
                st.pop();
                String q = st.peek();
                int qInt = Integer.parseInt(q);
                st.pop();
                st.push(String.valueOf(pInt - qInt));
            } else if (top > 0) {
                st.push(String.valueOf(top));
            }
        }
        return Integer.parseInt(st.peek());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        String[] ops = new String[p];
        for (int i = 0; i < p; i++) {
            String k = sc.nextLine();
            ops[i] = k;
        }
        System.out.println(solve(ops));
        sc.close();
    }
}
