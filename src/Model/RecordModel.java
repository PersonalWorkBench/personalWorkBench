package Model;

public class RecordModel {
	private int ID,counting;
	private String userID,IP,status,loginTimed,workBenchAlter,other,other1;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCounting() {
		return counting;
	}
	public void setCounting(int counting) {
		this.counting = counting;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLoginTimed() {
		return loginTimed;
	}
	public void setLoginTimed(String loginTimed) {
		this.loginTimed = loginTimed;
	}
	public String getWorkBenchAlter() {
		return workBenchAlter;
	}
	public void setWorkBenchAlter(String workBenchAlter) {
		this.workBenchAlter = workBenchAlter;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getOther1() {
		return other1;
	}
	public void setOther1(String other1) {
		this.other1 = other1;
	}
	
}
