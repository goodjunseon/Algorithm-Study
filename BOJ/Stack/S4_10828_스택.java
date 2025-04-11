import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] token = line.split(" ");
            String command= token[0];

            if(command.equals("push")) {
                Integer value = Integer.parseInt(token[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                if(stack.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);
            }else if(command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}

