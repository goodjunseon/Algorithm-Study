import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// S1_1926_그림
public class Main {
    //전역 변수 선언: 문제 전체에 걸쳐 사용
    static int n, m;
    static int[][] map;
    static boolean[][] visited;

    // 방향 벡터 (상 하 좌 우)
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];



        // 입력 처리: 그림 표현
        for (int i = 0; i  < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int maxArea = 0;

        // 전체 좌표를 탐색하며 BFS 시작
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    count ++;
                    maxArea = Math.max(maxArea,bfs(i,j));
                }
            }
        }

        System.out.println(count);
        System.out.println(maxArea);

    }

    private static int bfs(int startX, int startY) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(startX, startY));
        visited[startX][startY] = true;
        int area = 1;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int x = current.x;
            int y = current.y;

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >=0 && nx <n && ny < m) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new Pair(nx,ny));
                        area++;
                    }
                }

            }
        }
        return area;
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}