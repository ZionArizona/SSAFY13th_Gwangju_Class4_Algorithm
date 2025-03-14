import java.util.*;
import java.io.*;

public class Main {
	
	static int N,M;
	static int ans;
	static int[][] arr;
	static boolean[][] vis;
	static List<Point> list;
	static int land;
	static int[] drow = {-1,1,0,0};  // 상 하 좌 우
	static int[] dcol = {0,0,-1,1};
	
	static StringBuilder sb;
	
	static class Point{
		int x;
		int y;
		int num;
		Point(int x, int y,int num){
			
			this.x = x;
			this.y = y;
			this.num = num;
			
		}
	}
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ans = 0;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		
		list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] != 0) {
					list.add(new Point(i,j,0));
				}
			}
		}
		
		int i = 0;
		while(true) {

			land = 0;
			
			if(chk()) {  //섬이 서로 연결이 되어 있다면. 즉, land가 1일때
				// 녹이기 실행
				melt();
				//System.out.println();
			}else {  // 섬이 연결되어 있지 않다. 두가지 경우. 1. land가 2이상일 경우.    2. 다 녹았는데 섬이 쪼개지지 않을 경우. 
				if(land == 0) {  // 2번.
					i = 0;
					break;
				}
				else {
					break;
				}		
			}	
			
			i++;
		}
		
		
		System.out.println(i);
		
		
	} // main
	
	
	static void melt() {
		
		List<Point> remove = new ArrayList<>();
		
		for(Point p : list) {
			
			int sum = 0;
			
			for(int i = 0; i < 4; i++) {
				
				int nextrow = p.x + drow[i];
				int nextcol = p.y + dcol[i];
				
				if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < M && arr[nextrow][nextcol] == 0) sum++;
				
			}
			if(arr[p.x][p.y]-sum <=0 ) {
				remove.add(p);
			}
			else {
				arr[p.x][p.y] -= sum; 
			}
			
		}
		for(Point r : remove) {
			arr[r.x][r.y] = 0; 
			list.remove(r);
		}
		
	} // melt
	
	static boolean chk() {
		
		
		vis = new boolean[N][M];
		
		if(list.isEmpty()) return false; // 다 녹은 경우
		
		for(Point P : list) {
			
			if(!vis[P.x][P.y]) {
				land++;
				go(P.x,P.y);
			}
			
		}
		
		if(land == 1) return true; // 섬이 연결되어 있는 경우
		
		return false;
	} // chk
	
	static void go(int row, int col) {
		
		vis[row][col] = true;
		
		for(int i = 0; i < 4; i++) {
			
			int nextrow = row + drow[i];
			int nextcol = col + dcol[i];
			
			if(nextrow >= 0 && nextrow < N && nextcol >= 0 && nextcol < M && !vis[nextrow][nextcol] && (arr[nextrow][nextcol]!=0)) {
				go(nextrow, nextcol);
			}
			
		}
		
	} //go
	
}