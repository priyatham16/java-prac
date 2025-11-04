import java.util.Scanner;

public class arrays1 {

	public static void main(String[] args) {
		int[] a = new int[4];
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		for (int j = 0; j < a.length; j++) {
			a[j] = s.nextInt();
		}

//		int f=s.nextInt();
//		int g=s.nextInt();
//		int h=s.nextInt();
//		int m=s.nextInt();
//		a[0]=f;
//		a[1]=g;
//		a[2]=h;
//		a[3]=m;

		int sum = 0;
		double sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println(sum1 / a.length);

		int great = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > great) {
				great = a[i];
			}

		}
		System.out.println(great);
		
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			
			}
		}
		System.out.println(min);
		

	}

}
