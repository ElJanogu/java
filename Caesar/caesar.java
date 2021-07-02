import java.util.Scanner;

public class caesar {
	public static void main(String[] args) {
		System.out.println("Programm wurde gestartet");
		
		int t = start();
		int g = grad();
		
		String str = execute(t,g);
		System.out.println("Ergebnis : " + str);
		
	}
	
	// gibt an ov verschl / entschl werden soll
	public static int start() { 
		System.out.println("Soll Ver- oder Entschlüsselt werden ? 1 = Verschlüsseln | 0 = Entschlüsseln");
		Scanner sc = new Scanner(System.in);
		
		Integer inte = Integer.parseInt(sc.nextLine()); 
		
		return inte != 0 && inte != 1 ? -1 : inte;
	}
	
	public static int grad() { 
		System.out.println("Geben sie den Grad der Ver- / Entschlüsselung an");
		Scanner sc = new Scanner(System.in);
		
		return Integer.parseInt(sc.nextLine()) % 26; 
	}
	
	public static String execute(int type, int grade) { 
		System.out.println("Geben Sie nun den Text ein");
		Scanner sc = new Scanner(System.in);
		
		String output = "";
		String text = sc.nextLine();
		
		if(type == 1) {
			for(int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				// Umlaute werden bisher noch ignoriert
				if (c >= 'A' && c <= 'Z') {
					c = (char) (c + grade);
					if(c > 'Z') c -= 26;
				} else if (c >= 'a' && c <= 'z') {
					c = (char) (c + grade);
					if(c > 'z') c -= 26;
				}
				output += c;
				
			}
		}
		if(type == 0) {
			for(int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				// Umlaute werden bisher noch ignoriert
				if (c >= 'A' && c <= 'Z') {
					c = (char) (c - grade);
					if(c < 'A') c += 26;
				} else if (c >= 'a' && c <= 'z') {
					c = (char) (c - grade);
					if(c < 'a') c += 26;
				}
				output += c;
				
			}
		}
		
		
		return output; 
	}
	
	
}
