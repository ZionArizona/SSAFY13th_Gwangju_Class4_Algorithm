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
