import java.util.*;
import java.io.*;

// 처음에는 List를 사용 했다. 하지만 List는 공간 복잡도가 n 으로 메모리 초과가 발생한다.
// List<integer>는 int 보다 공간 복잡도가 약 4배 더 크다.
//시간 복잡도는 70,000,000으로 괜춘.
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
		
		for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
		}
        
        Arrays.sort(arr);
    
        
        		
		for(int i = 0; i < N; i++){
		    bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}
