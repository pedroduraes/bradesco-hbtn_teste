package holberton.mei;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Person {

	public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner,
			boolean publicServer, float salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.anotherCompanyOwner = anotherCompanyOwner;
		this.pensioner = pensioner;
		this.publicServer = publicServer;
		this.salary = salary;
	}

	private String name;
	private String surname;
	private Date birthDate;
	private boolean anotherCompanyOwner;
	private boolean pensioner;
	private boolean publicServer;
	private float salary;

	// Crie um método chamado fullName retornando name e surname com espaço entre eles.
	public String fullName() {
		return String.format("%s %s", this.getName(), this.getSurname());
	}

	//Implemente o método calculateYearlySalary() multiplicando o salary por 12
	public float calculateYearlySalary() {
		return this.getSalary() * 12;
	}
	
	/*
	 * Implemente o método isMEI()
	(salary * 12) < 130000 = true
	age> 18
	anotherCompanyOwner deve ser false
	pensioner deve ser false
	publicServer deve ser false*/
	public boolean isMEI() {
		LocalDate birth = this.birthDate.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate();
		
		return this.calculateYearlySalary() < 130000 && Period.between(birth, LocalDate.now()).getYears() > 18
				&& !this.anotherCompanyOwner && !this.pensioner && !this.publicServer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isAnotherCompanyOwner() {
		return anotherCompanyOwner;
	}

	public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
		this.anotherCompanyOwner = anotherCompanyOwner;
	}

	public boolean isPensioner() {
		return pensioner;
	}

	public void setPensioner(boolean pensioner) {
		this.pensioner = pensioner;
	}

	public boolean isPublicServer() {
		return publicServer;
	}

	public void setPublicServer(boolean publicServer) {
		this.publicServer = publicServer;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
