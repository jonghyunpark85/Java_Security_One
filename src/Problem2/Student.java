package Problem2;

public final class Student {

	private final Person person;
	private final double gpa;

	public Student() {
		person = new Person();
		gpa = 0.0;
	}

	public Student(String name, String phone, double gpa) {
		person = new Person(name, phone);
		this.gpa = gpa;
	}

	public String getName() {
		return person.getName();
	}

	public String getPhone() {
		return person.getPhone();
	}

	public double getGPA() {
		return this.gpa;
	}
}