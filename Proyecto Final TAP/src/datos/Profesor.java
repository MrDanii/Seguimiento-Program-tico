package datos;

/**
 *
 * @author Daniel
 */
public final class Profesor {
    private int id_Profesor;
    private String nombreProfesor;
    private String apellidoProfesorP;
    private String apellidoProfesorM;
    private String titulo;
    
    public Profesor(){
        
    }//Constructor por defecto
    
    public Profesor(int id_Profesor, String nombre, String apellidoP, String apellidoM,
            String titulo){
        setId_Profesor(id_Profesor);
        setNombreProfesor(nombre);
        setApellidoProfesorP(apellidoP);
        setApellidoProfesorM(apellidoM);
        setTitulo(titulo);
    }

    public int getId_Profesor() {
        return id_Profesor;
    }

    public void setId_Profesor(int id_Profesor) {
        this.id_Profesor = id_Profesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesorP() {
        return apellidoProfesorP;
    }

    public void setApellidoProfesorP(String apellidoProfesorP) {
        this.apellidoProfesorP = apellidoProfesorP;
    }

    public String getApellidoProfesorM() {
        return apellidoProfesorM;
    }

    public void setApellidoProfesorM(String apellidoProfesorM) {
        this.apellidoProfesorM = apellidoProfesorM;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
            
}//Fin dela clase Profesor
