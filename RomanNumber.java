//Program to print the value of Roman number
package myPackage;
public class RomanNumber {

	public static void main(String[] args) {
		String s = new java.util.Scanner(System.in).next();
		int len = s.length();
		int sum = 0;
		char pv = 'I';
		for(int i = len - 1; i > -1; i--) {
			switch(s.charAt(i)) {
			case 'V': sum += 5;
					pv = s.charAt(i);
					break;
			case 'L': sum += 50;
					pv = s.charAt(i);
					break;
			case 'D': sum += 500;
					pv = s.charAt(i);
					break;
			case 'M': sum += 1000;
					pv = s.charAt(i);
					break;
			case 'C': if(pv == 'D' || pv == 'M')
						sum -= 100;
					else {
						sum += 100;
						pv = s.charAt(i);
					}
					break;
			case 'X':if(pv == 'L' || pv == 'C')
						sum -= 10;
					else {
						sum += 10;
						pv = s.charAt(i);
					}
					break;
			case 'I': if(pv == 'V' || pv == 'X')
						sum--;
					else
						sum++;
			}
		}
		System.out.println(sum);
	}
}
