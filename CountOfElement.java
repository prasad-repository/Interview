import java.util.Scanner;

public class CountOfElement {
	public static void main(String[] args) {
		int a[]= {6,8,9,5,5};
		System.out.println("enter a number");
	    Scanner sc= new Scanner(System.in);
	     int k=sc.nextInt();
		int count=0;
		int i=0;
		for (i = 0; i < a.length; i++) {
			
				if(a[i]==k)
				{
				count++;
				
				}
				
			
			
			
		}
		System.out.println(i+" is "+count+" times");
		for (i = 0; i < a.length; i++) {
			
			if(a[i]!=k)
			{
			count=0;
			
			}
			
		
		
		
	}
		
	System.out.println(i+" is "+count+" times");

		
	}

}
