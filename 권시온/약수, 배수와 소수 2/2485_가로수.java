import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        
        int[] arr1 = new int[N-1];
        
        for(int i = 0; i < N-1;i++){
            arr1[i] = arr[i+1] - arr[i];
        }
        
        int ans = arr1[0];
        for(int i = 1; i < N-1; i++){
            ans = gcd(ans,arr1[i]);
        }
        
        int answer = 0;
        for(int i = 0; i < N-1; i++){
            answer += (arr1[i]/ans)-1;
        }
        
        
        System.out.println(answer);
	}
    public static int gcd(int a, int b){
        if(b > a){
            int temp = b;
            b = a;
            a = temp;
        }
        
        while(b != 0){
            int res = a%b;
            a = b;
            b = res;
        }
        return a;
    }	
}
