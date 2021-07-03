import java.util.Arrays;
import java.util.Scanner;

public class subs {
	
				  // org    A   B   C   D   E   F   G   H   I   J   K   L   M   N   O   P   Q   R   S   T   U   V   W   X   Y   Z  ' '
	static char[] org =   {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
	static char[] chars = {'B','J','H','Q','U','C','O','G','Z','T','E','L','R','A','I','P','N','X','K','V','D',' ','S','Y','M','W','F'};
	
	public static void main(String[] args) {
		System.out.println("Eingabe : Verschlüsseln = 1 | Entschlüsseln = 0");
		Scanner sc = new Scanner(System.in);
		Integer i = Integer.parseInt(sc.nextLine());
		if(i == 1) {
			verschluesseln();
		} else if (i == 0) {
			entschluesseln();
		} else {
			System.out.println("ERROR");
		}
	}
	
	public static void verschluesseln() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toUpperCase();
		char[] bs = text.toCharArray();
		
		String newText = "";
		for(int i = 0; i < text.length(); i++) {
			if (bs[i] == ' ') {
				newText += chars[26];
				continue;
			}
			newText += chars[((int)bs[i])-65];
		}
		
		System.out.println("$" + newText + "$");
	}
	
	public static void entschluesseln() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine().toUpperCase();
		char[] bs = text.toCharArray();
		
		String newText = "";
		for(int i = 0; i < text.length(); i++) {
			newText += org[new String(chars).indexOf(bs[i])];
		}
		
		System.out.println("$" + newText + "$");
	}
}
