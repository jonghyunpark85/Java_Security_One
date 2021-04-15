package Problem7;

public final class PersonInitialized {

	String name;
	String phone;
	boolean initialized = false;

	public PersonInitialized() {
		initialized = true;
	}

	public PersonInitialized(String name, String phone) {
		try {
			if (name == null || phone == null)
				throw new IllegalArgumentException("Missing user data");

			this.name = name;
			this.phone = phone;
			initialized = true;

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		if (initialized) {
			return name;
		} else {
			return null;
		}
	}

	public String getPhone() {
		if (initialized) {
			return phone;
		} else {
			return null;
		}
	}

	public boolean validate(String name, String phone) {
		boolean valid = false;

		if (this.name.equals(name) && this.phone.equals(phone)) {
			valid = true;
		}
		return valid;
	}
}
