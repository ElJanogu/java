
public class Mitarbeiter extends Person {
	private String abteilung;
	private int id;
	
	public Mitarbeiter() {
		super();
	}
	
	public Mitarbeiter(String name_, String birthdate_, int number_, String abteilung_, int id_) {
		super(name_, birthdate_, number_);
		this.abteilung = abteilung_;
		this.id = id_;
	}
	
	public String toString() {
		return super.toString() + " Abteilung : " + this.abteilung + " id : " + this.id;
	}
	
	public void setAbteilung(String abteilung_) { this.abteilung = abteilung_; }
	
	public void setId(int id_) { this.id = id_; }
	
	public String getAbteilung() { return this.abteilung; }
	
	public int getId() { return this.id; }
}
