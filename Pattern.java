//X-Pattern program

public class Pattern {
	public static void main(String args[]) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		char c[] = str.toCharArray();
		int index = 0;
		for(int i = 1; i < len * 2; i++) {
			if(i == len)
				System.out.println(" ".repeat(index) + c[index] + " ".repeat(index++));
			else
				System.out.println(" ".repeat(index) + c[index] + " ".repeat((len - index) * 2 - 3) + c[index] + " ".repeat(index++));
			if(i >= len)
				index -= 2;
		}
	}
}
