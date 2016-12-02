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
public class QuerieEvaluacion extends Querie {
    private PreparedStatement insertNewEvaluacion;
    
    public QuerieEvaluacion(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
            //Conectamos
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);


        // crea un query que inserta datos a la base de datos
        insertNewEvaluacion = connection.prepareStatement(
            "INSERT INTO Evaluacion " + 
            "(numeroEvaluacion, unidadEvaluada, semanaEvaluacion, tiempoP,"
                    + " tiempoR, tipoP, tipoR, "
                    + "clave_grupo)" + 
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }//Fin de la construccion
    
    public int añadirEvaluacion(int numeroEvaluacion,int unidadEvaluada, int semanaEvaluacion,
            String tiempoP, String tiempoR, String tipoP, String tipoR, String clave_grupo){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewEvaluacion.setInt(1, numeroEvaluacion);
            insertNewEvaluacion.setInt(2, unidadEvaluada);
            insertNewEvaluacion.setInt(3, semanaEvaluacion);
            insertNewEvaluacion.setString(4, tiempoP);
            insertNewEvaluacion.setString(5, tiempoR);
            insertNewEvaluacion.setString(6, tipoP);
            insertNewEvaluacion.setString(7, tipoR);
            insertNewEvaluacion.setString(8, clave_grupo);

         // insert the new entry; returns # of rows updated
            result = insertNewEvaluacion.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
}
