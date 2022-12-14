//Program for Super Market

public class SuperMarket {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		long res = 1;
		int len = str.length();
		for(int i = 0; i < len; i++)
			res *= Character.getNumericValue(str.charAt(i));
		System.out.println(res);
	}

}
