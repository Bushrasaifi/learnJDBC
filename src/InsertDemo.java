import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {
	public static void main(String[] ar) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter registration no");
	int reg=sc.nextInt();
		System.out.println("enter student name");
		String name=sc.next();
		System.out.println("enter mark1");
		int mark1=sc.nextInt();
		System.out.println("enter mark2");
		int mark2=sc.nextInt();
		System.out.println("enter mark3");
		int mark3=sc.nextInt();
		double total=(double) (mark1+mark2+mark3);
		double avg=total/3;
		double per=avg*100;
		String grade = null;
		String result;
		if(per>=90)
		{
			grade="A";
					result="pass";
		}
		else if(per>=70)
		{
			

			grade="B";
					result="pass";
		}else if(per>60) {
			grade="C";
			result="pass";
			
		}else
		{
			result="fail";
		}
		String url="jdbc:mysql://localhost:3306/rdecs";
		String user="root";
		String pwd="";
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection(url,user,pwd);
		PreparedStatement ps=con.prepareStatement("insert into student_result values(?,?,?,?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, reg);
		ps.setInt(3, mark1);
		ps.setInt(4, mark2);
		ps.setInt(5, mark3);
		ps.setDouble(6, total);
		ps.setDouble(7, avg);
		ps.setString(8, result);
		ps.setString(9, grade);
		ps.executeUpdate();
		System.out.println("data entered successfully...");
			
		
		
	}

}
