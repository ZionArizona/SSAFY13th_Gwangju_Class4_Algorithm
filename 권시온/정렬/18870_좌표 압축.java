import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        // for(int i = 0; i < N; i++){
        //     System.out.println(ans[i] + " ");
        // }
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] ans = arr.clone();
        
        Arrays.sort(arr);
        
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        
        Map<Integer,Integer> mp = new HashMap<>();
        
        int rank = 0;
        for(int i = 0; i < N; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],rank);
                rank++;
            }
        }
        
        for(int i = 0; i < N; i++){
            bw.write(mp.get(ans[i]) + " ");   
        }
        
        bw.flush();
        bw.close();
        
	}
}
