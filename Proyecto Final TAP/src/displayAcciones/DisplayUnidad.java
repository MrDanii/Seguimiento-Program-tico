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
public class DisplayUnidad extends JFrame{
    private JLabel etiquetaClaveMateria;
    private JTextField campoClaveMateria;
    private JLabel etiquetaNumeroUnidad; //Clave principal
    private JTextField campoNumeroUnidad;
    private JLabel etiquetaNombreUnidad;
    private JTextField campoNombreUnidad;
    private JLabel etiquetaHorasP;
    private JTextField campoHorasP;
    private JLabel etiquetaHorasR;
    private JTextField campoHorasR;
    private JLabel etiquetaFechaInicioP;
    private JTextField campoFechaInicioP;
    private JLabel etiquetaFechaTerminoP;
    private JTextField campoFechaTerminoP;
    private JLabel etiquetaFechaInicioR;
    private JTextField campoFechaInicioR;
    private JLabel etiquetaFechaTerminoR;
    private JTextField campoFechaTerminoR;
    private JButton botonRegresar;
    private JButton botonRegistrar;
    
    public DisplayUnidad(){
        super("Asignar Unidad, para una materia");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        etiquetaClaveMateria= new JLabel("Clave de la materia: ");
        etiquetaClaveMateria.setToolTipText("Ingrese la clave de la materia");//Clave foránea
        add(etiquetaClaveMateria);
        
        campoClaveMateria= new JTextField(10);
        campoClaveMateria.setToolTipText("Ingrese la clave de la materia");
        add(campoClaveMateria);
        
        etiquetaNumeroUnidad= new JLabel("Número de unidad: ");
        add(etiquetaNumeroUnidad);
        
        campoNumeroUnidad= new JTextField(10);
        add(campoNumeroUnidad);
        
        etiquetaNombreUnidad= new JLabel("Nombre de la unidad: ");
        add(etiquetaNombreUnidad);
        
        campoNombreUnidad= new JTextField(10);
        add(etiquetaNombreUnidad);
        
        etiquetaHorasP= new JLabel("Horas programadas:");
        add(etiquetaHorasP);
        
        campoHorasP= new JTextField(10);
        add(campoHorasP);
        
        etiquetaHorasR= new JLabel("Horas Reales:");
        add(etiquetaHorasR);
        
        campoHorasR= new JTextField(10);
        add(campoHorasR);
        
        etiquetaFechaInicioP= new JLabel("Fecha de inicio Programado: ");
        add(etiquetaFechaInicioP);
        
        campoFechaInicioP= new JTextField(10);
        add(campoFechaInicioP);
        
        etiquetaFechaTerminoP= new JLabel("Fecha de término Programado: ");
        add(etiquetaFechaInicioP);
        
        campoFechaTerminoP= new JTextField(10);
        add(campoFechaTerminoP);
        
        etiquetaFechaInicioR= new JLabel("Fecha de inicio Real: ");
        add(etiquetaFechaInicioP);
        
        campoFechaInicioR= new JTextField(10);
        add(campoFechaInicioP);
       
        etiquetaFechaTerminoR= new JLabel("Fecha de Término Real: ");
        add(etiquetaFechaTerminoP);
        
        campoFechaTerminoR= new JTextField(10);
        add(campoFechaTerminoP);
        
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
}//Fin de la clase DisplayUnidad
