
public class ArraY6 {
public static void main(String[] args) {
	int a[]= {2,5,8,9};
	int k[]= new int[6];
	int m[]= new int[8];
	
	for (int i = 0; i<a.length; i++)
	{
		
		if(a[i]%2==0)
		{
			k[i]=a[i];
			
		  
		  System.out.println("Even number is  "+k[i]);
			
		}
	}
	for (int i = 0; i<a.length; i++)
	{
		
		if(a[i]%2==1)
		{
		m[i]=a[i];	
		System.out.print("Odd number is  " +m[i]);
		
		
		}
	}
		
		
		
		
	}
	
}


