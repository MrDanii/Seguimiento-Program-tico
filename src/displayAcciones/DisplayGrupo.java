package displayAcciones;


import datos.Grupo;
import datos.Unidad;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import queries.QuerieGrupo;

/**
 *
 * @author Daniel
 */
public class DisplayGrupo extends JFrame{
    //Para conectar a la base
    private Grupo entradaActual;
    private QuerieGrupo gruposQueries;
    private List<Grupo> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
    private JLabel etiquetaClaveMateria;
    private JTextField campoClaveMateria;
    private JLabel etiquetaClave;
    private JTextField campoClave;
    private JLabel etiquetaPeriodo; //dependiendo del combo se le dará vaor a dos cadenas
    private JComboBox comboPeriodo;
    String[] periodo={"Agosto-Diciembre", "Enero-Julio"};
    private JLabel etiquetaUnidadesE;
    private JTextField campoUnidadesE;
    private JLabel etiquetaAprobados;
    private JTextField campoAprobados;
    private JLabel etiquetaReprobados;
    private JTextField campoReprobados;
    private JLabel etiquetaAvance;
    private JTextField campoAvance;
    private JLabel etiquetaEstudiantesF;
    private JTextField campoEstudiantesF;
    private JLabel etiquetaTotalE;
    private JTextField campoTotalE;
    private JLabel etiquetaFechaS;
    private JTextField campoFechaS;
    private JButton botonRegresar;
    private JButton botonRegistrar;
    
    
    public DisplayGrupo(){
        super("Asignar Unidad, para una materia");
        setLayout(null);
        
        //Conectamos a la base
        gruposQueries= new QuerieGrupo();
        
        etiquetaClaveMateria= new JLabel("Clave de la materia: ");
        etiquetaClaveMateria.setToolTipText("Ingrese la clave de la materia");//Clave foránea
        etiquetaClaveMateria.setBounds(10, 10, 140, 25);
        add(etiquetaClaveMateria);
        
        campoClaveMateria= new JTextField();
        campoClaveMateria.setToolTipText("Ingrese la clave de la materia");
        campoClaveMateria.setBounds(160, 10, 140, 25);
        add(campoClaveMateria);
        
        etiquetaClave= new JLabel("Clave del grupo: ");
        etiquetaClave.setBounds(10, 45, 140, 25);
        add(etiquetaClave);
        
        campoClave= new JTextField();
        campoClave.setBounds(160, 45, 140, 25);
        add(campoClave);
        
        etiquetaPeriodo= new JLabel("Periodo");
        etiquetaPeriodo.setBounds(10, 80, 140, 25);
        add(etiquetaPeriodo);
        
        comboPeriodo= new JComboBox();
        comboPeriodo.setBounds(160, 80, 140, 25);
        comboPeriodo.addItem(periodo[0]); //Le añadimos los items al combo
        comboPeriodo.addItem(periodo[1]); //Le añadimos los items al combo
        add(comboPeriodo);
        
        etiquetaUnidadesE= new JLabel("Unidades Evaluadas:");
        etiquetaUnidadesE.setBounds(10, 115, 140, 25);
        add(etiquetaUnidadesE);
        
        campoUnidadesE= new JTextField();
        campoUnidadesE.setBounds(160, 115, 140, 25);
        add(campoUnidadesE);
        
        etiquetaAprobados= new JLabel("Aprobados: ");
        etiquetaAprobados.setBounds(10, 150, 140, 25);
        add(etiquetaAprobados);
        
        campoAprobados= new JTextField();
        campoAprobados.setBounds(160, 150, 140, 25);
        add(campoAprobados);
        
        etiquetaReprobados= new JLabel("Reprobaados: ");
        etiquetaReprobados.setBounds(10, 180, 140, 25);
        add(etiquetaReprobados);
        
        campoReprobados= new JTextField();
        campoReprobados.setBounds(160, 180, 140, 25);
        add(campoReprobados);
        
        etiquetaAvance= new JLabel("Avance ");
        etiquetaAvance.setToolTipText("ingrese un número del 0-100 para el porcentaje");
        etiquetaAvance.setBounds(10, 215, 140, 25);
        add(etiquetaAvance);
        
        campoAvance= new JTextField();
        campoAvance.setBounds(160, 215, 140, 25);
        add(campoAvance);
        
        etiquetaEstudiantesF= new JLabel("Estudiantes Faltantes:");
        etiquetaEstudiantesF.setToolTipText("El número de los estudiantes que no asisten a la clase.");
        etiquetaEstudiantesF.setBounds(10, 250, 140, 25);
        add(etiquetaEstudiantesF);
        
        campoEstudiantesF= new JTextField();
        campoEstudiantesF.setBounds(160, 250, 140, 25);
        add(campoEstudiantesF);
        
        etiquetaTotalE= new JLabel("Total de estudiantes:");
        etiquetaTotalE.setBounds(10, 285, 140, 25);
        add(etiquetaTotalE);
        
        campoTotalE= new JTextField();
        campoTotalE.setBounds(160, 285, 140, 25);
        add(campoTotalE);
        
        etiquetaFechaS= new JLabel("Fecha de seguimiento");
        etiquetaFechaS.setToolTipText("Escriba la fecha del seguimiento de este registro");
        etiquetaFechaS.setBounds(10, 320, 140, 25);
        add(etiquetaFechaS);
        
        campoFechaS= new JTextField();
        campoFechaS.setToolTipText("");
        campoFechaS.setBounds(160, 320, 140, 25);
        add(campoFechaS);
        
        botonRegresar= new JButton("Regresar.");
        botonRegresar.setBounds(10, 355, 140, 25);
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonRegistrar= new JButton("Registrar.");
        botonRegistrar.setBounds(160, 355, 140, 25);
        botonRegistrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonRegistrar(ae);
            }
            
        });
        add(botonRegistrar);
        
        addWindowListener(new WindowAdapter(){ //Clase interna anónima
            @Override
            public void windowClosing(WindowEvent we){
                gruposQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
                //En caso contrario, se dejaría abierta, lo cual deja vulnerable al sistema
                System.exit(0);
            }
        });
    
    }//Fin del constructor
    
    private class HandlerBotonRegresar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
        
    }
    
    private void HandlerBotonRegistrar(ActionEvent ae){
        String periodoI, periodoF;
        if(comboPeriodo.getSelectedIndex()== 0){
            periodoI= "Agosto";
            periodoF= "Diciembre";
        }else{
            periodoI= "Enero";
            periodoF= "Julio";
        }
        
        
        int result = gruposQueries.añadirGrupo(Integer.parseInt(campoClave.getText()),
        periodoI, periodoF,
        "00:00", "00:00", Integer.parseInt(campoUnidadesE.getText()),
        Integer.parseInt(campoAprobados.getText()), 
        Integer.parseInt(campoReprobados.getText()),
        Integer.parseInt(campoAvance.getText()),
        Integer.parseInt(campoEstudiantesF.getText()),
        Integer.parseInt(campoTotalE.getText()),
        campoFechaS.getText(),
        Integer.parseInt(campoClaveMateria.getText()));
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Unidad añadida!",
            "Unidad añadida", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Unidad no se añadió!",
            "Error", JOptionPane.PLAIN_MESSAGE);
        

        
    }
}//Fin de la claseDisplayGrupo
