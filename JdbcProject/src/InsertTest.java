import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered........");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("Connected....." + conn);
			PreparedStatement preparedStatement = conn.prepareStatement("select * from emp where job=?");
			System.out.println("Prepared Statement created : " + preparedStatement);
            
			
			
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
