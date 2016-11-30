package datos;

/**
 *
 * @author Daniel
 */
public final class Grupo {
    private String clave_Grupo;
    private String periodoMesI; 
    private String periodoMesF; //Para poder tomar los dos meses al crear el PDF
    private String horaInicio; //Para formar el horario
    private String horaTermino;
    private int unidadesEvaluadas;
    private int aprobados;
    private int reprobados;
    private int avance;//En porcentaje
    private int estudiantesFaltantes; //Los estudantes que no van
    private int totalEstudiantes;
    private int clave_Materia; //Clave foránea
    
    public Grupo(){}
    
    public Grupo(String clave_Grupo, String periodoMesI, String periodoMesF,
            String horaInicio, String horaTermino,
            int unidadesEvaluadas, int aprobados,int reprobados, int avance,
            int estudiantesFaltantes,int totalEstudiantes, int clave_Materia){
        
        setClave_Grupo(clave_Grupo);
        setPeriodoMesI(periodoMesI);
        setPeriodoMesF(periodoMesF);
        setHoraInicio(horaInicio);
        setHoraTermino(horaTermino);
        setUnidadesEvaluadas(unidadesEvaluadas);
        setAprobados(aprobados);
        setReprobados(reprobados);
        setAvance(avance);
        setEstudiantesFaltantes(estudiantesFaltantes);
        setTotalEstudiantes(totalEstudiantes);
        setClave_Materia(clave_Materia);
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    
    public String getClave_Grupo() {
        return clave_Grupo;
    }

    public void setClave_Grupo(String clave_Grupo) {
        this.clave_Grupo = clave_Grupo;
    }

    public String getPeriodoMesI() {
        return periodoMesI;
    }

    public void setPeriodoMesI(String periodoMesI) {
        this.periodoMesI = periodoMesI;
    }

    public String getPeriodoMesF() {
        return periodoMesF;
    }

    public void setPeriodoMesF(String periodoMesF) {
        this.periodoMesF = periodoMesF;
    }

    public int getUnidadesEvaluadas() {
        return unidadesEvaluadas;
    }

    public void setUnidadesEvaluadas(int unidadesEvaluadas) {
        this.unidadesEvaluadas = unidadesEvaluadas;
    }

    public int getAprobados() {
        return aprobados;
    }

    public void setAprobados(int aprobados) {
        this.aprobados = aprobados;
    }

    public int getReprobados() {
        return reprobados;
    }

    public void setReprobados(int reprobados) {
        this.reprobados = reprobados;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public int getEstudiantesFaltantes() {
        return estudiantesFaltantes;
    }

    public void setEstudiantesFaltantes(int estudiantesFaltantes) {
        this.estudiantesFaltantes = estudiantesFaltantes;
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void setTotalEstudiantes(int totalEstudiantes) {
        this.totalEstudiantes = totalEstudiantes;
    }

    public int getClave_Materia() {
        return clave_Materia;
    }

    public void setClave_Materia(int clave_Materia) {
        this.clave_Materia = clave_Materia;
    }
    
    
}//Fin de la clase Grupo
 
