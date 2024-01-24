package demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo1 {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hexa","root","root");
			Statement st=conn.createStatement();
//			String st1="update student set name ='sasidhar' where id=1;";
//			int records=st.executeUpdate(st1);
//			System.out.println(records+" records updated");
			String st2="select * from student";
			ResultSet rs=st.executeQuery(st2);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
			}
			//System.out.println(records+" records deleted");
		} catch (ClassNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
