import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sumit Singh
 */

//Creating Database Connection File
public class databaseConnection {
    
    //C:\Program Files\Java\jdk1.8.0_152\jre\lib\ext
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    //final static String DB_URL = "jdbc:mysql://localhost/student"; or
    
   /* //This will disable SSL and also suppress the SSL errors.
    final static String DB_URL = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
                                or  */
    
   // How about using SSL but turning off server verification (such as when in development mode on your own computer):
    final static String DB_URL = "jdbc:mysql://localhost:3306/student?verifyServerCertificate=false&useSSL=true";
    
    final static String USER = "root";
    final static String PASS = "s311216n";
    
    public static Connection connection(){
        
        try{
            //For Driver Registration
            Class.forName(JDBC_DRIVER);
            //For Driver Connection
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //Returning the Connection
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
