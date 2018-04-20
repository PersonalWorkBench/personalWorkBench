package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DbConnection.DbConnection;
import Model.UserModel;



public class UserImpl {
	Connection conn = null;
	PreparedStatement ps = null; 
	public int lognin(String account, String pass){
		UserModel usermodel = new UserModel();
		ResultSet rs=null;
		try {
			conn = DbConnection.getutils().getConnection();
			ps = conn.prepareStatement("select * from User where userID=?");
			ps.setString(1,account);
			rs = ps.executeQuery();
			while(rs.next()) {
				usermodel.setUserID(rs.getString("userID"));
				usermodel.setUserPass(rs.getString("userPass"));
				usermodel.setAuthority(rs.getInt("authority"));
				}
			//return 2 為管理帳號登入 1為正常帳號登入 0為帳號密碼錯誤
			
			if(pass.equals(usermodel.getUserPass())){
				if(usermodel.getAuthority()==1) {
					return 2;
				}else {
					return 1;
				}
			}	
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DbConnection.getutils().close(rs);
			DbConnection.getutils().close(ps);
			DbConnection.getutils().close(conn);
		}return 0;
	}
	public boolean signin(UserModel usermodel) {
		ResultSet rs =null;
		try {
			ps=conn.prepareStatement("INSERT INTO user(userID,userPass,name,address,date,number,personalID,sex,personlPic,authority)VALUES(?,?,?,?,?,?,?,?,?,2);");
			ps.setString(1, usermodel.getUserID());
			ps.setString(2, usermodel.getUserPass());
			ps.setString(3, usermodel.getName());
			ps.setString(4, usermodel.getAddress());
			ps.setString(5, usermodel.getDate());
			ps.setString(6, usermodel.getNumber());
			ps.setString(7, usermodel.getPersonalID());
			ps.setString(8, usermodel.getSex());
			ps.setString(9, usermodel.getPersonalPic());
			boolean signin= ps.execute();
			if(signin != true) {
				System.out.println("註冊帳號於sql失敗");
				System.out.println("討論要不要在這裡設置成功或失敗，或是回傳資料之後");
				return false;
			}else {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbConnection.getutils().close(rs);
			DbConnection.getutils().close(ps);
			DbConnection.getutils().close(conn);
		}return false;		
	}
}
