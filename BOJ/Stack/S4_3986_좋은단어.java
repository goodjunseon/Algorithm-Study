import java.io.*;
import java.util.Stack;

// S4_3986_좋은 단어
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int goodWord = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (char c : line.toCharArray()) {
                if (stack.isEmpty()){
                    stack.push(c);
                }else if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()){
                goodWord++;
            }

        }
        System.out.println(goodWord);
    }
}