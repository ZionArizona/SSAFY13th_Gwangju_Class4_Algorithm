import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        int sum = 0;
       
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            
            sum += num;
            
            arr[i] = num;
            
            String strNum = String.valueOf(num);
            
            map.put(num, map.getOrDefault(num,0)+1);
            
        }
        
        int MaxFreq = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> chk : map.entrySet()){
            if(chk.getValue() == MaxFreq){
                list.add(chk.getKey());
            }
        }
        
        
        Collections.sort(list);
        int ans = (list.size() > 1) ? list.get(1) : list.get(0);
        
        Arrays.sort(arr);
        
        System.out.println(   (int)Math.round((double)sum/N)  );
        System.out.println(arr[N/2]);
        System.out.println(ans);
        System.out.println(arr[N-1] - arr[0]);
        
        
	}
}
