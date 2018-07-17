import java.util.Scanner;

public class HacklandEle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.nextLine();
		}
		String s=hackland(str);
		System.out.println("Winner of the election "+s);
		
	}

	 static String hackland(String[] str) {
		 int k=str.length;
		 int count[]=new int[k];
		 for(int i=0;i<k;i++)
		 {
			 for(int j=0;j<k;j++)
			 {
				 if(str[i].equals(str[j]))
					 count[i]++;
			 }
		 }
		 int temp=0;
		 for(int i=0;i<k;i++)
		 {
		 if(temp<count[i])
			 temp=count[i];
		 }
		 int nm=0;
		 String[] st=new String[k];
		 
		 for(int i=0;i<k;i++)
		 {
			 if(count[i]==temp)
			 {
				 st[nm]=str[i];
				 
			 nm++;
			 }
				 
				 
		 }
		 String str4="";
		 for(int i=0;i<nm;i++)
		 {
			 if(st[i].compareTo(str4)>0)
				 str4=st[i];
				 
		 }
		return str4;
		
	}

}
