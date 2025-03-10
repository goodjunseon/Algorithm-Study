import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        while (deque.size() != 1) {
            deque.poll();
            deque.offer(deque.pollFirst());
        }
        System.out.println(deque.peek());

    }
}