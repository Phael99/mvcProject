
package Models;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    
    protected Connection conn;
    protected String url, user, passwd;
    
    public DAO(){
        url = "jdbc:mysql://127.0.0.1:3306/med_db";
        user = "root";
        passwd = "19MySQL7705*";
        conn = null;
    }
    
//    public DAO(){
//        url = "jdbc:mysql://localhost:3306/med_db";
//        user = "root";
//        passwd = "123456";
//        conn = null;
//    }
    
    public Connection connect(){
    
        try{
            conn = DriverManager.getConnection(url, user, passwd);
            return conn;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void disconnect(Connection conn){
        try{
        conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
