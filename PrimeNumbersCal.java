//Program to find no. of prime numbers before given number
package myPackage;

public class PrimeNumbersCal {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int cnt = 0;
		for(int i = 2; i <= n; i++) {
			if(isPrime(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean isPrime(int n) {
		for(int i = 2; i * i <= n; i++)
			if(n % i == 0)
				return false;
		return true;
	}
}
