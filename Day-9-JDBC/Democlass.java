import java.sql.*;

// 1.import -java.sql
// 2.load and register drivers -->com.mysql.jdbc.Driver
// 3.create connection
// 4.create statment
// 5.excute queries
// 6.process resuls
// 7.close()


//DAO ->Data Access Object
public class Democlass {
	public static void main(String args[])throws Exception {
		String url="jdbc:mysql://localhost:3306/telusko";
		String uname="root";
		String pass="root";
		int id=4;
		String name="raji";
//		String query="select name from telusko.new_table where id=3";
		String query="insert into telusko.new_table values (?,?) ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, name);
		st.setInt(2, id);
		int count =st.executeUpdate();//DDL,DML,DQL
		System.out.println(count+"rows efftected");
		st.close();
		con.close();
	}

}
