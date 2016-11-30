package displayAcciones;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Daniel
 */
public class DisplayMateria extends JFrame{ //Se necesita antes de un
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
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonRegistrar= new JButton("Registrar.");
        botonRegistrar.addActionListener(new HandlerBotonRegistrar());
        add(botonRegistrar);
        
        
    }//Fin del constructor
   
    
    private class HandlerBotonRegresar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
        
    }
    
    private class HandlerBotonRegistrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
}//Fin de la clase DisplayMateria