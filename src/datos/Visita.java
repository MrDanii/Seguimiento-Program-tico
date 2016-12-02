package datos;

/**
 *
 * @author Daniel
 */
public final class Visita {
    private int numero_Visita;
    private String  nombre;
    private int unidadVisita;
    private String fechaP;
    private String fechaR;
    private int clave_Grupo; //Clave foránea
    
    public Visita(){}

    public Visita(int numero_Visita, int unidadVisita, String fechaP, String fechaR, int clave_Grupo) {
        this.numero_Visita = numero_Visita;
        this.unidadVisita = unidadVisita;
        this.fechaP = fechaP;
        this.fechaR = fechaR;
        this.clave_Grupo = clave_Grupo;
    }

    public int getNumero_Visita() {
        return numero_Visita;
    }

    public void setNumero_Visita(int numero_Visita) {
        this.numero_Visita = numero_Visita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadVisita() {
        return unidadVisita;
    }

    public void setUnidadVisita(int unidadVisita) {
        this.unidadVisita = unidadVisita;
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
    
}
