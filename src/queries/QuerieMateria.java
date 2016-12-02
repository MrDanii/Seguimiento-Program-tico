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
public class QuerieMateria extends Querie{
    
    private PreparedStatement insertNewMateria;
    
    public QuerieMateria(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
            //Conectamos
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);


        // crea un query que inserta datos a la base de datos
        insertNewMateria = connection.prepareStatement(
            "INSERT INTO Materia " + 
            "(clave_materia, nombre_materia, nombre_carrera, id_Profesor) " + 
            "VALUES (?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }//Fin constructor
    
    public int añadirMateria(int clave_materia,String nombre_materia, String nombre_carrera,
        int id_Profesor){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewMateria.setInt(1, clave_materia);
            insertNewMateria.setString(2, nombre_materia);
            insertNewMateria.setString(3, nombre_carrera);
            insertNewMateria.setInt(4, id_Profesor);

         // insert the new entry; returns # of rows updated
         result = insertNewMateria.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
}
