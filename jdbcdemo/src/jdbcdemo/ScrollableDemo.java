package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","scott");
			
			//scrollable result ResultSet
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery("select * from skills");
			while(rs.next())
            {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
			rs.afterLast();
			System.out.println();
			while(rs.previous())
            {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
			System.out.println("---------display 3rd record------------");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			System.out.println("---------display 2nd record using relative()------------");
			rs.relative(-1);
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			System.out.println("---------display 1st record using first()------------");
			rs.first();
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			
			System.out.println("---------display last record using last()------------");
			rs.last();
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			rs.absolute(3);
			System.out.println("current cursor pos :"+rs.getRow());
			rs.last();
			System.out.println("total number of records "+rs.getRow());
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
