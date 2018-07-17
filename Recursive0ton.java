import java.util.Scanner;

public class Recursive0ton {
	public static void main(String[] args) {
		//System.out.println("Enter number");
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int n=1;
		print(n);
		
		
	}

	private static void print(int n) {
		//System.out.println(n);
		if(n==101)
			return ;
			System.out.println(n);
			print(n+1);
		
			
		
		
		
	}

}
