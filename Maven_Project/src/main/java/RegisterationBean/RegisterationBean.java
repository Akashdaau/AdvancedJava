package RegisterationBean;

public class RegisterationBean {
	
	private String FName;
	private String LName;
	private String Email;
	private int Contact;
	private String Address;
	private int Password;
	
	public RegisterationBean()
	{
		
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		this.FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		this.LName = lName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	
	  public int getContact() { 
		  return Contact;
		  }
	  
	  public void setContact(int contact) { 
		  this.Contact = contact;
		  }
	 

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		this.Password = password;
	}
	
	
	

}
