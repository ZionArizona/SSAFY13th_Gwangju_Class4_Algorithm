import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	static HashMap<Integer, ArrayList<String>> map = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args)  {
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			
			if(map.containsKey(age))
				map.get(age).add(name);
			
			else {
				map.put(age, new ArrayList<>());
				map.get(age).add(name);
			}
		}
		
		ArrayList<Integer> sort_key = new ArrayList<>(map.keySet());
		Collections.sort(sort_key);
		
		for (int key : sort_key) {
			ArrayList<String> temp = map.get(key);
			
			for (int i = 0; i < temp.size(); i++) 
				System.out.println(key + " " + temp.get(i));
		}
	
	}
}



