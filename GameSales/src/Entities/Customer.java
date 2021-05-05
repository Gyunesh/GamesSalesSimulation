package Entities;


public class Customer {
	
	private int id;
	private String natinalityNo;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	public Customer () {
		
	}

	public Customer(int id, String natinalityNo, String firstName, String lastName, String dateOfBirth) {
		this.id = id;
		this.natinalityNo = natinalityNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNatinalityNo() {
		return natinalityNo;
	}

	public void setNatinalityNo(String natinalityNo) {
		this.natinalityNo = natinalityNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
