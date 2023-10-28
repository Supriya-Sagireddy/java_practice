package jdbc.BookStore;
import java.sql.*;
public class JdbcProgram1 {
    public static void main(String[] args) throws SQLException {
        Connection c=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","Suppu@09091999");
        Statement s=c.createStatement();
        s.executeUpdate("create table Students(sno number(3), sname varchar(20)");
        c.close();
    }
}
