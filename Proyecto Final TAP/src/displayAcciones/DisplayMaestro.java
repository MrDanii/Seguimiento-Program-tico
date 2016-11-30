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
public class DisplayMaestro extends JFrame {
    private JButton botonPrevio;
    private JTextField campoPrevio;
    private JLabel etiquetaOf;
    private JTextField campoNext;
    private JButton botonNext;
    private JLabel etiquetaId;
    private JTextField campoId;
    private JLabel etiquetaNombre;
    private JTextField campoNombre;
    private JLabel etiquetaApellidoP;
    private JTextField campoApellidoP;
    private JLabel etiquetaApellidoM;
    private JTextField campoApellidoM;
    private JLabel etiquetaNivel;
    private JTextField campoNivel;
    private JLabel etiquetaBuscar;
    private JTextField campoBuscar;
    private JButton botonBuscar;
    private JButton botonBuscarTodos;
    private JButton botonRegresar;
    private JButton botonRegistrar;
    
    public DisplayMaestro(){
        super("Registrar Profesor");
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        botonPrevio= new JButton("Previo");
        botonPrevio.addActionListener(new HandlerBotonPrevio());
        add(botonPrevio);
        
        campoPrevio= new JTextField(2);
        campoPrevio.addActionListener(new HandlerCampoPrevio());
        add(campoPrevio);
        
        etiquetaOf= new JLabel("of");
        add(etiquetaOf);
        
        campoNext= new JTextField(2);
        campoNext.setEditable(false);
        add(campoNext);
        
        botonNext= new JButton("Siguiente");
        botonNext.addActionListener(new HandlerBotonNext());
        add(botonNext);
        
        etiquetaId= new JLabel("Id Maestro: ");
        add(etiquetaId);
        
        campoId= new JTextField(10);
        add(campoId);
        
        etiquetaNombre= new JLabel("Nombre: ");
        add(etiquetaNombre);
        
        campoNombre= new JTextField(10);  
        add(campoNombre);
        
        etiquetaApellidoP= new JLabel("Apellido Paterno: ");
        add(etiquetaApellidoP);
        
        campoApellidoP= new JTextField(10);
        add(campoApellidoP);
        
        etiquetaApellidoM= new JLabel("Apellido Materno: ");
        add(etiquetaApellidoM);
        
        campoApellidoM= new JTextField(10);
        add(campoApellidoM);
        
        etiquetaNivel= new JLabel("Apellido Materno: ");
        add(etiquetaNivel);
        
        campoNivel= new JTextField(10);
        add(campoNivel);
        
        etiquetaBuscar= new JLabel("Buscar por apellido Paterno:");
        add(etiquetaBuscar);
        
        campoBuscar= new JTextField(10);
        add(campoBuscar);
        
        botonBuscar= new JButton("Buscar");
        botonBuscar.addActionListener(new HandlerBotonBuscar());
        add(botonBuscar);
        
        botonBuscarTodos= new JButton("Buscar Todos");
        botonBuscarTodos.addActionListener(new HandlelBotonBuscarTodos());
        add(botonBuscarTodos);
        
        botonRegresar= new JButton("Regresar");
        botonRegresar.addActionListener(new HandlerBotonRegresar());
        add(botonRegresar);
        
        botonRegistrar= new JButton("Registrar");
        botonRegistrar.addActionListener(new HandlerBotonRegistrar());
        add(botonRegistrar);
    }
    
    private class HandlerBotonPrevio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
    private class HandlerCampoPrevio implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
    private class HandlerBotonNext implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
    private class HandlerBotonBuscar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
    private class HandlelBotonBuscarTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
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
    
    
    
}//Fin de la claseDisplayMaestro
