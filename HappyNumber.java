//Happy Number
package myPackage;

public class HappyNumber {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		while(true) {
			n = digitSum(n);
			if(n == 1) {
				System.out.println(true);
				break;
			}
			else if(n / 10 == 0) {
				System.out.println(false);
				break;
			}
		}
	}
	static int digitSum(int n) {
		int sum = 0;
		while(n != 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return sum;
	}
}
