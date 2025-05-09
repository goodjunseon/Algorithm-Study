import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// S1_2178_미로탐색
public class Main {

    static int[][] map;
    static int[][] dis;

    static int count;

    // 방향 벡터 (상 하 좌 우)
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        dis = new int[n][m];

        dis[0][0] = 1;

        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0,0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m ) {
                    if (map[nx][ny] == 1 && dis[nx][ny] == 0) {
                        queue.offer(new Pair(nx,ny));
                        count = dis[x][y] + 1;
                        dis[nx][ny] = count;
                    }
                }
            }
        }

        System.out.println(dis[n-1][m-1]);


    }
}