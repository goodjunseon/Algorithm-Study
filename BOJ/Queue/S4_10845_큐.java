import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        while (N > 0) {

            String input = br.readLine();
            String[] command;
            if (input.contains("push")){
                command = input.split(" ");
                deque.offer(Integer.parseInt(command[1]));
            } else {

                if(input.equals("size")) {
                    System.out.println(deque.size());
                } else if (input.equals("empty")) {
                    if (deque.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if (deque.isEmpty()) {
                    System.out.println(-1);
                } else if (input.equals("pop")) {
                    System.out.println(deque.poll());
                } else if (input.equals("front")) {
                    System.out.println(deque.peekFirst());
                } else if (input.equals("back")) {
                    System.out.println(deque.peekLast());
                }
            }
            N--;
        }


    }
}

