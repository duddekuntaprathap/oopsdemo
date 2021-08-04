package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try
		{
			con=ConnetionUtil.createConnection();
			String str="INSERT INTO skills(name) VALUES('VB,Net')";
			stmt=con.createStatement();
			count=stmt.executeUpdate(str);

		
		if(count>0)
		{
			System.out.println("Records Inserted Successfully");
		}
		
		//count total no.of records in a table
		String str1="SELECT COUNT(id) FROM skills";
		rs=stmt.executeQuery(str1);
		int cnt=0;
		while(rs.next())
		{
			cnt=rs.getInt(1);
		}
		System.out.println("Total no.of records is :"+cnt);
		con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

}
}