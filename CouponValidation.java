//Coupon validation for IPL
package myPackage;
import java.util.Scanner;

public class CouponValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for(int i = 0; i < n; i++)
			s[i] = sc.next();
		int cnt = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(hasAll(s, i ,j))
					cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean hasAll(String s[], int i , int j) {
		for(int k = 0; k < 9; k++) {
			if(! (s[i] + s[j]).contains("" + k) )
				return false;
		}
		return true;
	}
}
