
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    
    static Connection connection;
    static String dbName = "airlineticketing";
    static String dbUser = "root";
    static String dbPass = "";
    
    public static Connection connectToDB(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+ 
                    dbName, dbUser, dbPass);
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        return connection;
    }
    
}

    

