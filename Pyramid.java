//Program to print pyramid of no.s by prime numbers
package myPackage;
import java.util.ArrayList;

public class Pyramid {
	static int sum(int num) {
		if(num / 10 == 0)
			return num;
		return sum( sum(num / 10) + num % 10 );
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i * i < num; i++)
			if(num % i == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		int n1 = new java.util.Scanner(System.in).nextInt();
		int n2 = new java.util.Scanner(System.in).nextInt();
		int cnt = 0;
		ArrayList<Integer> num = new ArrayList<>();
		n1 = (n1 % 2 == 0) ? n1 + 1 : n1;
		for(; n1 < n2; n1 += 2) {
			if(isPrime(n1)) {
				num.add(n1);
				cnt++;
			}
				
		}
		System.out.println(num);
		int n = (int)Math.sqrt(cnt);
		int k = 0;
		for(int i = 0; i < n; i++) {
			System.out.print(" ".repeat(n - i - 1));
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print(sum(num.get(k++)));
				cnt--;
			}
			System.out.println();
		}
	}

}
