import java.util.Scanner;

public class greatestusingloops {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("enter number");

		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int greatest=a[0];		

		for (int i=1;i<a.length;i++)
		{
			if(a[i]>greatest)
			{
				greatest=a[i];
			}
					

		}
		System.out.println(greatest+"is greatest");
		
		System.out.println("enter number");

		for (int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int n:a)	
		{
			if(n>greatest)
			{
				greatest=n; 
			}
		}
		System.out.println(greatest +"greatest is ");

		
		
	}

}
