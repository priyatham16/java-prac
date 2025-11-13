import java.util.Scanner;

public class stringCounter {

	public static void main(String[] args) {
		System.out.println("enterrrrrrr");
		Scanner s = new Scanner(System.in);
		char[] chrarr = s.next().toCharArray();
		int count = 0;

		char[] vow = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < chrarr.length; i++) {
			for (char c : vow) {
				if (chrarr[i] == c) {
					count++;
				}
			}

		}
		System.out.println(count+" is the vowel count");
		
		//int l=chrarr.length;
		//System.out.println(l-count+" is consonent count");
		// this will count the spaces and special char also 
		
		
		
		
		
		
	}

}
