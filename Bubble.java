
public class Bubble {
	public static void main(String[] args) {
		int a[]= {9,5,8,2,6};
	    int b[]=sort(a);
	    int v=a.length;
	    //System.out.println(v);
	    for(int i=0;i<v;i++)
	    System.out.println(" "+a[i]);
	    System.out.println("largest element in the location" +(v-1)+" " +a[v-1]);
	}

	private static int[]  sort(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
		
	}

}
