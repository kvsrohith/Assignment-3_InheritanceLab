package Part_1;

public class Doctor extends HospitalEmployee {
	private String speciality;
	public Doctor(String name, int number, String speciality) {
		super(name, number);
		this.speciality=speciality;
	}
@Override
public String toString()
{
	return super.toString() + " " +speciality +" ";
}
public void work() {
	String print=super.name+" works for the hospital. "+super.name+" is a(n) "+speciality+" doctor.";
    System.out.println(print);
}
}
