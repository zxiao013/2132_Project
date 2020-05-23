package bo;

public class admin_info {
	private String a_name;
	private int a_id;
	private String a_password;
	
	public admin_info(String a_name,int a_id,String a_password) {
		this.a_name = a_name;
		this.a_id = a_id;
		this.a_password = a_password;
	}
	
	public String getName() {
		return a_name;
	}
	public int getID() {
		return a_id;
	}
	public String getPassword() {
		return a_password;
	}


}
