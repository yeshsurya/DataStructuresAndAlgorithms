package testpackage;

import java.util.Stack;
//import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String s = sc.nextLine();
        int n = 12;
        String s = "DDUUDDUDUUUD";
        int res = countingValleys(n, s);
        System.out.println("Hello World! result  = " + res);
    }

    public static int countingValleys(int n, String s) {
        Stack<String> st = new Stack<String>();
        Stack<String> us = new Stack<String>();
        char[] ch = s.toCharArray();
        int count = 0;
        // boolean up = false;
        // boolean down = false;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'D') {
                if (st.empty() && us.empty()) {
                    count++;
                    st.push("D");
                } else {
                    st.push("D");
                    if (!us.empty()) {
                        us.pop();
                        st.pop();
                    }

                }
            }
            if (ch[i] == 'U') {
                if (st.empty() && us.empty()) {
                    us.push("U");
                } else {
                    us.push("U");
                    if (!st.empty()) {
                        st.pop();
                    }
                }
            }
        }
        return count;

    }
}
