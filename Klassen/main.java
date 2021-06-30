
public class main {
	public static void main(String[] args) {
		Person p1 = new Person("Max Mustermann", "01.01.1891", 562351);
		p1.setNumber(426612);
		System.out.println(p1.toString());
		
		Person p2 = new Mitarbeiter("Marie Musterfrau", "31.12.1722",64744,"Vertrieb", 17);
		System.out.println(p2.toString());
	}
}

