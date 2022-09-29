package MasterClassJava;

public class Person {
	private String firstName, lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		
		if(age < 0 || age > 100) {
			age = 0;
		}
			this.age = age;
	}
	
	public boolean isTeen() {
		if(age > 12 && age < 20 ) {
			
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if(firstName.length() == 0 && lastName.length() == 0) {
			return "";
		}else if(lastName.length() == 0) {
			return firstName;
		}else if(firstName.isEmpty()){
			return lastName;
		} 
		return  firstName + " " + lastName;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(101);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		System.out.println("fullName= " + person.getFullName());
		person.setAge(18);
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());

	}

}
