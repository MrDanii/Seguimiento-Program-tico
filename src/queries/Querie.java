package queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public abstract class Querie {
    protected static final String URL = "jdbc:mysql://localhost/Seguimiento_grupos";
    protected static final String USERNAME = "Admin";
    protected static final String PASSWORD = "Admin1";

    protected Connection connection; // manages connection
    protected static final String dbclassname = "com.mysql.jdbc.Driver";
   
    public void close(){
        try {
            connection.close();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        } 
    }//Fin del método Close

}//Fin de la clase abstracta Querie