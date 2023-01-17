//Program to verify brackets
package myPackage;
import java.util.Scanner;
import java.util.Stack;

public class VerifyBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack();
		String str = sc.next();
		for(int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case '(': case '[': case '{': stk.push(str.charAt(i));
										break;
			case ')': if((char)stk.pop() != '(') {
						System.out.println(false);
						return;
					}
					break;
			case ']': if((char)stk.pop() != '[') {
				System.out.println(false);
				return;
			}
			break;
			case '}': if((char)stk.pop() != '{') {
				System.out.println(false);
				return;
			}
			break;
			}
		}
		System.out.println(true);
	}
}
