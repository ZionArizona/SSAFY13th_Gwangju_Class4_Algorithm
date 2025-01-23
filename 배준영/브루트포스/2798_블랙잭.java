import java.util.Scanner;

class Main {
	
	static int array[], N, M;
	static boolean visit[];
	static int max_card;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		array = new int[N];
		visit = new boolean[N];
		max_card = 0;
		
		for (int i = 0 ; i < N; i++)
			array[i] = sc.nextInt();
		
		DFS(0, 0, 0);
		
		System.out.println(max_card);
	}
	
	public static void DFS(int vertex, int sel_card, int depth) {
		
		if (depth == 3) 
		{
			if (max_card < sel_card && sel_card <= M)
				max_card = sel_card;
			return;
		}
		
		for (int i = vertex; i < array.length; i++) 
		{
			if (!visit[i]) 
			{
				visit[i] = true;
				DFS(i, sel_card + array[i], depth+1);
				visit[i] = false;
			}
		}
	}
	
}
