package datos;

/**
 *
 * @author Daniel
 */
public final class Practica {
    int numero_Practica;
    private String nombrePractica;
    private int unidad;
    private String fechaP;
    private String fechaR;
    private int clave_Grupo; //cLAVE Foránea
    
    public Practica(){}

    public Practica(int numero_Practica, String nombrePractica, int unidad,
            String fechaP, String fechaR, int clave_Grupo) {
        this.numero_Practica = numero_Practica;
        this.nombrePractica = nombrePractica;
        this.unidad = unidad;
        this.fechaP = fechaP;
        this.fechaR = fechaR;
        this.clave_Grupo = clave_Grupo;
    }

    
    public int getNumero_Practica() {
        return numero_Practica;
    }

    public void setNumero_Practica(int numero_Practica) {
        this.numero_Practica = numero_Practica;
    }

    public String getNombrePractica() {
        return nombrePractica;
    }

    public void setNombrePractica(String nombrePractica) {
        this.nombrePractica = nombrePractica;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    public int getClave_Grupo() {
        return clave_Grupo;
    }

    public void setClave_Grupo(int clave_Grupo) {
        this.clave_Grupo = clave_Grupo;
    }
    
    
}// din de la clase 
