package jdbcdemo;

import java.sql.*;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con;
        Statement stmt;
        int cnt=0;
        try
        {
        	con=ConnetionUtil.createConnection();
        	String sql="DELETE from candidates where rtrim(last_name)"+"LIKE \'K%g';";
        	String sql1="DELETE from candidates where id=101";
        	stmt=con.createStatement();
        	cnt=stmt.executeUpdate(sql1);
        	if(cnt>0)
        	{
        		System.out.println(cnt+" records deleterd");
        	}
        	else
        	{
        		System.out.println("record not found");
        	}
        	con.close();
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }

	}

}
