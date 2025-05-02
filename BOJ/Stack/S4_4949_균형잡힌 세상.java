import java.io.*;
import java.util.Stack;

// S4_4949_균형잡힌 세상
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean result = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        result = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        result = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty()){
                result = false;
            }

            if (result){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }
    }
}