package queries;

import datos.Profesor;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Daniel
 */
public class QuerieUnidad extends Querie{
    
    private PreparedStatement insertNewUnidad;
    public QuerieUnidad(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
            //Conectamos
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);


        // crea un query que inserta datos a la base de datos
        insertNewUnidad = connection.prepareStatement(
            "INSERT INTO Unidad " + 
            "(numeroUnidad, nombreUnidad, horasP, horasR, fechaInicioP,"
                    + "fechaTerminoP, fechaInicioR, fechaTerminoR, clave_materia) " + 
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    
    public int añadirUnidad(int numeroUnidad,String nombreUnidad, int horasP,
        int horasR, String fechaInicioP, String fechaTerminoP, 
        String fechaInicioR, String fechaTerminoR, int clave_materia){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewUnidad.setInt(1, numeroUnidad);
            insertNewUnidad.setString(2, nombreUnidad);
            insertNewUnidad.setInt(3, horasP);
            insertNewUnidad.setInt(4, horasR);
            insertNewUnidad.setString(5, fechaInicioP);
            insertNewUnidad.setString(6, fechaTerminoP);
            insertNewUnidad.setString(7, fechaInicioR);
            insertNewUnidad.setString(8, fechaTerminoR);
            insertNewUnidad.setInt(9, clave_materia);
            
         // insert the new entry; returns # of rows updated
         result = insertNewUnidad.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
}
