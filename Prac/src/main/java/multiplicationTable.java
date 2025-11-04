import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter numbers of X");
		int first = s.nextInt();
		int second = s.nextInt();

		for (int i = 1; i <= second; i++) {
			int cross = first * i;
			System.out.println(first+"*"+i + "=" + cross);
			
		}

	}

}
