//Progam to check anagram
package myPackage;
import java.util.Arrays;
import java.util.Scanner;

public class StringRotationValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		int n = sc.nextInt();
		char a[] = new char[n];
		int pv = 0;
		for(int i = 0; i < n; i++) {
			char r = sc.next().charAt(0);
			int p = sc.nextInt() % len;
			if(p == 0) {
				a[i] = str.charAt(pv);
				continue;
			}
			if(r == 'L') {
				pv = (pv + p) % len;
				a[i] = str.charAt(pv);
			}
			else {
				pv = pv - p;
				if(pv < 0)
					pv = len + pv;
				a[i] = str.charAt(pv);
			}
		}
		Arrays.sort(a);
		for(int i = 0; i < len - n - 1; i++) {
			if(Arrays.equals(a, str.substring(i, i + n).toCharArray())) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
	}
}
