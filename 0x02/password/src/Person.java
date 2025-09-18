public class Person {

	private String userName;
	private String password;

	public Person(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Ter no mínimo 8 caracteres
	// Não deve conter caractere especial
	public boolean checkUser() {
		return this.userName != null && this.userName.length() >= 8 && this.userName.matches("[a-zA-Z0-9]+");
	}

	// Deve possuir pelo menos 1 letra maiúscula
	// Deve possuir pelo menos 1 número
	// Deve possuir pelo menos 1 caractere especial
	// Ter no mínimo 8 caracteres
	public boolean checkPassword() {
		boolean length = this.password != null && this.password.length() >= 8;
		boolean upperCase = this.password.matches("[^A-Z]+");
		boolean specialChar = !this.password.matches("[^a-zA-Z0-9]");
		boolean numbers = this.password.matches("[^0-9]");
		
		return length && upperCase && specialChar && numbers;
	}
}