package Model;

public class UserModel {
	private int ID , authority;
	private String userID, userPass , name , sex , personalID, number, date, workBenchID, personalPic ,address, others, others1;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPersonalID() {
		return personalID;
	}
	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWorkBenchID() {
		return workBenchID;
	}
	public void setWorkBenchID(String workBenchID) {
		this.workBenchID = workBenchID;
	}
	public String getPersonalPic() {
		return personalPic;
	}
	public void setPersonalPic(String personalPic) {
		this.personalPic = personalPic;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public String getOthers1() {
		return others1;
	}
	public void setOthers1(String others1) {
		this.others1 = others1;
	}
	
}
