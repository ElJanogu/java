import java.util.Scanner;

public class matrix2 {
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
		System.out.println("Text eingeben bitte");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] text_ = text.toCharArray();
		System.out.println(text.length());
		int size = (int) Math.sqrt(text.length()) + 1;
		
		char[][] matrix = new char[size][size];
		
		for(int y = 0; y < size; y++) {
			for(int x = 0; x < size; x++) {
				matrix[x][y] = ' ';
			}
		}
		
		System.out.println(matrix.length + "  " + matrix[0].length);
		
		int index = 0;
		
		for(int y = 0; y < size; y++) {
			for(int x = 0; x < size; x++) {
				if (index < text_.length) {
					matrix[x][y] = text_[index++];
				} 
			}
		}
		
		String myText = "";
		
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				myText += matrix[x][y];
			}
		}
		
		System.out.println("$" + myText + "$");
	}
	
	public static void entschluesseln() {
		System.out.println("Text eingeben bitte");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] text_ = text.toCharArray();
		System.out.println(text.length());
		int size = (int) Math.sqrt(text.length());
		
		char[][] matrix = new char[size][size];
		
		for(int y = 0; y < size; y++) {
			for(int x = 0; x < size; x++) {
				matrix[x][y] = ' ';
			}
		}
		
		System.out.println(matrix.length + "  " + matrix[0].length);
		
		int index = 0;
		
		for(int y = 0; y < size; y++) {
			for(int x = 0; x < size; x++) {
				if (index < text_.length) {
					matrix[x][y] = text_[index++];
				} 
			}
		}
		
		String myText = "";
		
		for(int x = 0; x < matrix.length; x++) {
			for(int y = 0; y < matrix[0].length; y++) {
				myText += matrix[x][y];
			}
		}
		
		System.out.println("$" + myText + "$");
	}
}
