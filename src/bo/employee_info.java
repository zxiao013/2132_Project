package bo;

public class employee_info {
	private int e_id; 
	private String e_basicInformation;
	private String e_position; 
	private int e_salary;
	private String e_name;
	private int b_id;
	private String password;
	
	public employee_info( int e_id,String e_basicInformation, String e_position,int e_salary,String e_name,int b_id, String password) {
		this.e_id = e_id;
		this.e_basicInformation = e_basicInformation;
		this.e_position = e_position;
		this.e_salary = e_salary;
		this.e_name = e_name;
		this.b_id = b_id;
		this.password=password;
	}
	public employee_info(String e_name,int e_id,String password) {
		this.e_name  =e_name;
		this.e_id= e_id;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public String getBasicInformation(){
		return e_basicInformation;
	}
	public String getPosition() {
		return e_position;
	}
	public int getSalary() {
		return e_salary;
	}
	public String getname() {
		return e_name;
	}
	
	public int getBranchId() {
		return b_id;
	}
	public int getID() {
		return e_id;
	}	
}
