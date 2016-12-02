package displayAcciones;

import datos.Unidad;
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
import queries.QuerieUnidad;

/**
 *
 * @author Daniel
 */
public class DisplayUnidad extends JFrame{
    //Variables para accesar a la base de datos
    private Unidad entradaActual;
    private QuerieUnidad unidadesQueries;
    private List<Unidad> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
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
        
        //Conectamos a la base
        unidadesQueries= new QuerieUnidad();
        
        etiquetaClaveMateria= new JLabel("Clave de la materia: ");
        etiquetaClaveMateria.setToolTipText("Clave de la materia para la visita.");
        add(etiquetaClaveMateria);
        
        campoClaveMateria= new JTextField(10);
        add(campoClaveMateria);
        
        etiquetaNumeroUnidad= new JLabel("Número de unidad: ");
        add(etiquetaNumeroUnidad);
        
        campoNumeroUnidad= new JTextField(10);
        add(campoNumeroUnidad);
        
        etiquetaNombreUnidad= new JLabel("Nombre de la unidad: ");
        add(etiquetaNombreUnidad);
        
        campoNombreUnidad= new JTextField(10);
        add(campoNombreUnidad);
        
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
        add(etiquetaFechaTerminoP);
        
        campoFechaTerminoP= new JTextField(10);
        add(campoFechaTerminoP);
        
        etiquetaFechaInicioR= new JLabel("Fecha de inicio Real: ");
        add(etiquetaFechaInicioR);
        
        campoFechaInicioR= new JTextField(10);
        add(campoFechaInicioR);
       
        etiquetaFechaTerminoR= new JLabel("Fecha de Término Real: ");
        add(etiquetaFechaTerminoR);
        
        campoFechaTerminoR= new JTextField(10);
        add(campoFechaTerminoR);
        
        botonRegresar= new JButton("Regresar.");
        botonRegresar.addActionListener(new HandlerBotonRegresar());
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
                unidadesQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
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
        int result = unidadesQueries.añadirUnidad(Integer.parseInt(campoNumeroUnidad.getText()),
        campoNombreUnidad.getText(), Integer.parseInt(campoHorasP.getText()),
        Integer.parseInt(campoHorasR.getText()),
        campoFechaInicioP.getText(), campoFechaTerminoP.getText(),
        campoFechaInicioR.getText(), campoFechaTerminoR.getText(),
        Integer.parseInt(campoClaveMateria.getText()));
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Unidad añadida!",
            "Unidad añadida", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Unidad no se añadió!",
            "Error", JOptionPane.PLAIN_MESSAGE);
          
        
    }
}//Fin de la clase DisplayUnidad
