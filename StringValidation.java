//Program for String Validation

import java.util.Arrays;

public class StringValidation {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		int n1 = 0, n2 = 0;
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == '#')
				n1++;
			else
				n2++;
		}
		System.out.println(n2 - n1);
	}
}
