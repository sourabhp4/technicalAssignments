//Punish Theif
package myPackage;
import java.util.Arrays;
import java.util.Scanner;

public class PunishTheif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		for(int i = 0; i < n; i++)
			s[i] = sc.nextLine();
		String max = "";
		int vcnt = 0;
		for(int i = 0; i < n; i++) {
			int cnt = vowelCount(s[i]);
			if(cnt >= vcnt) {
				vcnt = cnt;
				max = s[i];
			}
		}
		System.out.println(max);
		char a[] = max.toCharArray();
		Arrays.sort(a);
		char c = a[0];
		String vowel = "AEIOUaeiou";
		int pcnt = 0, ccnt = 1;
		for(int i = 0; i < max.length() - 1; i++) {
			if(vowel.contains("" + a[i])) {
				if(a[i] != a[i + 1]) {
					if(ccnt > pcnt) {
						pcnt = ccnt;
						c = a[i];
						ccnt = 1;
					}
				}
				else
					ccnt++;
			}
		}
		System.out.println(c + " " + pcnt);
	}
	static int vowelCount(String s) {
		int cnt = 0;
		String vowel = "aeiouAEIOU";
		for(int i = 0; i < s.length(); i++)
			if(vowel.contains("" + s.charAt(i)))
				cnt++;
		return cnt;
	}
}
