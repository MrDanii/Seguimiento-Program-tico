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
public class QueriePractica extends Querie{
    private PreparedStatement insertNewPractica;

    public QueriePractica(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
            //Conectamos
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);


        // crea un query que inserta datos a la base de datos
        insertNewPractica = connection.prepareStatement(
            "INSERT INTO Practica " + 
            "(numeroPractica, nombrePractica, unidadPractica, fechaProgramada,"
                    + " fechaR, clave_grupo)" + 
            "VALUES (?, ?, ?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }//Fin del consstructor
    
    public int añadirPractica(int numeroPractica,String nombrePractica, int unidadPractica,
            String fechaProgramada, String fechaR, int clave_grupo){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewPractica.setInt(1, numeroPractica);
            insertNewPractica.setString(2, nombrePractica);
            insertNewPractica.setInt(3, unidadPractica);
            insertNewPractica.setString(4, fechaProgramada);
            insertNewPractica.setString(5, fechaR);
            insertNewPractica.setInt(6, clave_grupo);

         // insert the new entry; returns # of rows updated
            result = insertNewPractica.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
}
