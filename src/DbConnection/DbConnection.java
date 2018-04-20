package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private  final static String URL="jdbc:mysql://localhost:3306/personalworkbench?serverTimezone=GMT&userUnicode=true&userUnicode=true&characterEncoding=UTF-8";
	//revised down of that
	private  final static String USER="root";
	private  final static String PASS="sss011317";
	
public static DbConnection  jdbcUtils = new DbConnection();
	
	public static DbConnection getutils(){
		return jdbcUtils;
	}
	//runing driver
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//connection with DataBase
	public  Connection getConnection(){
		try {
			return DriverManager.getConnection(URL,USER,PASS);
		    } catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement ps){
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(Statement st){
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

