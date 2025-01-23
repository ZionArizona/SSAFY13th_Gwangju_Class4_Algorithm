import java.util.Scanner;

class Main {
	
	static char array[][];
	static char map[] = { 'W', 'B'};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		
		array = new char[N][M];
		int min_change = Integer.MAX_VALUE;
		
		for (int x = 0; x < N; x++) {
			String st = sc.nextLine();
			for (int y = 0; y < M; y++)
				array[x][y] = st.charAt(y);
		}

		for (int x = 0; x <= N-8; x++)
		{
			for (int y = 0; y <= M-8; y++)
			{
				int count_black = 0, count_white = 0;
				int index_x = 0, index_y = 0;
				
				for (int temp_x = x; temp_x < 8+x; temp_x++)
				{
					index_y = 0;
					for (int temp_y = y; temp_y <8+y; temp_y++)
					{	
						if (array[temp_x][temp_y] != map[(index_x + index_y + 1)% 2])
							count_black++;
						
						if (array[temp_x][temp_y] != map[(index_x + index_y) % 2])
							count_white++;
						
						index_y++;
					}
					index_x++;
				}
				
				if (min_change > count_black)
					min_change = count_black;
				if (min_change > count_white)
					min_change = count_white;
			}
		}
		
		System.out.println(min_change);
	}
	
}
