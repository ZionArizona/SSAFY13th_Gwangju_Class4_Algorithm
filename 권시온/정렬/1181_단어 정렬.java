import java.util.*;
import java.io.*;

//람다함수 이용 필수인 문제.

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        
        
        // 크기가 0인 배열을 제공하면, toArray는 내부적으로 정확한 크기의 새 배열을 생성.
        // set.toArray(str)을 할경우 내부적으로 str크기의 String 배열을 생성. 그리고 set 요소를 넣기 때문에 부족하면 null값을 넣는다.
        String[] strAns = set.toArray(new String[0]);
        
        
        // 밑 람다식에서 arr1은 strAns[i], arr2는 strAns[i+1]이다.
        Arrays.sort(strAns, (arr1,arr2) -> {
            if(arr1.length() == arr2.length()){
                // compareTo를 이용해 사전순 정렬을 수행
                return arr1.compareTo(arr2);
            }
            else{
                // 길이순 정렬렬
                return arr1.length() - arr2.length();
            }
        });
        
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i = 0; i < strAns.length; i++){
            bw.write(strAns[i] + "\n");
        }
        
        bw.flush();
        bw.close();
        
	}
}
