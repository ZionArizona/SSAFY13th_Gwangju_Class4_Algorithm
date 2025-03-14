import java.util.*;
import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int ans = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int idxstart = 0;
		int idxend = N -1;
		int leftans = 0;
		int rightans = 0;
		
		while(idxstart < idxend) {
			int sum = arr[idxstart] + arr[idxend];
			//System.out.println(Math.abs(sum));
			//System.out.println(ans);
			
			if(Math.abs(sum) < ans) {
				ans = Math.abs(sum);
				leftans = idxstart;
				rightans = idxend;
			}
			
			if(sum > 0) {
				idxend--;
			}
			else{
				idxstart++;
			}
			
			
		}
		
		
		System.out.println(arr[leftans] + " " + arr[rightans]);
		
	}  //main
	
}