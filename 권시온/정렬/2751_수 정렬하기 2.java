// 단순 Arrays.sort() 는 시간 복잡도가 최악의 경우 n^2(dual-pivot Quicksort 어쩌고 저쩌고)
// 이기 때문에 시간 초과 발생( 평균 시간 복잡도 n*logn)
// 다른 방법으로 Collections.sort() 라는 Timesort를 이용( 시간 복잡도 n ~ n*long). 단, Collections.sort()는 리스트를 사용.
import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int N = Integer.parseInt(br.readLine());
		 
		 ArrayList<Integer> li = new ArrayList<Integer>();
		 
        for(int i = 0; i < N; i++){
            li.add(Integer.parseInt(br.readLine()));
        }		 
        
        Collections.sort(li);

        br.close();
    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i: li){
            bw.write(i + "\n");
        }
		 
		bw.flush();
    bw.close();
	}
}
