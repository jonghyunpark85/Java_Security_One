package Problem1;

public class UsePerson {
	public static void main(String args[]) {

		Person p = new Person("betty", "2345");
		showPerson(p);

		EvilPerson ep = new EvilPerson("evil", "4444");
		showPerson(ep);
	}

	private static void showPerson(Person p) {
		System.out.println(p.getName() + ", " + p.getPhone());
	}
}
