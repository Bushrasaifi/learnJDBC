import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/rdecs";
		String user="root";
		String pwd="";
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection(url,user,pwd);
		System.out.println("Connected...");
		
		
	}

}
