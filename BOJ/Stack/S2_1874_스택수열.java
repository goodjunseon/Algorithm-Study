import java.io.*;
import java.util.*;

// S2_2874_스택수열
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();// 출력한 결과물 저장

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while(N > 0) {
            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                // start + 1부터 입력받은 value 까지 push를 한다.
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n'); // + 를 저장한다.
                }
                start = value; // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }
            // top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
            N--;
        }
        System.out.println(sb);
    }
}

