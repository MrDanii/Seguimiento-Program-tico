package datos;

/**
 *
 * @author Daniel
 */
public final class Unidad {
    private String nombreUnidad;
    private int numeroUnidad;
    private double horasP;
    private double horasR;
    private String fechaInicioP;
    private String fechaTerminoP;
    private String fechaInicioR;
    private String fechaTerminoR;
    private int claveMateria; //Clave foránea
    
    public Unidad(){}
    
    public Unidad(int numeroUnidad, String nombreUnidad, 
            double horasP, double horasR, String fechaInicioP, String fechaTerminoP,
            String fechaInicioR, String fechaTerminoR, int claveMateria){
        setNumeroUnidad(numeroUnidad);//Clave principal
        setNombreUnidad(nombreUnidad);
        setHorasP(horasP);
        setHorasR(horasR);
        setFechaInicioP(fechaInicioP);
        setFechaTerminoP(fechaTerminoP);
        setFechaInicioR(fechaInicioR);
        setFechaTerminoR(fechaTerminoR);
        setClaveMateria(claveMateria);
    }


    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public int getNumeroUnidad() {//Clave principal
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public double getHorasP() {
        return horasP;
    }

    public void setHorasP(double horasP) {
        this.horasP = horasP;
    }

    public double getHorasR() {
        return horasR;
    }

    public void setHorasR(double horasR) {
        this.horasR = horasR;
    }

    public String getFechaInicioP() {
        return fechaInicioP;
    }

    public void setFechaInicioP(String fechaInicioP) {
        this.fechaInicioP = fechaInicioP;
    }

    public String getFechaTerminoP() {
        return fechaTerminoP;
    }

    public void setFechaTerminoP(String fechaTerminoP) {
        this.fechaTerminoP = fechaTerminoP;
    }

    public String getFechaInicioR() {
        return fechaInicioR;
    }

    public void setFechaInicioR(String fechaInicioR) {
        this.fechaInicioR = fechaInicioR;
    }

    public String getFechaTerminoR() {
        return fechaTerminoR;
    }

    public void setFechaTerminoR(String fechaTerminoR) {
        this.fechaTerminoR = fechaTerminoR;
    }

    public int getClaveMateria() {
        return claveMateria;
    }

    public void setClaveMateria(int claveMateria) {
        this.claveMateria = claveMateria;
    }
    
    
}//Fin de la clase Unidad
