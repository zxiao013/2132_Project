package bo;

public class hosts_info {
	private int h_id;
	private String h_name;
	private String h_address;
	private String h_email;
	private int h_phone;
	private String password;
	
	public hosts_info(int h_id,String h_name,String h_address,String h_email,int h_phone,String password) {
		this.h_address = h_address;
		this.h_id = h_id;
		this.h_name = h_name;
		this.h_email = h_email;
		this.h_phone = h_phone;
		this.password = password;
	}
	public hosts_info(String h_name,String password, int h_id) {
		this.h_name = h_name;
		this.password = password;
		this.h_id = h_id;
	}
	
	public int getID() {
		return h_id;
	}
	public String getName() {
		return h_name;
	}
	public String getAddress() {
		return h_address;
	}
	
	public String getEmail() {
		return h_email;
	}
	public int getPhone() {
		return h_phone;
	}
	public String getPassword() {
		return password;
	}
}
