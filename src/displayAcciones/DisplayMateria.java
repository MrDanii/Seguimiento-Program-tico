package displayAcciones;

import datos.Materia;
import java.awt.FlowLayout;
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
import queries.QuerieMateria;

/**
 * 
 * @author Daniel
 */
public class DisplayMateria extends JFrame{ //Se necesita antes de un
    //Variables para accesar a la base de datos
    private Materia entradaActual;
    private QuerieMateria materiasQueries;
    private List<Materia> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
    private JLabel etiquetaIdProfesor;
    private JTextField campoIdProfesor;
    private JLabel etiquetaClave;
    private JTextField campoClave;
    private JLabel etiquetaMateria;
    private JTextField campoMateria;
    private JLabel etiquetaCarrera;
    private JTextField campoCarrera;
    private JButton botonRegresar;
    private JButton botonRegistrar;
    
    public DisplayMateria(){
        super("Registro de materia, para un maestro");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        //Conectamosa a la base
        materiasQueries= new QuerieMateria();
        
        etiquetaIdProfesor= new JLabel("Id_Profesor: ");
        etiquetaIdProfesor.setToolTipText("Ingrese su clave de profesor.");
        add(etiquetaIdProfesor);
        
        campoIdProfesor= new JTextField(10);
        add(campoIdProfesor);
        
        etiquetaClave= new JLabel("Clave de la materia: ");
        add(etiquetaClave);
        
        campoClave= new JTextField(10);
        add(campoClave);
        
        etiquetaMateria= new JLabel("Nombre de la Materia: ");
        add(etiquetaMateria);
        
        campoMateria= new JTextField(10);
        add(campoMateria);
        
        etiquetaCarrera= new JLabel("Carrera: ");
        add(etiquetaCarrera);
        
        campoCarrera= new JTextField(10);
        add(campoCarrera);
        
        botonRegresar= new JButton("Regresar.");
        botonRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonRegresar(ae);
            }
            
        });
        add(botonRegresar);
        
        botonRegistrar= new JButton("Registrar.");
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
                materiasQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
                //En caso contrario, se dejaría abierta, lo cual deja vulnerable al sistema
                System.exit(0);
            }
        });
    }//Fin del constructor
   
    
    private void HandlerBotonRegresar(ActionEvent ae){
            dispose();
    }
    
    private void HandlerBotonRegistrar(ActionEvent ae){
        int result = materiasQueries.añadirMateria(Integer.parseInt(campoClave.getText()),
        campoMateria.getText(), campoCarrera.getText(),
        Integer.parseInt(campoIdProfesor.getText()));
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Materia añadida añadido!",
            "Materia añadido", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Materia no se añadió!",
            "Error", JOptionPane.PLAIN_MESSAGE);  
    }
}//Fin de la clase DisplayMateria