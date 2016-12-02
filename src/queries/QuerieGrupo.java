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
public class QuerieGrupo extends Querie{
    
    private PreparedStatement insertNewGrupo;
    
    public QuerieGrupo(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
            //Conectamos
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);


        // crea un query que inserta datos a la base de datos
        insertNewGrupo = connection.prepareStatement(
            "INSERT INTO Grupo " + 
            "(clave_grupo, periodoFI, periodoFF, horaInicio,"
                    + " horaTermino, unidadesEv, aprobados,"
                    + "reprobados, avance, estudiantesQueFaltan,"
                    + "totalEstudiantes, fechaSeguimiento,"
                    + "clave_materia) " + 
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }//Fin del constructor

    public int añadirGrupo(int clave_grupo,String periodoFI, String periodoFF,
            String horaInicio, String horaTermino, int unidadesEv, int aprobados,
            int reprobados, int avance, int estudiantesQueFaltan, int totalEstudiantes,
            String fechaSeguimiento, int clave_materia){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewGrupo.setString(1,""+ clave_grupo);
            insertNewGrupo.setString(2, periodoFI);
            insertNewGrupo.setString(3, periodoFF);
            insertNewGrupo.setString(4, horaInicio);
            insertNewGrupo.setString(5, horaTermino);
            insertNewGrupo.setInt(6, unidadesEv);
            insertNewGrupo.setInt(7, aprobados);
            insertNewGrupo.setInt(8, reprobados);
            insertNewGrupo.setInt(9, avance);
            insertNewGrupo.setInt(10, estudiantesQueFaltan);
            insertNewGrupo.setInt(11, totalEstudiantes);
            insertNewGrupo.setString(12, fechaSeguimiento);
            insertNewGrupo.setInt(13, clave_materia);

         // insert the new entry; returns # of rows updated
            result = insertNewGrupo.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
}
