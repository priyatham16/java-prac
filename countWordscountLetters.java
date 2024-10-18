package javaPrac;

import java.util.Scanner;

public class countWordscountLetters {

	public static void main(String[] args) {

		
		
		// number of words in a string//		
		String str;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter sentance");
		str = s.nextLine();

		int length = str.split("\\s").length;
		System.out.println(length);
		
		
		
		
		// no of letters in word//
		System.out.println("no of letters in word");
		String word = s.nextLine();

		int c = 0;

		for (int i = 0; i < word.length(); ++i)
		{
			++c;
		}
		System.out.println(c);
		
		
		
		// no of letter repetitions in string
		System.out.println("enter your string");
		String rep = s.nextLine();
		char v = 'x';
		int c1 = 0;
		for (int j = 0; j < rep.length(); j++) {
			if (rep.charAt(j) == v) {
				c1++;
			}
		}
		System.out.println(c1);
		
		
		
		
		
		
		//no of char in a given string//
		System.out.println("enter string");
		String yourstr = s.nextLine();
		
		int c2=0;
		for(int k=0;k< yourstr.length();k++)
		{
			if(yourstr.charAt(k)!=' ')
			{
				c2++;
			}
		}
		System.out.println(c2);
		
		
		
		

	}

}
