package holberton.mei;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	// Crie o método setup que rode antes de todos os testes com o seguinte atributo
	// inicial -
	// name: “Paul - surname: "McCartney” - birthDate: 2000 - anotherCompanyOwner:
	// true, - pensioner: true, -publicServer: true,

	private Person person;

	@Before
	public void setup() {
		this.person = new Person("Paul", "McCartney", new GregorianCalendar(2000, 1, 1).getTime(), true, true, true, 1200);
	}

	@Test
	public void show_full_name() {
		//Utilize assertEquals para verificar se fullName() da Classe Person retorna a String “Paul McCartney”, sendo name= "Paul e surname="McCartney"
		String full = this.person.fullName();
		Assert.assertNotNull(full);
		Assert.assertEquals("Paul McCartney", full);
	}
	
	@Test
	public void test_calculateYearlySalary() {
		//Use assertEquals para verificar se o método calculateYearlySalary da Classe Person retorna 14400 para um salário mensal de 1200.
		float salary = this.person.calculateYearlySalary();
		Assert.assertTrue(14400 == salary);
	}
	
	@Test
	public void person_is_MEI() {
		person.setAnotherCompanyOwner(false);
		person.setPensioner(false);
		person.setPublicServer(false);
		person.setSalary(1000);
		boolean isMei = person.isMEI();
		Assert.assertTrue(isMei);
	}

	@Test
	public void person_is_not_MEI () {
		boolean isMei = person.isMEI();
		Assert.assertFalse(isMei);
		
	}
}
