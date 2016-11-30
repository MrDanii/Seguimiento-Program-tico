package datos;

/**
 *
 * @author Daniel
 */
public final class Materia {
    private int clave;
    private String nombreMateria;
    private String nombreCarrera;
    private int id_Profesor; //Clave foránea
    
    public Materia(){}//Contructor por defecto
    
    public Materia(int clave, String nombreMateria,String nombreCarrera, int id_Profesor){
        setClave(clave);
        setNombreMateria(nombreMateria);
        setnombreCarrera(nombreCarrera);
        setId_Profesor(id_Profesor);
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setnombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getId_Profesor() {
        return id_Profesor;
    }

    public void setId_Profesor(int id_Profesor) {
        this.id_Profesor = id_Profesor;
    }
    
}
