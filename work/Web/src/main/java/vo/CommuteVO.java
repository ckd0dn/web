package vo;

import java.util.Date;

public class CommuteVO {
	
	private int commute_idx;
	private int emp_idx;
	private Date gtw; //go to work 출근시간
	private Date gow; //get off work 퇴근시간
	private Date c_date; // 날짜
	private int diffhour;
	

	public int getCommute_idx() {
		return commute_idx;
	}
	public void setCommute_idx(int commute_idx) {
		this.commute_idx = commute_idx;
	}
	public int getEmp_idx() {
		return emp_idx;
	}
	public void setEmp_idx(int emp_idx) {
		this.emp_idx = emp_idx;
	}
	public int getDiffhour() {
		return diffhour;
	}
	public void setDiffhour(int diffhour) {
		this.diffhour = diffhour;
	}
	public Date getC_date() {
		return c_date;
	}
	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}
	public Date getGtw() {
		return gtw;
	}
	public void setGtw(Date gtw) {
		this.gtw = gtw;
	}
	public Date getGow() {
		return gow;
	}
	public void setGow(Date gow) {
		this.gow = gow;
	}
	
	
	
}
