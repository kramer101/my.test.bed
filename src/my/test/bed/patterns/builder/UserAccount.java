package my.test.bed.patterns.builder;

public class UserAccount {

	private String userName;
	private String email;
	private String firstName;
	private String middleName;
	private String lastName;
	
	
	
	private UserAccount() {
		
	}
	
	
	
	
	/*public Builder username(final String userNameParam) {
		userName = userNameParam;
		return this;
	}




	public UserAccount email(final String emailParam) {
		email = emailParam;
		return this;
	}




	public UserAccount firstname(final String firstNameParam) {
		firstName = firstNameParam;
		return this;
	}




	public UserAccount middlename(final String middleNameParam) {
		middleName = middleNameParam;
		return this;
	}




	public UserAccount lastname(final String lastNameParam) {
		lastName = lastNameParam;
		return this;
	}




	public UserAccount build() {
		return this;
	}




	public String getUserName() {
		return userName;
	}




	public String getEmail() {
		return email;
	}




	public String getFirstName() {
		return firstName;
	}




	public String getMiddleName() {
		return middleName;
	}




	public String getLastName() {
		return lastName;
	}
	*/
	
	
	
	public static class Builder extends UserAccount {
		
	}
	
}
