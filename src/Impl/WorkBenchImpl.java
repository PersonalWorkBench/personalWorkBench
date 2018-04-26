package Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DbConnection.DbConnection;
import Model.WorkBenchModel;

public class WorkBenchImpl {
	Connection conn = null;
	PreparedStatement ps = null; 
	
	
	public boolean wokrbenchsignin(WorkBenchModel workbenchmodel) {  // insert workbench table
		WorkBenchModel workbenchmodels = new WorkBenchModel();
		try {
			int workbenchID = 180204;
			ps=conn.prepareStatement("insert into workBench(workBenchName, taxNumber, workBenchIntroduction , workBenchPic,workBenchID) VALUES(?,?,?,?,?)");
			ps.setString(1, workbenchmodels.getWorkBenchName());
			ps.setString(2, workbenchmodels.getTaxNumber());
			ps.setString(3, workbenchmodels.getWorkBenchIntroduction());
			ps.setString(4, workbenchmodels.getWorkBenchPic());
			ps.setInt(5, workbenchID); //«Ý­×§ï
			boolean signin = ps.execute();
			
			if(signin != true) {
				System.out.println("signin workbench unsuss");
				return false;
			}else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbConnection.getutils().close(ps);
			DbConnection.getutils().close(conn);
		}
		
		return true;
	}
	public int workbenchID(String workbenchname) {   // search workbenchID from workbench table  
		ResultSet rs=null;
		int workbenchid =0;
		try {
		conn = DbConnection.getutils().getConnection();
		ps = conn.prepareStatement("select * from workBench where workBenchName=?");
		ps.setString(1,workbenchname);
		rs = ps.executeQuery();
		workbenchid =rs.getInt("workBenchID");
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			DbConnection.getutils().close(rs);
			DbConnection.getutils().close(ps);
			DbConnection.getutils().close(conn);
		}
		return workbenchid;
	}
	public boolean combinedID(int userID , int workBenchID) { // insert combinedID table 
		try {
		ps = conn.prepareStatement("insert into combinedID(userID , workBenchID,authority) VALUES(?,?,'A')"); 
		ps.setInt(1, userID);
		ps.setInt(2, workBenchID);
		boolean combined = ps.execute();
		if(combined != true) {
			System.out.println("combined unsuss");
		}else return true;
		
			
		} catch (Exception e) {
			e.printStackTrace();
			}finally {
			DbConnection.getutils().close(ps);
			DbConnection.getutils().close(conn);
		}
		return true;
	}
	
}
