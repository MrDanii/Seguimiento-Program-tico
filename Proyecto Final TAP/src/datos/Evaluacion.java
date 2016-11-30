package datos;

/**
 *
 * @author Daniel
 */
public final class Evaluacion {
    private int numEvaluacion; //Clave primaria
    private int semanaEvaluacion; //Son 16 semanas de curso
    private int unidadEvaluada;
    private double tiempoProgramado; //En horas
    private double tiempoReal; //En horas
    private String tipoProgramado;
    private String tipoReal;
    private int clave_grupo;
    
    public Evaluacion(){}

    public Evaluacion(int numEvaluacion, int semanaEvaluacion, int unidadEvaluada, double tiempoProgramado, double tiempoReal, String tipoProgramado, String tipoReal, int clave_grupo) {
        this.numEvaluacion = numEvaluacion;
        this.semanaEvaluacion = semanaEvaluacion;
        this.unidadEvaluada = unidadEvaluada;
        this.tiempoProgramado = tiempoProgramado;
        this.tiempoReal = tiempoReal;
        this.tipoProgramado = tipoProgramado;
        this.tipoReal = tipoReal;
        this.clave_grupo = clave_grupo;
    }

    public int getNumEvaluacion() {
        return numEvaluacion;
    }

    public void setNumEvaluacion(int numEvaluacion) {
        this.numEvaluacion = numEvaluacion;
    }

    public int getSemanaEvaluacion() {
        return semanaEvaluacion;
    }

    public void setSemanaEvaluacion(int semanaEvaluacion) {
        this.semanaEvaluacion = semanaEvaluacion;
    }

    public int getUnidadEvaluada() {
        return unidadEvaluada;
    }

    public void setUnidadEvaluada(int unidadEvaluada) {
        this.unidadEvaluada = unidadEvaluada;
    }

    public double getTiempoProgramado() {
        return tiempoProgramado;
    }

    public void setTiempoProgramado(double tiempoProgramado) {
        this.tiempoProgramado = tiempoProgramado;
    }

    public double getTiempoReal() {
        return tiempoReal;
    }

    public void setTiempoReal(double tiempoReal) {
        this.tiempoReal = tiempoReal;
    }

    public String getTipoProgramado() {
        return tipoProgramado;
    }

    public void setTipoProgramado(String tipoProgramado) {
        this.tipoProgramado = tipoProgramado;
    }

    public String getTipoReal() {
        return tipoReal;
    }

    public void setTipoReal(String tipoReal) {
        this.tipoReal = tipoReal;
    }

    public int getClave_grupo() {
        return clave_grupo;
    }

    public void setClave_grupo(int clave_grupo) {
        this.clave_grupo = clave_grupo;
    }
    
    
    
}
