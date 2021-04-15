package Problem7;

public class UsePersonInitialized {

	public static void main(String[] args) {

		PersonInitialized pi1 = new PersonInitialized("adam", "1234");
		System.out.println("1) Name: " + pi1.getName() + ", Password: " + pi1.getPhone());

		PersonInitialized pi2 = new PersonInitialized("betty", null);
		System.out.println("2) Name: " + pi2.getName() + ", Password: " + pi2.getPhone());

		PersonInitialized pi3 = new PersonInitialized(null, "2345");
		System.out.println("3) Name: " + pi3.getName() + ", Password: " + pi3.getPhone());
	
		PersonInitialized pi4 = new PersonInitialized("betty", "2345");
		System.out.println("4) Name: " + pi4.getName() + ", Password: " + pi4.getPhone());

	}
}