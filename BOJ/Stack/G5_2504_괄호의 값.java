import java.io.*;
import java.util.Stack;

// G5_2504_괄호의 값
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Stack<Object> stack = new Stack<>();


        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else {
                int temp = 0;

                // 숫자가 연속으로 쌓여 있을 경우를 처리
                // 괄호가 열리고 닫힐 때 그안에 계산된 숫자들을 합산
                while (!stack.isEmpty() && stack.peek() instanceof Integer) {
                    temp += (int) stack.pop(); // 괄호 안 숫자 누적합
                }

                // 스택이 비어있으면 잘못된 괄호 구조
                if (stack.isEmpty()) {
                    System.out.println(0);
                    return;
                }

                char open = (char) stack.pop(); // 여는 괄호 꺼냄

                // 짝이 안맞는 경우도 잘못된 구조
                if ((c == ')' && open != '(') || (c== ']' && open != '[')) {
                    System.out.println(0);
                    return;
                }

                // temp == 0 이면 바로 붙은 괄호쌍이므로 기본값 처리
                // () -> 2, [] -> 3
                if (temp == 0) {
                    stack.push(c == ')' ? 2 : 3);
                } else {
                    // temp가 있으면 내부에 값이 있었던 것이므로
                    // 괄호 값 곰셈 적용: ()는 *2, []는 *3
                    stack.push(c == ')' ? temp * 2 : temp * 3);
                }
            }
        }

        // 최종 결과 게산
        int result = 0;

        // 스택에 남아있는 것이 숫자이면 정상
        // 괄호가 남아 있다면 잘못된 구조
        while (!stack.isEmpty()) {
            if (!(stack.peek() instanceof Integer)) {
                System.out.println(0);
                return;
            }
            result += (int) stack.pop(); // 모든 숫자 합산
        }

        System.out.println(result);
    }
}