import java.util.*;
import java.io.*;

public class Main {
	
	static class Point{
		
		int x;
		int y;
		
		Point(int row, int col){
			this.x = row;
			this.y = col;
		}
	}
	
	static int[][] arr;
	static int N;
	static int M;
	static List<Point> home;
	static List<Point> chicken;
	static List<Integer> dis;
	static Point[] input;
	static int ans;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][N];
		home = new ArrayList<>();
		chicken = new ArrayList<>();
		
		
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] == 1) {
					
					Point p = new Point(i,j);
					home.add(p);
					
				}
				else if(arr[i][j] == 2) {
					Point p = new Point(i,j);
					chicken.add(p);
				}
			}
		}
		
		
		//조합.
		input = new Point[M];
		ans = Integer.MAX_VALUE;
		combination(0,0);
		
		System.out.println(ans);
		
	}  //main
	
	static void combination(int cnt, int start) {
			
		if(cnt == M) {
			int sum = 0;
			for(int i = 0; i < home.size(); i++) {
				int tmp = Integer.MAX_VALUE;
				Point chk = home.get(i);
				
				for(int j = 0; j < input.length; j++) {
					
					tmp = Math.min(tmp, Math.abs(chk.x - input[j].x) + Math.abs(chk.y - input[j].y));
					
				}
				sum+= tmp;
			}
			
			ans = Math.min(ans, sum);
			
			return;
		}
			
		for(int i = start; i < chicken.size(); i++) {
			
			input[cnt] = chicken.get(i);
			combination(cnt+1, i+1);
		}
		
		
	} // combination
	
}