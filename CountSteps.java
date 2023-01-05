package myPackage;

public class CountSteps {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int p = 1;
		int q = 1;
		for(int i = 2; i <= n; i++) {
			int r = p + q;
			q = p;
			p = r;
		}
		System.out.println(p);
	}

}
