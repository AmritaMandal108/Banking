import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
public class SelectTest {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered........");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
	        System.out.println("Connected....."+conn);	
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter starting date");
	   String fromdt=sc.nextLine();
	   System.out.println("Enter end date");
	   String todt=sc.nextLine();
	        
	        Statement statement=conn.createStatement();
	        System.out.println("Statement created.....");
	        ResultSet rs = statement.executeQuery("select * from emp where hiredate between "+"'"+fromdt+"'"+" and "+"'"+todt+"'");
		while(rs.next()) {
			System.out.println("Emp no.        : "+rs.getInt(1));
			System.out.println("Emp Name    : "+rs.getString(2));
			System.out.println("Emp Salry    : "+rs.getInt(6));
			System.out.println("--------------------------------");
			
		}
		rs.close();
		statement.close();
		conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
