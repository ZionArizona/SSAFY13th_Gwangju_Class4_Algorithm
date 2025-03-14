import java.util.*;
import java.io.*;

public class Main {

	static int N;
	static int[] arr;
	static long ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		ans = Long.MAX_VALUE;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int idx = 0;
		
		int leftAns = 0;
		int rightAns = 0;
		
		
		for(int i = 0; i < N -2; i++) {
			int left = i + 1;
			int right = N -1;
			
			
			while(left < right) {
				
				// 절댓값 비교
				long chk = (long)arr[i] + (long)arr[left] + (long)arr[right];
				
				if(Math.abs(chk) < ans) {
					ans = Math.abs(chk);
					idx = i;
					leftAns = left;
					rightAns = right;
				}
				
				
				if(chk > 0) {
					right--;
				}
				else if(chk < 0){
					left++;
				}
				else {
					break;
				}
				
			}
			
		}
		
		if(arr[idx] < arr[leftAns] && arr[leftAns] < arr[rightAns]) {
			System.out.println(arr[idx] + " " + arr[leftAns] + " " + arr[rightAns]);
		}
		else if(arr[idx] < arr[rightAns] && arr[rightAns] < arr[leftAns]) {
			System.out.println(arr[idx] + " " + arr[rightAns] + " " + arr[leftAns]);
		}	
		else if(arr[leftAns] < arr[idx] && arr[idx] < arr[rightAns]) {
			System.out.println(arr[leftAns] + " " + arr[idx] + " " + arr[rightAns]);
		}
		else if(arr[leftAns] < arr[rightAns] && arr[rightAns] < arr[idx]) {
			System.out.println(arr[leftAns] + " " + arr[rightAns] + " " + arr[idx]);
		}
		else if(arr[rightAns] < arr[idx] && arr[idx] < arr[leftAns]) {
			System.out.println(arr[rightAns] + " " + arr[idx] + " " + arr[leftAns]);
		}
		else if(arr[rightAns] < arr[leftAns] && arr[leftAns] < arr[idx]) {
			System.out.println(arr[rightAns] + " " + arr[leftAns] + " " + arr[idx]);
		}
		
		
	} // main
	
}