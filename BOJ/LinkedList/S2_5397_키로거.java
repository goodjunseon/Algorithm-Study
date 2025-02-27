import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char[] command = input.toCharArray();

            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            for (char op : command) {
                if (op == '<') {
                    if (!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                } else if (op == '>') {
                    if (!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                } else if (op == '-') {
                    if (!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(op);
                }
            }

            StringBuilder sb = new StringBuilder();

            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }

            while (!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }
            System.out.println(sb);
        }
    }
}

