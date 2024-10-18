package javaPrac;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {

		System.out.println("enter string");

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String dum = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			dum = c + dum;
		}
		System.out.println(dum);
		
		
		
		
		//using stringbuilder
		System.out.println("string 2");
		String str2 = s.nextLine();
		
		StringBuilder sb=new StringBuilder(str2);
		System.out.println(sb.reverse());
		
		
		
		
		//using stringbuffer
				System.out.println("string 3");
				String str3 = s.nextLine();
				
				StringBuffer sb1=new StringBuffer(str3);
				System.out.println(sb1.reverse());
		
		

	}

}
