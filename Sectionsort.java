
public class Sectionsort {
	public static void main(String[] args) {
		int a[]= {5,2,8,4,9};
		  int m[]=  selection(a);
		  for (int i = 0; i < a.length; i++) {
			  System.out.println(a[i]);
			
		}
		
	}

	private static int[] selection(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[min]>a[j])
				{
					min=j;
				}
				int t=a[min];
				a[min]=a[i];
				a[i]=t;
				
				
			}
			
		}
		return a;
	}

}
