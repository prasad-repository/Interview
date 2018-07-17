import java.util.Arrays;

public class Diff {
	public static void main(String[] args) {
		int a[]= {2,4,9,7};
		int k[]= {9,7,5,20};
		int min=k[0];
		int max=k[0];
		int temp=0;
		int i;
		Arrays.sort(a);
		System.out.println(a[2]);
		for(i=0;i<k.length;i++)
		{
			
		if(a[i]>temp)
			temp=a[i];
			if(max<k[i])
				max=k[i];
			if(min>k[i])
				min=k[i];
			
			
			}
	//	System.out.println(a[i]);
			
		}
		
	}


