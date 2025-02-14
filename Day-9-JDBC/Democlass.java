import java.sql.*;

// 1.import -java.sql
// 2.load and register drivers -->com.mysql.jdbc.Driver
// 3.create connection
// 4.create statment
// 5.excute queries
// 6.process resuls
// 7.close()


public class Democlass {
	public static void main(String args[])throws Exception {
		String url="jdbc:mysql://localhost:3306/telusko";
		String uname="root";
		String pass="root";
//		String query="select name from telusko.new_table where id=3";
		String query="select * from telusko.new_table";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String userData="";
		while(rs.next()) {
//			String name=rs.getString(1);
			 userData=rs.getString(1)+": "+rs.getInt(2);
			System.out.println(userData);
			
		}
		
		st.close();
		con.close();
	}

}
