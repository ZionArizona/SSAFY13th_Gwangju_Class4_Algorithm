import java.util.*;
import java.io.*;

public class Main {
	
	static int R,C,K;
	static String[][] arr;
	static int[] drow = {-1,0,0,1};  // 상   우   좌   하 
	static int[] dcol = {0,1,-1,0};
	static boolean[][] vis;
	static StringBuilder sb;
	static int ans;
	static int homex;
	static int homey;
	
	static class Point{
		int x;
		int y;
		int cnt;
		Point(int x, int y, int cnt){
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new String[R][C];
		
		int startrow = R-1;
		int startcol = 0;
		
		homex = 0;
		homey = C - 1;
		
		
		for(int i = 0; i < R; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < C; j++) {
				arr[i][j] = String.valueOf(str.charAt(j));
			}
		}
		
		ans = 0;
	
		vis = new boolean[R][C];
		vis[startrow][startcol] = true;
		go(R-1,0,1);
			
		
		System.out.println(ans);
	} // main
	
	static void go(int row, int col, int cnt){
		
		if(row == homex && col == homey) {
			if(cnt == K) ans++;
			return;
		}
		
		
		for(int i = 0; i < 4; i++) {
			
			int nextrow = row + drow[i];
			int nextcol = col + dcol[i];
			
			if(nextrow >= 0 && nextrow < R && nextcol >= 0 && nextcol < C ) {
				if(!vis[nextrow][nextcol] && !arr[nextrow][nextcol].equals("T")) {
				//System.out.println("yes");
				vis[nextrow][nextcol] = true;
				go(nextrow, nextcol,cnt+1);
				vis[nextrow][nextcol] = false;
					
				
				}
			}
			
		}
		
	} //go
	
}