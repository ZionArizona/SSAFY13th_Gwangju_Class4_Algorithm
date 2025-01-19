import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Main {
	static Scanner sc = new Scanner(System.in);
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static TreeMap<Integer, String> map_1 = new TreeMap<>();
	static TreeMap<String, Integer> map_2 = new TreeMap<>();
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= N; i++) 
		{
			String temp = sc.nextLine();
			map_1.put(i, temp);
			map_2.put(temp, i);
		}
		
		
		for (int i = 0; i < M; i++)
		{
			if(sc.hasNextInt())
			{
				int temp = sc.nextInt();
				bw.write(map_1.get(temp)+"\n");
			}
			
			else 
			{
				String temp = sc.next();
				bw.write(map_2.get(temp)+"\n");
			}
		}
		bw.flush();
	}
}


