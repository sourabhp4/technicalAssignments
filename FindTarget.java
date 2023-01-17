//Find Target value
package myPackage;
import java.util.Scanner;

public class FindTarget {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0, j = 0;
		int target = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num == target) {
				j = i;
				cnt++;
			}
			else if(cnt > 0)
				break;
		}
		if(cnt == 0)
			System.out.println(-1 + " " + -1);
		else
			System.out.println((j - cnt + 1) + " " + j);
	}
}
