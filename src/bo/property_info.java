package bo;

import java.sql.Date;

public class property_info {
	private int h_id;
	private int b_id;
	private Date available_date;
	private String room_type;
	private String p_address;
	private String p_type;
	private String p_location;
	private double p_price;
	private boolean rented;
	private Date dates;
	public property_info(int h_id, int b_id, Date available_date, String room_type, String p_address, String p_type, String p_location, double p_price, boolean rented, Date dates) {
		this.h_id= h_id;
		this.b_id= b_id;
		this.available_date= available_date;
		this.room_type= room_type;
		this.p_address= p_address;
		this.p_type= p_type;
		this.p_location= p_location;
		this.p_price= p_price;
		this.rented= rented;
		this.dates= dates;
	}
	public property_info(int h_id, String room_type, String p_address, String p_type, Date dates) {
		this.h_id= h_id;
		this.room_type= room_type;
		this.p_address= p_address;
		this.p_type= p_type;
		this.dates= dates;
	}

	
	public int getH_id() {
		return h_id;
	}

	public int getB_id() {
		return b_id;
	}

	public Date getAvailable_date() {
		return available_date;
	}

	public String getRoom_type() {
		return room_type;
	}

	public String getP_address() {
		return p_address;
	}

	public String getP_type() {
		return p_type;
	}

	public String getP_location() {
		return p_location;
	}

	public double getP_price() {
		return p_price;
	}

	public boolean isRented() {
		return rented;
	}

	public Date getDates() {
		return dates;
	}
	
}
