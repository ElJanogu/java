import java.util.Scanner;

public class vigenere {
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

	private static void verschluesseln() {
		System.out.println("Text eingeben : ");
		Scanner sc = new Scanner(System.in);
		char[] text = sc.nextLine().toUpperCase().toCharArray();
		
		System.out.println("Schlüssel eingeben : ");
		char[] schl = sc.nextLine().toUpperCase().toCharArray();
		
		int[] t = new int[text.length];
		int[] s = new int[schl.length];
		char[] fin = new char[text.length];
		
		// konv
		for(int a = 0; a < text.length; a++) {
			t[a] = text[a]-65;
		}
		
		for(int b = 0; b < schl.length; b++) {
			s[b] = schl[b]-65;
		}
		
		// addition
		int index = 0;
		for(int c = 0; c < text.length; c++) {
			if (t[c] < 0) continue;
			t[c] = t[c] + s[index++];
			if (index == s.length) index = 0;
		}
		
		//val - checl
		for(int d = 0; d < text.length; d++) {
			if(t[d] > 25) t[d] -= 26;
			t[d] += 65;
		}
		
		// finish
		for(int e = 0; e < text.length; e++) {
			fin[e] = (char)(t[e]);
		}
		
		System.out.println("$" + String.copyValueOf(fin) +"$");
	}
	
	private static void entschluesseln() {
		System.out.println("Text eingeben : ");
		Scanner sc = new Scanner(System.in);
		char[] text = sc.nextLine().toUpperCase().toCharArray();
		
		System.out.println("Schlüssel eingeben : ");
		char[] schl = sc.nextLine().toUpperCase().toCharArray();
		
		int[] t = new int[text.length];
		int[] s = new int[schl.length];
		char[] fin = new char[text.length];
		
		// konv
		for(int a = 0; a < text.length; a++) {
			t[a] = text[a]-65;
		}
		
		for(int b = 0; b < schl.length; b++) {
			s[b] = schl[b]-65;
		}
		
		// addition
		int index = 0;
		for(int c = 0; c < text.length; c++) {
			System.out.println(t[c]);
			if (t[c] < 0) continue;
			t[c] = t[c] - s[index++];
			if (index == s.length) index = 0;
		}
		
		//val - checl
		for(int d = 0; d < text.length; d++) {
			if(t[d] < 0) t[d] += 26;
			t[d] += 65;
		}
		
		// finish
		for(int e = 0; e < text.length; e++) {
			fin[e] = (char)(t[e]);
		}
		
		System.out.println("$" + String.copyValueOf(fin).replace(':', ' ') +"$");		
		
	}
}
