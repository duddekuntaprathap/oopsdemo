package jdbcdemo;

import java.sql.*;


public class Employee {

	Connection con;
	PreparedStatement stmt,stmt1;
	Statement st;
	ResultSet res;

	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empmanagement","root","scott");
		return con;
	}

	public void insertEmployee(String name,  String contact , String city) 
	{

		try
		{ 
			stmt=getConnection().prepareStatement("INSERT INTO Employee(EName,ContactNo) VALUES (?,?)");
			stmt.setString(1, name);
			stmt.setString(2, contact);
			stmt.executeUpdate();
			stmt.close();

			stmt=getConnection().prepareStatement("INSERT INTO EmpCity(City) VALUES(?)");
			stmt.setString(1, city);
			int cnt=stmt.executeUpdate();
			if(cnt>0)
			{
				System.out.println("Employee details Saved Succesfully");
				System.out.println();
			}
			else
			{
				System.out.println("Input are invalid");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

	public void getEmployee()
	{
		System.out.println("****** Display Employees*******");
		try
		{
			stmt=getConnection().prepareStatement("select  Employee.Id,EName,City,ContactNo "
					+ "from Employee INNER JOIN EmpCity ON Employee.Id=EmpCity.Id ");
			res=stmt.executeQuery();
			System.out.println("EId\tEName\t\tCity\t\tContactNo");
			System.out.println("--------------------------------------------------");
			while(res.next())
			{
				System.out.println(res.getInt("Id")+"\t"+res.getString("Ename")+
						"\t\t"+res.getString("City")+"\t\t"+res.getString("contactno"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println();
	}

	public void updateEmployee(int id,String city)
	{
		System. out.println("****** Update Employees*******");
		try
		{
			stmt=getConnection().prepareStatement("UPDATE EmpCity SET city=? WHERE Id=?");
			stmt.setString(1, city);
			stmt.setInt(2, id);
			int count=stmt.executeUpdate();
			if(count==1)
			{
				System.out.println("Employee city Updated");
			}
			else
			{
				System.out.println("Employee id is incorrect");
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void deleteEmployee(int cid)
	{
		System. out.println("****** Delete Employees*******");
		try
		{
			stmt=getConnection().prepareStatement("DELETE FROM Employee WHERE Id=?");
			stmt.setInt(1, cid);
			boolean cnt=stmt.execute();
			stmt=getConnection().prepareStatement("DELETE FROM EmpCity WHERE Id=?");
			stmt.setInt(1, cid);
			cnt=stmt.execute();
			if(cnt==false)
			{
				System.out.println("Employee successfully deleted");
			}
			else
			{
				System.out.println("Incorrect id");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	} 
}