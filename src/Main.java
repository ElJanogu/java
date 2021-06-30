import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
	 	Variablen / Datentypen
	 	array
	 	Kontrollstrukturen
	 	Funktionen
	 	Konsoleneingabe
		 */
	
		// Uebersicht
		boolean b = false; // o. true
	
		byte by = 25;
		short s = -45;
		int i = 200000;
		long l = -24454654;
	
		float f = 12.21f;
		double d = 23.14;
	
		char c = 'A';
		String str = "Das ist ein String";
	
		// Aenderungen Vornehmen
		b = true;
		
		by = (byte) (by + 2);
		s += 4;
		i++; // ==> i = i + 1
		++l;
		
		f += 2.54;
		d = 177.43;
		
		i = i + by;
		l += by;
		
		int i2 = (int) (f + d);
		System.out.println(f + " " + d + " " + i2);
		
		str += " " + c;
		
		int[] arr = new int[5];
		String[] arr2 = {"This","is","an","array"};
		// arrays ansprechen
		arr[0] = 5;
		arr[arr.length-1] = -1;
		
		// kontrollstruktiren
		
		// if abfrage
		int a = 7;
		
		if (a > 5) System.out.println("a groesser 5");
		
		if (a == 3) {
			System.out.println("a ist gleich 3");
		} else {
			System.out.println("a ist ungleich 3");
		}
		
		if (a == 72) {
			System.out.println("a ist gleich 72");
		} else if (a >= 25 && a < 101) {
			System.out.println("a ist groesser gleich 25 und kleiner als 101");
		} else if (a % 2 == 0 || a == -1) {
			System.out.println("a ist eine gerade Zahl oder gleich minus eins");
		} else {
			System.out.println("ehh ...");
		}
		
		// switch case
		int num = 6;
		
		switch(num) {
			case 5:
			case 6:
				System.out.println("its a 5 or 6");
				break;
			case 85:
				num = -1;
				break;
			default:
				System.out.println("do something");
				break;
		}
		
		// while / do-while
		String str_ = "Hello World";
		while(str_.length() != 0) {
			System.out.println(str_);
			if (str_.length() == 1) str_ = "";
			else {
				str_ = str_.substring(0, str_.length() - 1);
			}
		}
		
		do {
			str_ += "a";
			System.out.println(str_);
		}while(!str_.equals("aaaaa"));
		
		// for schleife
		for(int z = 0; z < 20; z++) {
			System.out.println(String.valueOf(z));
		}
		
		int[] arr_ = {3,8,12,44,5,1,-43,-2};
		for(int zz : arr_) {
			System.out.println(String.valueOf(zz));
		}
		
		System.out.println("tippe etwas in die konsole ^^");
		Scanner sc = new Scanner(System.in);
		System.out.println("deine nachricht : " + sc.nextLine());
	}
	
	void hello () 
	{
		System.out.println("hello there");
	}
	
	int add (int a, int b) {
		return a + b;
	}
	
}
