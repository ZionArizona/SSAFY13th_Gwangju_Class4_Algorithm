import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String,String> name = new HashMap<>();
        Map<String, String> num = new HashMap<>();
        
        for(int i = 1; i <= N; i++){
            String str = br.readLine();
            name.put(str,String.valueOf(i));
            num.put(String.valueOf(i),str);
        }
        
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            
            
            if(isNumber(str)){
                System.out.println(num.get(str));
            }
            else{
                System.out.println(name.get(str));
            }
        }
        
	}
	// 정수인지 판별하는 isNumber 함수.
	// 자바는 파이썬과 다르게 정수를 판별하기 어렵다. 따라서 inNumber는 암기 필요.
	public static boolean isNumber(String str){
	    return str.matches("\\d+");
	}
	
}