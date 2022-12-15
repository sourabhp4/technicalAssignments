//Program to vowel Shifting
package myPackage;

import java.util.Scanner;

public class VowelShift1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char str[] = s.toCharArray();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			if(str[i] == 'e')
				str[i] = 'o';
			else if(str[i] == 'o')
				str[i] = 'e';
			else if(str[i] == 'i')
				str[i] = 'u';
			else if(str[i] == 'u')
				str[i] = 'i';
		}
		System.out.println(new String(str));
	}

}
