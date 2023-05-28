package application.entities;

public class Employer {
	private String employerPassword;

	public Employer(String employerPassword) {
		this.employerPassword = employerPassword;
	}

	public String getEmployerPassword() {
		return employerPassword;
	}

	public void setEmployerPassword(String employerPassword) {
		this.employerPassword = employerPassword;
	}
}
