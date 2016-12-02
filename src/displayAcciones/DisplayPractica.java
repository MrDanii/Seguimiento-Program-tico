package displayAcciones;

import datos.Practica;
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
import queries.QueriePractica;

/**
 *
 * @author Daniel
 */
public class DisplayPractica extends JFrame{
            //Para conectar a la base
    private Practica entradaActual;
    private QueriePractica practicasQueries;
    private List<Practica> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
    private JLabel etiquetaGrupoClave;
    private JTextField campoGrupoClave; //Clave foránea 
    private JLabel etiquetaNumeroPractica;
    private JTextField campoNumeroPractica;  //Clave primaria
    private JLabel etiquetaNombrePractica;
    private JTextField campoNombrePractica;
    private JLabel etiquetaUnidadPractica;
    private JTextField campoUnidadPractica;
    private JLabel etiquetaFechaP;
    private JTextField campoFechaP;
    private JLabel etiquetaFechaR;
    private JTextField campoFechaR;
    private JButton botonRegresar;
    private JButton botonAsignar;
    
    
    public DisplayPractica(){
        super("Asignar una práctica para un grupo");
        setLayout(null);
        
        //Conectar a base
        practicasQueries= new QueriePractica();
        
        
        etiquetaGrupoClave= new JLabel("Clave del grupo: ");
        etiquetaGrupoClave.setBounds(10, 10, 140, 25);
        add(etiquetaGrupoClave);
        
        campoGrupoClave= new JTextField();
        campoGrupoClave.setBounds(160, 10, 140, 25);
        add(campoGrupoClave);
        
        etiquetaNumeroPractica= new JLabel("Número de practica:");
        etiquetaNumeroPractica.setBounds(10, 45, 140, 25);
        add(etiquetaNumeroPractica);
        
        campoNumeroPractica= new JTextField();
        campoNumeroPractica.setBounds(160, 40, 140, 25);
        add(campoNumeroPractica);
        
        etiquetaNombrePractica= new JLabel("Nombre de practica:");
        etiquetaNombrePractica.setBounds(10, 80, 140, 25);
        add(etiquetaNombrePractica);
        
        campoNombrePractica= new JTextField();
        campoNombrePractica.setBounds(160, 80, 140, 25);
        add(campoNombrePractica);
        
        etiquetaUnidadPractica= new JLabel("Unidad de la Practica:");
        etiquetaUnidadPractica.setBounds(10, 115, 140, 25);
        add(etiquetaUnidadPractica);
        
        campoUnidadPractica= new JTextField();
        campoUnidadPractica.setBounds(160, 115, 140, 25);
        add(campoUnidadPractica);
        
        etiquetaFechaP= new JLabel("Fecha programada practica:");
        etiquetaFechaP.setBounds(10, 150, 140, 25);
        add(etiquetaFechaP);
        
        campoFechaP= new JTextField();
        campoFechaP.setBounds(160, 150, 140, 25);
        add(campoFechaP);
        
        etiquetaFechaR= new JLabel("Fecha real practica:");
        etiquetaFechaR.setBounds(10, 185, 140, 25);
        add(etiquetaFechaR);
        
        campoFechaR= new JTextField();
        campoFechaR.setBounds(160, 185, 140, 25);
        add(campoFechaR);
        
        botonRegresar= new JButton("Regresar.");
        botonRegresar.setBounds(10, 220, 140, 25);
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonAsignar= new JButton("Registrar.");
        botonAsignar.setBounds(160, 220, 140, 25);
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
                practicasQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
                //En caso contrario, se dejaría abierta, lo cual deja vulnerable al sistema
                System.exit(0);
            }
        });
    }//Fin del constructor DisplayPractica
    
    private class HandlerBotonRegresar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
        
    }
    
    private void HandlerBotonAsignar(ActionEvent ae){
        int result = practicasQueries.añadirPractica(Integer.parseInt(campoNumeroPractica.getText()),
                campoNombrePractica.getText(),
                Integer.parseInt(campoUnidadPractica.getText()),
                campoFechaP.getText(),
                campoFechaR.getText(),
                Integer.parseInt(campoGrupoClave.getText()));
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Practica asignada!",
            "Practica asignada", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Practica no se asignada!",
            "Error", JOptionPane.PLAIN_MESSAGE);
    }
}//Find el la clase DisplayPractica
