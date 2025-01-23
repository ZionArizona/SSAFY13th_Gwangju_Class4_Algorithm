import java.util.Scanner;

class Main {
	
	static int array[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		array = new int[6];
		for (int i = 0; i < 6; i++)
			array[i] = sc.nextInt();
		
		int answer[] = new int[2];
		
		
		
		for (int x = -999; x <= 999; x++)
		{
			for (int y = -999; y <= 999; y++)
			{
				if (array[0] * x + array[1] * y == array[2] &&
						array[3] * x + array[4] * y == array[5])
				{
					answer[0] = x;
					answer[1] = y;
				}
			}
		}
		
		System.out.println(answer[0] + " " + answer[1]);
			
	}
	
}
