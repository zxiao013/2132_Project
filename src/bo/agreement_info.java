package bo;

import java.sql.Date;

public class agreement_info {
	
	private int g_id;
	private int h_id;
	private Date signingDate;
	private Date startDate;
	private Date endDate;
	
	public agreement_info(int g_id, int h_id, Date signingDate, Date startDate, Date endDate) {
		this.g_id= g_id;
		this.h_id= h_id;
		this.signingDate= signingDate;
		this.startDate= startDate;
		this.endDate= endDate;
	}
	
	public int getH_id() {
		return h_id;
	}
	
	public int getG_id() {
		return g_id;
	}
	
	public Date getSigningDate() {
		return signingDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
}
