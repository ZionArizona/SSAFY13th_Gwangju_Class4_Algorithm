import java.util.*;
import java.io.*;

//람다함수 이용 필수인 문제.

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            
        }
		
		// 여기서 e1, e2는 2차원 배열이다.
		Arrays.sort(arr, (e1, e2) -> {
		    if(e1[0] == e2[0]){
		        // e1[0] --> e1[i][0],  e2[0] ---> e2[i+1][0]
		        return e1[1] - e2[1]; //e1[i][1](e1[1])이 크면 e2[1]가 앞으로 나와 정렬한다.
		    }
		    else{
		        return e1[0] - e2[0];
		    }
		});
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < N; i++){
		    bw.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
