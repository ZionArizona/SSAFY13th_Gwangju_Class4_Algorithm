import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Coordinate {
        int x;
        int y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static int R, C;
    private static final int[][] delta = {{-1,0},{1,0},{0,-1},{0,1}}; // 상, 하, 좌, 우
    private static char[][] map;
    private static boolean[][] visited;
    private static Queue<Coordinate> queue, fireQueue;
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //1. R과 C 입력받기 (1 ≤ R, C ≤ 1000) R은 미로 행의 개수, C는 열의 개수
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];
        queue = new ArrayDeque<>();
        fireQueue = new ArrayDeque<>();

        //2. R줄동안 각각의 미로 행 입력 받기
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                char c = line.charAt(j);
                if (c == 'F') fireQueue.add(new Coordinate(i, j));
                if (c == 'J') {
                    queue.add(new Coordinate(i, j));
                    visited[i][j] = true;
                    c = '.';
                }
                map[i][j] = c;
            }
        }

        int cnt = move();

        //7. 지훈이가 불에 타기전에 탈출할 수 있는지의 여부, 그리고 얼마나 빨리 탈출할 수 있는지 출력
        System.out.println(cnt == -1 ? "IMPOSSIBLE" : cnt);
    }


    private static int move() {
        int cnt = 0;

        while (!queue.isEmpty()) {
            cnt++;

            int moveSize = queue.size();
            for (int i = 0; i < moveSize; i++) {
                Coordinate temp = queue.poll();

                //5. 지훈이는 미로의 가장자리에 접한 공간에서 탈출
                if (escape(temp.x, temp.y) && map[temp.x][temp.y] == '.') return cnt;

                //3. 지훈이와 불은 매 분마다 한칸씩 수평 또는 수직으로 (대각선 이동 x) 이동
                for (int[] d : delta) {
                    int nr = temp.x + d[0];
                    int nc = temp.y + d[1];

                    if (isRange(nr, nc) && !visited[nr][nc] && map[nr][nc] == '.') {
                        visited[nr][nc] = true;
                        queue.add(new Coordinate(nr, nc));
                    }
                }
            }

            int fireSize = fireQueue.size();
            for (int i = 0; i < fireSize; i++) {
                Coordinate temp = fireQueue.poll();

                //4. 지훈이가 이동하고 난 다음 네 방향으로 불 확산
                for (int[] d : delta) {
                    int nr = temp.x + d[0];
                    int nc = temp.y + d[1];

                    if (isRange(nr, nc) && map[nr][nc] == '.') {
                        map[nr][nc] = 'F';
                        fireQueue.add(new Coordinate(nr, nc));
                    }
                }
            }
        }
        return -1;
    }

    private static boolean escape(int x, int y) {
        return x == 0 || y == 0 || x == R - 1 || y == C - 1;
    }

    private static boolean isRange(int nr, int nc) {
        return nr >= 0 && nr < R && nc >= 0 && nc < C;
    }
}
