package jdbcdemo;
import java.sql.*;
public class MySQLConnetionDemo {
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		//Load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating connection getConnection() of DM class
			//create a session b/w 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","scott");

			stmt=con.createStatement();

			//execute a query &store it in ResultSet
			rs=stmt.executeQuery("select * from employees");

			//Traverse ResultSet
			System.out.println("id\tname\temail\t\t\t\tjob");
			System.out.println("----------------------------------------------------------");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(3)+"\t"+rs.getString(5)+"\t"+rs.getString(8));
			}
			/*System.out.println("display specific record from db");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"\t"+rs.getString(3)+"\t"+rs.getString(5)+"\t"+rs.getString(8));*/
			
			con.close();

		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
