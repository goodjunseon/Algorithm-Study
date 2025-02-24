import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N; // 학생 수
        int K; // 한방의 최대 인원 수

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[][] student = new int [2][7]; // 성별, 학년
        int room = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(br.readLine());
            int grade = Integer.parseInt(br.readLine());

            student[gender][grade]++;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                if (student[i][j] > 0) {
                    if(student[i][j] % K == 0) {
                        room += (student[i][j] / K);
                    } else {
                        room += (student[i][j] /K ) + 1;
                    }
                }
            }
        }

        System.out.println(room);
    }
}
