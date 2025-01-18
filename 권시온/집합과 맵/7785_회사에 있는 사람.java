import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Map<String,String> mp = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            
            if(status.equals("enter")){
                mp.put(name,status);
            }
            else{
                mp.remove(name);
            }
        }
        
        //정렬 수행을 위한 배열 생성.
        List<String> li = new ArrayList<>(mp.keySet());
        li.sort(Collections.reverseOrder());
        
        for(int i = 0; i < li.size(); i++){
            System.out.println(li.get(i));
        }
        
	}
}