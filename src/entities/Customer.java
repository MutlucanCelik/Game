package entities;

public class Customer {
	
	private int id;
	private String name;
	private String lastName;
	private String userName;
	private String registerType;
	private String identiyNumber;
	private String password;
	private String email;
	private double balance;
	
	
	public Customer() {
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentiyNumber() {
		return identiyNumber;
	}

	public void setIdentiyNumber(String identiyNumber) {
		this.identiyNumber = identiyNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getRegisterType() {
		return registerType;
	}


	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}
	
	
	
	
	
	
	
}
