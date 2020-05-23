package bo;

public class review_rating_info{
	private String p_address;
	private double rating;
	private String communication;
	private String cleanliness;
	private String value_comment;
	
	public  review_rating_info(String p_address, double rating,String communication,String cleanliness,String value_comment) {
		this.p_address = p_address;
		this.rating = rating;
		this.communication = communication;
		this.cleanliness = cleanliness;
		this.value_comment = value_comment;
		
	}
	public String getAddress() {
		return p_address;
	}
	public double getRating() {
		return rating;
	}
	public String getCommunication() {
		return communication;
	}
	public String getCleanliness() {
		return cleanliness;
	}
	public String getValueComment() {
		return value_comment;
	}
	

}