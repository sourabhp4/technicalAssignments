//Simple Calculator
package myPackage;

public class SimpleCalculator {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).nextLine();
		int n = 0, res = 0, i = 0;
		String c = "+-/*";
		while(!c.contains("" + str.charAt(i))) {
			n = n * 10 + Integer.parseInt("" + str.charAt(i));
			i++;
		}
		res = n;
		for( ; i < str.length(); i++) {
			if(c.contains("" +str.charAt(i))) {
				switch(str.charAt(i)) {
				case '+': res += n;
							n = 0;
							break;
				case '-': res -= n;
							n = 0;
							break;
				case '*': res *= n;
							n = 0;
							break;
				case '/': if(n == 0) {
							System.out.println("Invalid");
							return;
						}
							res /= n;
							n = 0;
				}
			}
			else {
				n = n * 10 + Integer.parseInt("" + str.charAt(i));
			}
		}
		System.out.println(res);
	}
}
