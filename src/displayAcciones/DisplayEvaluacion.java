package displayAcciones;

import datos.Evaluacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import queries.QuerieEvaluacion;

/**
 *
 * @author Daniel
 */
public class DisplayEvaluacion extends JFrame{
        //Para conectar a la base
    private Evaluacion entradaActual;
    private QuerieEvaluacion evaluacionesQueries;
    private List<Evaluacion> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
    private JLabel etiquetaClaveGrupo;
    private JTextField campoClaveGrupo;
    private JLabel etiquetaNumeroE;
    private JTextField campoNumeroE;
    private JLabel etiquetaUnidadE;
    private JTextField campoUnidadE;
    private JLabel etiquetaTiempoP;
    private JTextField campoTiempoP;
    private JLabel etiquetaTiempoR;
    private JTextField campoTiempoR;
    private JLabel etiquetaTipoP;
    private JTextField campoTipoP;
    private JLabel etiquetaTipoR;
    private JTextField campoTipoR;
    private JButton botonRegresar;
    private JButton botonAsignar;
    
    public DisplayEvaluacion(){
        super("Evaluar a u grupo");
        setLayout(null);
        
        //Conectar a base
        evaluacionesQueries= new QuerieEvaluacion();
        
        etiquetaClaveGrupo= new JLabel("Clave del grupo: ");
        etiquetaClaveGrupo.setBounds(10, 10, 140, 25);
        etiquetaClaveGrupo.setToolTipText("Clave del grupo para la evaluación.");
        add(etiquetaClaveGrupo);
        
        campoClaveGrupo= new JTextField();
        campoClaveGrupo.setBounds(160, 10, 140, 25);
        add(campoClaveGrupo);
        
        etiquetaNumeroE= new JLabel("Numero de evaluación:");
        etiquetaNumeroE.setBounds(10, 45, 140, 25);
        add(etiquetaNumeroE);
        
        campoNumeroE= new JTextField();
        campoNumeroE.setBounds(160, 45, 140, 25);
        add(campoNumeroE);
        
        etiquetaUnidadE= new JLabel("Unidad Evaluada:");
        etiquetaUnidadE.setBounds(10, 80, 140, 25);
        add(etiquetaUnidadE);
        
        campoUnidadE= new JTextField();
        campoUnidadE.setBounds(160, 80, 140, 25);
        add(campoUnidadE);
        
        etiquetaTipoP= new JLabel("Tipo evaluación programado:");
        etiquetaTipoP.setBounds(10, 115, 140, 25);
        add(etiquetaTipoP);
        
        campoTipoP= new JTextField();
        campoTipoP.setBounds(160, 115, 140, 25);
        add(campoTipoP);
        
        etiquetaTipoR= new JLabel("Tipo evaluación Real:");
        etiquetaTipoR.setBounds(10, 150, 140, 25);
        add(etiquetaTipoR);
        
        campoTipoR= new JTextField();
        campoTipoR.setBounds(160, 150, 140, 25);
        add(campoTipoR);
        
        botonRegresar= new JButton("Regresar");
        botonRegresar.setBounds(10, 185, 140, 25);
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonAsignar= new JButton("Asignar");
        botonAsignar.setBounds(160, 185, 140, 25);
        botonAsignar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonAsignar(ae);
            }
            
        });
        add(botonAsignar);
        
        addWindowListener(new WindowAdapter(){ //Clase interna anónima
            @Override
            public void windowClosing(WindowEvent we){
                evaluacionesQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
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
    
    private void HandlerBotonAsignar(ActionEvent ae){
        
        int result = evaluacionesQueries.añadirEvaluacion(Integer.parseInt(campoNumeroE.getText()),
                Integer.parseInt(campoUnidadE.getText()), 1,""+2, ""+1, campoTipoP.getText(), 
                campoTipoR.getText(), campoClaveGrupo.getText());
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Unidad añadida!",
            "Unidad añadida", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Unidad no se añadió!",
            "Error", JOptionPane.PLAIN_MESSAGE);
        
    }
}//Fin de la clase DisplayEvaluacion