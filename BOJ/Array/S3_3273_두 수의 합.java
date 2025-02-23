import java.io.*;
import java.util.*;

public class Main {
    // 투포인터와 배열의 관계
    // 첫번째 풀이는 이중 반복문으로 버블정렬처럼 풀었음 시간 복잡도 O(N^2)
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        int startPoint = 0;
        int endPoint = n-1;
        int count = 0;
        int temp = 0;

        // start point와 end point가 만날 때까지 반복
        while (startPoint < endPoint) {
            temp = numbers[startPoint] + numbers[endPoint];
            if(temp > x) {
                //endPoint 왼쪽으로 이동
                endPoint--;
            } else if (temp < x) {
                // startPoint 오른쪽으로 이동
                startPoint++;
            } else {
                // 일치하므로, start 오른쪽, end 왼쪽으로 이동
               startPoint++;
               endPoint--;
               count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
