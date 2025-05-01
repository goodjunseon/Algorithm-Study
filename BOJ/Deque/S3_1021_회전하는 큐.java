import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 회전하는 큐
public class Main {
    public static void main(String[] args) throws IOException {

        int N, M;
        int count = 0; // 총 연산 횟수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // N = 10
        M = Integer.parseInt(st.nextToken()); // M = 3

        int[] targets = new int[M];

        st = new StringTokenizer(br.readLine()); // 다음 줄 입력 받기
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken()); // 1, 2, 3
        }


        // 초기 큐 구성
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }


        for (int i = 0; i < M; i++) {
            int target = targets[i];
            int index = ((LinkedList<Integer>) deque).indexOf(target);
            int halfIndex = deque.size() / 2;

            if (index == 0) {
                deque.pollFirst();
                continue;
            }
            if (index <= halfIndex) {
                /*
                 * 앞쪽 원소들을 뒤로 보내기
                 */
                for (int j = 0; j < index; j++) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }

            } else {
                /*
                 * 뒤쪽 원소들을 앞으로 보내기
                 */
                for (int j = 0; j < deque.size() - index; j++) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst(); // 연산이 끝나면 맨 앞 원소를 삭제
        }
        System.out.println(count);
    }
}