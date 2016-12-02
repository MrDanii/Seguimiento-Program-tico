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
public class QuerieMaestro extends Querie{
    private PreparedStatement selectAllMasters; 
    private PreparedStatement selectMasterByApellidoP; 
    private PreparedStatement insertNewMaster;
    
    public QuerieMaestro(){
        try{
            Class.forName(dbclassname);
        }catch(Exception e){}
        
        try {	
        connection = 
        DriverManager.getConnection(URL, USERNAME, PASSWORD);
        // crea un query que selecciona todas las entradas de Maestro
        selectAllMasters= 
        connection.prepareStatement("SELECT * FROM Profesor");
         
        // crea un queru que selecciona a todos los maestros por apellido Paterno
        selectMasterByApellidoP = connection.prepareStatement(
            "SELECT * FROM Profesor WHERE apellidoP = ?");

        // crea un query que inserta datos a la base de datos
        insertNewMaster = connection.prepareStatement(
            "INSERT INTO Profesor " + 
            "(id_profesor, nombre_maestro, apellidoP, apellidoM, titulo) " + 
            "VALUES (?, ?, ?, ?, ?)");
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();
            System.exit(1);
        }
    }//Fin del constructor
    
    public List<Profesor> getAllMaestros(){
        List< Profesor > results = null;
      ResultSet resultSet = null;
      
      try 
      {
         // executeQuery returns ResultSet containing matching entries
         resultSet = selectAllMasters.executeQuery(); 
         results = new ArrayList< Profesor >();
         
         while (resultSet.next())
         {
            results.add(new Profesor(
               resultSet.getInt("id_profesor"),
               resultSet.getString("nombre_maestro"),
               resultSet.getString("apellidoP"),
               resultSet.getString("apellidoM"),
               resultSet.getString("titulo")));
         } 
      } 
      catch (SQLException sqlException)
      {
         sqlException.printStackTrace();         
      } 
      finally
      {
        try{
            resultSet.close();
        } 
        catch (SQLException sqlException){
            sqlException.printStackTrace();         
            close();
            }
        }
      
        return results;
    }//Fin del metodo getAllMaestros
    
    public List<Profesor> getMasterByApellidoP(String apellidoP){
        List< Profesor > results = null;
        ResultSet resultSet = null;

        try {
        selectMasterByApellidoP.setString(1, apellidoP); // specify last name

         // executeQuery returns ResultSet containing matching entries
        resultSet = selectMasterByApellidoP.executeQuery(); 

        results = new ArrayList< Profesor >();

            while (resultSet.next()){
                results.add(new Profesor(resultSet.getInt("id_profesor"),
                resultSet.getString("nombre_maestro"),
                resultSet.getString("apellidoP"),
                resultSet.getString("apellidoM"),
                resultSet.getString("titulo")));
            } 
        } 
        catch (SQLException sqlException){
            sqlException.printStackTrace();
        } 
        finally //Es algo que se ejecuto pase o no pase un error
        {
        try{
            resultSet.close();
        }
        catch (SQLException sqlException){
            sqlException.printStackTrace();         
            close();
            }
        } 
      
      return results;
    }//Fin del metodo getMasterByApellidoP
    
    public int añadirMaestro(int id_profesor,String nombre_maestro, String apellidoP,
        String apellidoM, String titulo){
        int result = 0;
      
      // set parameters, then execute insertNewPerson
        try {
            insertNewMaster.setInt(1, id_profesor);
            insertNewMaster.setString(2, nombre_maestro);
            insertNewMaster.setString(3, apellidoP);
            insertNewMaster.setString(4, apellidoM);
            insertNewMaster.setString(5, titulo);

         // insert the new entry; returns # of rows updated
         result = insertNewMaster.executeUpdate(); 
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
            close();
        } 
        return result;
    }//Fin del método anñadirMaestro
    
}//Fin de la la clase QuerieMaestro