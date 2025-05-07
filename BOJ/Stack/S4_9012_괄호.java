import java.io.*;
import java.util.Stack;

// S4_9012_괄호
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            char[] charArray = str.toCharArray();

            for (char c : charArray) {
                if (stack.isEmpty()){
                    stack.push(c);
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}