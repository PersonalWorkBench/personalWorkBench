package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DbConnection.DbConnection;
import Model.UserModel;

public class AdminImpl {
	
	public ArrayList<UserModel> queryAccount(String account){
		   ArrayList<UserModel> queryaccount = new ArrayList<>();
			Connection conn = null;
			PreparedStatement ps = null; //°e­È
			ResultSet rs=null;
			try {
				conn = DbConnection.getutils().getConnection();
				ps = conn.prepareStatement("select * from user where userID like ?");
				ps.setString(1,"%"+account+"%");
				rs = ps.executeQuery();
				while(rs.next()) {
				UserModel usermodel = new UserModel();
				usermodel.setUserID(rs.getString("UserID"));
				usermodel.setUserPass(rs.getString("userPass"));
				usermodel.setName(rs.getString("name"));
				usermodel.setDate(rs.getString("date"));
				usermodel.setAddress(rs.getString("address"));
				usermodel.setSex(rs.getString("sex"));
				usermodel.setNumber(rs.getString("number"));
				usermodel.setPersonalID(rs.getString("personalID"));
				usermodel.setPersonalPic(rs.getString("personalPic"));
				usermodel.setAuthority(rs.getInt("authority"));
				queryaccount.add(usermodel);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				DbConnection.getutils().close(rs);
				DbConnection.getutils().close(ps);
				DbConnection.getutils().close(conn);
			}
		return queryaccount;	
	}
}
