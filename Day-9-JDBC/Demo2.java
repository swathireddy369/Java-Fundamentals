
public class Demo2 {
	public static void main(String args[]) {
		Class.forName("pqr");
		Class.forName("com.sql.jdbc.Driver()");
	}

}
class pqr{
	static {
		System.out.print("in static);
	}
	System.out.print("in instance);
}
