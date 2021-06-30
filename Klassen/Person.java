
public class Person {
	private String name;
	private String birthdate;
	private int number;
	
	public Person() {}
	
	public Person(String name_, String birthdate_, int number_) {
		this.name = name_;
		this.birthdate = birthdate_;
		this.number = number_;
	}
	
	public String toString() {
		return "Name : " + this.name + " birthdate : " + this.birthdate + " Number : " + this.number;
	}
	
	public void setName(String name_) { this.name = name_; }
	
	public void setBirthdate(String birthdate_) { this.birthdate = birthdate_; }
	
	public void setNumber(int number_) { this.number = number_; }
	
	public String getName() { return this.name; }
	
	public String getBirthdate() { return this.birthdate; }
	
	public int getNumber() { return this.number; }
}
