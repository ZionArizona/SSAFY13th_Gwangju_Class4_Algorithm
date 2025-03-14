import java.util.*;
import java.io.*;

public class Main {
	
	static int N;
	static int[][] arr;
	static List<Point> eatlist;
	static List<Point> fish;
	static int[] drow = {-1,0,0,1};  // 상 좌 우 하
	static int[] dcol = {0,-1,1,0};
	static Point shark;
	static int time;


	static private class Point{
	    int x;
	    int y;
	    int dis; // 물고기 용
	    boolean flag; // 물고기 용
	    int size;
	    int status; //상어 용


	    private Point(int x, int y, int dis, boolean flag, int size, int status){
	        this.x = x;
	        this.y = y;
	        this.dis = dis;
	        this.flag = flag;
	        this.size = size;
	        this.status = status;
	    }

	}

	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;


	    N = Integer.parseInt(br.readLine());
	    arr = new int[N][N];
	    fish = new ArrayList<>();

	    for(int i = 0; i < N; i++) {
	        st = new StringTokenizer(br.readLine());
	        for(int j = 0; j < N; j++) {
	            arr[i][j] = Integer.parseInt(st.nextToken());
	            if(arr[i][j] == 0) continue;
	            if(arr[i][j] == 9){
	                shark = new Point(i,j,0,false, 2, 0);
	                arr[i][j] = 0;
	            }
	            else{
	                fish.add(new Point(i,j,0,false,arr[i][j],0));
	            }
	        }
	    }

	    time = 0;

	    while(true){

	    	eatable();
	    	
	    	Point tmpfish = rank();
	    	
	    	
	        if(tmpfish == null) break; // 먹을 물고기가 없으면 엄마 상어를 불러야하기 때문에 끝
	       

	        // 우선 순위 정해진 후 먹기 것 실행

            time += tmpfish.dis;
            arr[shark.x][shark.y] = 0;
            shark.x = tmpfish.x;
            shark.y = tmpfish.y;
            shark.status = shark.status + 1;
            if(shark.size == shark.status){
                shark.size = shark.size + 1;
                shark.status = 0;
            }
            arr[tmpfish.x][tmpfish.y] = 0;
            fish.remove(tmpfish);
	    }
	    System.out.println(time);

	} // main


	static private void eatable(){
		eatlist = new ArrayList<>();
	    for(Point chk : fish){

	        if(shark.size > chk.size){ //상어 크기 보다 작은 물고기만 먹을 수 있고 작으면 먹을 수 있는 리스트에 저장.
	            eatlist.add(chk);
	        }

	    }

	} // eat



	static private Point rank(){
		List<Point> tmp = new ArrayList<>();
	    // 각 물고기의 거리를 구해준다.
	    for(Point chk : eatlist){
	        int x = shark.x;
	        int y = shark.y;

	        int targetx = chk.x;
	        int targety = chk.y;

	        Queue<int[]> que = new ArrayDeque<>();
	        boolean[][] vis = new boolean[N][N];
	        que.offer(new int[]{x, y, 0});
	        vis[x][y] = true;
	        int tmpdis = 0;
	        while(!que.isEmpty()){

	            int[] f = que.poll();
	            int fx = f[0];
	            int fy = f[1];
	            int dis = f[2];

	            if(fx == targetx && fy == targety) {
	            	chk.dis = dis;
	            	tmp.add(chk);
	            }

	            for(int i = 0; i < 4; i++){

	                int nextrow = fx + drow[i];
	                int nextcol = fy + dcol[i];

	                if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < N && !vis[nextrow][nextcol] && arr[nextrow][nextcol] <= shark.size){
	                    vis[nextrow][nextcol] = true;
	                    que.offer(new int[]{nextrow, nextcol, dis+1});
	                }
	            }


	        }
	        
	    }

	    Collections.sort(tmp, (p1, p2) -> {
	        if (p1.dis != p2.dis) return p1.dis - p2.dis; // 1. dis 기준 정렬 (오름차순)
	        if (p1.x != p2.x) return p1.x - p2.x; // 2. y 기준 정렬 (오름차순)
	        return p1.y - p2.y; // 3. x 기준 정렬 (오름차순)
	    });

	    return tmp.isEmpty() ? null : tmp.get(0); 
	    
	    
	} // rank
}