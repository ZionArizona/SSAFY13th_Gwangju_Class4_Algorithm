import java.util.*;
import java.io.*;

public class Main {
	
	static int R,C;
	static char[][] arr;
	static int[] drow = {-1,0,0,1};  // 상 좌 우 하
	static int[] dcol = {0,-1,1,0};
	static int startrow;
	static int startcol;
	static int targetrow;
	static int targetcol;
	static int Sans;
	static int starcnt;
	static boolean find;
	static List<Point> water;
	
	static private class Point{
		int x;
		int y;
		boolean spread;
		Point(int x, int y, boolean spread){
			this.x = x;
			this.y = y;
			this.spread = spread;
		}
		
	}

	

	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());

	    
	    R = Integer.parseInt(st.nextToken());
	    C = Integer.parseInt(st.nextToken());
	    arr = new char[R][C];
	    starcnt = 0;
	    water = new ArrayList<>();
	    
	    for(int i = 0; i < R; i++) {
	    	String str = br.readLine();
	    	for(int j = 0; j < C; j++) {
	    		arr[i][j] = str.charAt(j);
	    		if(arr[i][j] == 'S') {
	    			startrow = i;
	    			startcol = j;
	    		}
	    		if(arr[i][j] == 'D') {
	    			targetrow = i;
	    			targetcol = j;
	    		}
	    		if(arr[i][j] == '*') {
	    			starcnt++;
	    			water.add(new Point(i,j,false));
	    		}
	    		
	    		
	    	}
	    }
	    
	   int ans = 0;
	    boolean flag = false;
	    find = false;
	    Sans = 1;
	    
	    while(true) {
	    	
	    	//System.out.println(Sans);
	    	if(find ==  true) {
	    		break;
	    	}
            
            if(Sans <= 0) {
	    		flag = true;
	    		break;
	    	}
	    	
	    	move(); //고슴도치 움직이기
	    	
	    	watermove();
	    	
	    	ans++;
	    }
	    
	   if(flag == true) {
		   System.out.println("KAKTUS");
	   }
	   else {
		   System.out.println(ans);
	   }

	} // main

	static private  void watermove() {
		List<Point> tmp = new ArrayList<>();
		for(Point m : water) {
			
			if(m.spread == false) {
				for(int i = 0; i < 4; i++) {
					
					int nextrow = m.x + drow[i];
					int nextcol = m.y + dcol[i];
					
					if(nextrow < 0 || nextrow == R || nextcol < 0 || nextcol == C) continue;
					if(arr[nextrow][nextcol] == 'X' || arr[nextrow][nextcol] == 'D') continue;
					
					
					if(arr[nextrow][nextcol] == '.') {
						starcnt++;
						arr[nextrow][nextcol] = '*';
						tmp.add(new Point(nextrow, nextcol, false));
					}
					
					if(arr[nextrow][nextcol] == 'S') {
						Sans--;
						starcnt++;
						arr[nextrow][nextcol] = '*';
						tmp.add(new Point(nextrow, nextcol, false));
					}
					
					
				}
				m.spread = true;
			}
			
		}
		
		for(Point a : tmp) {
			water.add(a);
		}
		
		
	} // watermove
	
	static private void move() {
		
		List<Point> tmp = new ArrayList<>();
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(arr[i][j] == 'S') {
					tmp.add(new Point(i,j,false));
						
				}
			}
		}
		
		
		for(Point chk : tmp) {
			for(int c = 0; c < 4; c++) {
				
				int nextrow = chk.x + drow[c];
				int nextcol = chk.y + dcol[c];
				
				if(nextrow == targetrow && nextcol == targetcol) {
					find = true;
					return;
				}
				
				if(nextrow >= 0 && nextrow < R && nextcol >= 0 && nextcol < C && arr[nextrow][nextcol] == '.') {
					Sans++;
					arr[nextrow][nextcol] = 'S';
				}
			}
			
		}
			
	} // move
	
}