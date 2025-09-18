package holberton.password;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(Lifecycle.PER_CLASS)
public class PersonTest {
	
	private Person person=new Person(null, null);

	@BeforeAll 
	public void setup() {
		this.person = new Person(null, null);
	}
	
	/*
	 * Crie um teste Parametrizado chamado check_user_valid que valida a o método checkUser()e deve passar no teste para os sequintes valores:
		“PaulMcCartney2”, “NeilArms2”
		*/
	@ParameterizedTest
	@ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
	public void check_user_valid(String value) {
		this.person.setUserName(value);
		assertTrue(this.person.checkUser());
	}
	
	/*
	 * Crie um método Parametrizado chamado check_user_not_valid() que valida a o método checkUser()e deve passar no teste para os sequintes valores:

		“Paul#McCartney”, “Neil@Arms”
	 * */
	@ParameterizedTest
	@ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
	public void check_user_not_valid(String value) {
		this.person.setUserName(value);
		assertFalse(this.person.checkUser());
	}
	
	/*
	 * Crie o teste Parametrizado does_not_have_letters() que testa o metodo check_password() com os sequintes valores:

		“123456789”, “#$%1234”
	 * */
	@ParameterizedTest
	@ValueSource(strings = {"123456789", "#$%1234"})
	public void does_not_have_letters(String value) {
		this.person.setPassword(value);
		assertFalse(this.person.checkPassword());
	}
	
	
	/*
	 * Crie o teste Parametrizado does_not_have_numbers() que testa o metodo check_password() com os sequintes valores:

		“Abcabcdefgh@”, “#hbtn@%tc”
	 * */
	@ParameterizedTest
	@ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
	public void does_not_have_numbers(String value) {
		this.person.setPassword(value);
		assertFalse(this.person.checkPassword());
	}
	
	/*
	Crie o teste Parametrizado does_not_have_eight_chars() que testa o metodo check_password() com os sequintes valores:
	
	“Abc@123”, “12$@hbt”
	 * */
	@ParameterizedTest
	@ValueSource(strings = {"Abc@123", "12$@hbt"})
	public void does_not_have_eight_chars(String value) {
		this.person.setPassword(value);
		assertFalse(this.person.checkPassword());
	}
	
	/*
	Crie o teste Parametrizado check_password_valid() que valida a o método check_password() e deve passar no teste para os sequintes valores:

	“abC123456$”, “Hbtn@1234”, “Betty@1#2”, “Hbtn@123”
	 * */
	@ParameterizedTest
	@ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
	public void check_password_valid(String value) {
		this.person.setPassword(value);
		assertFalse(this.person.checkPassword());
	}
}
