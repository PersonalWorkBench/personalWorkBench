package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DbConnection.DbConnection;

import Model.UserModel;



public class UserImpl {
	Connection conn = null;
	PreparedStatement ps = null; 
	public int userModel(String account, String pass){
		ArrayList<UserModel> Usermodel = new ArrayList<>();
		UserModel usermodel = new UserModel();
		ResultSet rs=null;
		try {
			conn = DbConnection.getutils().getConnection();
			ps = conn.prepareStatement("select * from User where userID=?");
			ps.setString(1,account);
			rs = ps.executeQuery();
			while(rs.next()) {
			usermodel.setUserCount(rs.getString("userID"));
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
		}return 0;
		
	}
}
