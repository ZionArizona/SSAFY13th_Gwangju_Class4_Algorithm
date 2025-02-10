import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String,Integer> map = HashMap<>();
        
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            
            if(str.length() >= M){
                map.put(str, map.getOrDefault(str,0)+1)
            }
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        
        list.sort((a,b) -> {
            int fir = map.get(a);
            int sec = map.get(b);
            
            if(fir != sec){
                return Integer.parse(sec,fir);
            }
            if(a.length() != b.length()){
                return Integer.parse(b.length(), a.length());
            }
            
            return a.compareTo(b);
            
        });
        
        
        StringBuilder str = new StringBuilder();
        
        for(String chk : list){
            str.append(chk + "\n");
        }
        
        System.out.println(str);
            
	}
}
