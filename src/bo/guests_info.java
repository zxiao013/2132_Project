package bo;

public class guests_info {
	private String g_lastName;
	private String g_firstName;
	private String g_fullName;
	private int g_id;
	private String g_birth; 
	private String g_address;
	private String g_email; 
	private String g_phone;
	private String password;
	public guests_info( String g_fristName,String g_lastName, String g_fullName,int g_id,String g_birth,String g_address, String g_email,String g_phone, String password) {
		this.g_fullName = g_fullName;
		this.g_id = g_id;
		this.g_birth = g_birth;
		this.g_address = g_address;
		this.g_email = g_email;
		this.g_phone = g_phone;
		this.g_firstName = g_fristName;
		this.g_lastName =g_lastName;
		this.password = password;
	}
	public guests_info(String g_fullName,String password,int g_id) {
		this.g_fullName = g_fullName;
		this.password = password;
		this.g_id = g_id;
	}
	public String getPassword() {
		return password;
	}
	public String getFullName() {
		return g_fullName;
	}
	public String getLastName() {
		return g_lastName;
	}
	public String getFirstName() {
		return g_firstName;
	}
	public int getID() {
		return g_id;
	}
	public String getBirth() {
		return g_birth;
	}
	
	public String getAddress() {
		return g_address;
	}
	
	public String getEmail() {
		return g_email;
	}
	public String getPhoneNum() {
		return g_phone;
	}
	
	
	
	
	
	
	
	
}
