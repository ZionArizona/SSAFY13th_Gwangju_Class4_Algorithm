import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            set.add(str);
        }
        
        int ans = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(set.contains(str)){
                ans++;
                list.add(str);
            }
        }
        
        Collections.sort(list);
        
        System.out.println(ans);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
	}
}