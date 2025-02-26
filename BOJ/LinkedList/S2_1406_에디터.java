import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();



        for (char c : str.toCharArray()) {
            leftStack.push(c);
        }

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            char op = command.charAt(0);
            if (op == 'L') {
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (op == 'D') {
                if (!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }

            } else if (op == 'B') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            } else if (op == 'P') {
                leftStack.push(command.charAt(2));
            }
        }


        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }

        System.out.println(sb.toString());

    }
}

