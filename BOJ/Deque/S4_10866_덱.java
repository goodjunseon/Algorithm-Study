import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        while(N > 0) {
            String[] command = br.readLine().split(" ");
            if (command[0].contains("push")){
                switch (command[0]) {
                    case "push_front":
                        deque.push(Integer.parseInt(command[1]));
                        break;
                    case "push_back":
                        deque.offer(Integer.parseInt(command[1]));
                        break;
                    default:
                        throw new RuntimeException("해당 타입 없음.");
                }
            } else if (command[0].contains("pop")) {
                if (deque.isEmpty()){
                    System.out.println(-1);
                } else {
                    switch (command[0]) {
                        case "pop_front":
                            System.out.println(deque.pollFirst());
                            break;
                        case "pop_back":
                            System.out.println(deque.pollLast());
                            break;
                        default:
                            throw  new RuntimeException("해당 타입 없음");
                    }
                }

            } else if (command[0].equals("size")) {
                System.out.println(deque.size());
            } else if (command[0].equals("empty")) {
                if(deque.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (deque.isEmpty()) {
                System.out.println(-1);
            } else {
                if (command[0].equals("front")) {
                    System.out.println(deque.peekFirst());
                } else if (command[0].equals("back")) {
                    System.out.println(deque.peekLast());
                }
            }
            N--;
        }

    }
}