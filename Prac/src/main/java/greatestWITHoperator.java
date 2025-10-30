import java.util.Scanner;

public class greatestWITHoperator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int a= s.nextInt();
		
		if (a%2==0)
		{
			System.out.println("a is even");
		}
		else
		{
			System.out.println("a is odd");
		}
		
		
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		
		if (b>c && b>d)
		{
			System.out.println("b is greatest");
		}
		else if(c>b && c>d)
		{
			System.out.println("c is greatest");
		}
		else
		{
			System.out.println("d is greatest");
		}
		
		
		
		
		
			
	}

}
