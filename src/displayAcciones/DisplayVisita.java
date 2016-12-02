package displayAcciones;

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
public class DisplayVisita extends JFrame{
    private JLabel etiquetaGrupoClave;
    private JTextField campoGrupoClave; //Clave foránea 
    private JLabel etiquetaNumeroVisita;
    private JTextField campoNumeroVisita;// clave primaria
    private JLabel etiquetaNombreEmpresa;
    private JTextField campoNombreEmpresa;
    private JLabel etiquetaUnidadVisita;
    private JTextField campoUnidadVisita;
    private JLabel etiquetaFechaP;
    private JTextField campoFechaP;
    private JLabel etiquetaFechaR;
    private JTextField campoFechaR;
    private JButton botonRegresar;
    private JButton botonAsignar;
    
    public DisplayVisita(){
        super("Asignar una visita a un grupo");
        setLayout(null);
        
        etiquetaGrupoClave= new JLabel("Clave del grupo: ");
        etiquetaGrupoClave.setBounds(10, 10, 140, 25);
        etiquetaGrupoClave.setToolTipText("Clave del grupo para la visita.");
        add(etiquetaGrupoClave);
        
        campoGrupoClave= new JTextField();
        campoGrupoClave.setBounds(160, 10, 140, 25);
        add(campoGrupoClave);
        
        etiquetaNumeroVisita= new JLabel("Número de Visita:");
        etiquetaNumeroVisita.setBounds(10, 45, 140, 25);
        etiquetaNumeroVisita.setToolTipText("Ingrese el númer de la clase (clave de identificación)");
        add(etiquetaNumeroVisita);
        
        campoNumeroVisita= new JTextField();
        campoNumeroVisita.setBounds(160, 45, 140, 25);
        add(campoNumeroVisita);
        
        etiquetaNombreEmpresa= new JLabel("Nombre de la empresa:");
        etiquetaNombreEmpresa.setBounds(10, 80, 140, 25);
        add(etiquetaNombreEmpresa);
        
        campoNombreEmpresa= new JTextField();
        campoNombreEmpresa.setBounds(160, 80, 140, 25);
        add(campoNombreEmpresa);
        
        etiquetaUnidadVisita= new JLabel("Unidad de la visita:");
        etiquetaUnidadVisita.setBounds(10, 115, 140, 25);
        add(etiquetaUnidadVisita);
        
        campoUnidadVisita= new JTextField();
        campoUnidadVisita.setBounds(160, 115, 140, 25);
        add(campoUnidadVisita);
        
        etiquetaFechaP= new JLabel("Fecha programada: ");
        etiquetaFechaP.setBounds(10, 150, 140, 25);
        add(etiquetaFechaP);
        
        campoFechaP= new JTextField();
        campoFechaP.setBounds(160, 150, 140, 25);
        add(campoFechaP);
        
        etiquetaFechaR= new JLabel("Fecha Real: ");
        etiquetaFechaR.setBounds(10, 185, 140, 25);
        add(etiquetaFechaR);
        
        campoFechaR= new JTextField();
        campoFechaR.setBounds(160, 185, 140, 25);
        add(campoFechaR);
        
        botonRegresar= new JButton("Regresar");
        botonRegresar.setBounds(10, 220, 140, 25);
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonAsignar= new JButton("Asignar");
        botonAsignar.setBounds(160, 220, 140, 25);
        botonAsignar.addActionListener(new HandlerBotonAsignar());
        add(botonAsignar);
        
    }//Fin del constructor
    
    
    private class HandlerBotonRegresar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            dispose();
        }
        
    }
    
    private class HandlerBotonAsignar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
}//Fin de la clase
