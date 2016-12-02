package displayAcciones;

import datos.Profesor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import queries.QuerieMaestro;

/**
 *
 * @author Daniel
 */
public class DisplayMaestro extends JFrame {
    //*************Para el Querie de Maestro
    private Profesor entradaActual;
    private QuerieMaestro maestrosQueries;
    private List<Profesor> resultados;
    private int numeroEntradas;
    private int currentEntryIndex; //El indice de entrada
    
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
        
        //********Establecemos la conexión a la base de datos
        maestrosQueries= new QuerieMaestro();
        //********
        
        botonPrevio= new JButton("Previo");
        botonPrevio.setEnabled(false);
        botonPrevio.addActionListener(new ActionListener(){ //Anonimous Inner Class
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonPrevio(ae); //Ejecuta el evento por medio de un metodo privado con el evento
            }
        });
        add(botonPrevio);
        
        campoPrevio= new JTextField(2);
        campoPrevio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerCampoPrevio(ae);
            }
            
        });
        add(campoPrevio);
        
        etiquetaOf= new JLabel("of");
        add(etiquetaOf);
        
        campoNext= new JTextField(2);
        campoNext.setEnabled(false);
        campoNext.setEditable(false);
        add(campoNext);
        
        botonNext= new JButton("Siguiente");
        botonNext.setEnabled(false);
        botonNext.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonNext(ae);
            }
            
        });
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
        
        etiquetaNivel= new JLabel("Titulo/Nivel: ");
        add(etiquetaNivel);
        
        campoNivel= new JTextField(10);
        add(campoNivel);
        
        etiquetaBuscar= new JLabel("Buscar por apellido Paterno:");
        add(etiquetaBuscar);
        
        campoBuscar= new JTextField(10);
        add(campoBuscar);
        
        botonBuscar= new JButton("Buscar");
        botonBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonBuscar(ae);
            }
            
        });
        add(botonBuscar);
        
        botonBuscarTodos= new JButton("Buscar Todos");
        botonBuscarTodos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlelBotonBuscarTodos(ae);
            }
            
        });
        add(botonBuscarTodos);
        
        botonRegresar= new JButton("Regresar");
        botonRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                HandlerBotonRegresar(ae);
            }
            
        });
        add(botonRegresar);
        
        botonRegistrar= new JButton("Registrar");
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
                maestrosQueries.close(); //Eso se hace porque tenemos que cerrar la conexión
                //En caso contrario, se dejaría abierta, lo cual deja vulnerable al sistema
                System.exit(0);
            }
        });
    }//Fin del constructor
    
    
    //Los eventos serán manejados por métodos y no por clases internas, para poder utilizarlos
    private void HandlerBotonPrevio(ActionEvent ae){
        currentEntryIndex--;
      
        if (currentEntryIndex < 0)
            currentEntryIndex = numeroEntradas - 1;
      
        campoPrevio.setText("" + (currentEntryIndex + 1));
        HandlerCampoPrevio(ae);  
        
    }
    //Cuando el usuario le da enter al campo de texto junto a previo, se realizará una búsquea (si existe)
    private void HandlerCampoPrevio(ActionEvent ae){ 
        currentEntryIndex = 
        (Integer.parseInt(campoPrevio.getText()) - 1);
      
        if (numeroEntradas != 0 && currentEntryIndex < numeroEntradas){
            entradaActual = resultados.get(currentEntryIndex);
            campoId.setText("" + entradaActual.getId_Profesor());
            campoNombre.setText(entradaActual.getNombreProfesor());
            campoApellidoP.setText(entradaActual.getApellidoProfesorP());
            campoApellidoM.setText(entradaActual.getApellidoProfesorP());
            campoNivel.setText(entradaActual.getTitulo());
            campoNext.setText("" + numeroEntradas);
            campoPrevio.setText("" + (currentEntryIndex + 1));
        } 
    }
    
    private void HandlerBotonNext(ActionEvent ae){
        currentEntryIndex++;

        if (currentEntryIndex >= numeroEntradas)
         currentEntryIndex = 0;

        campoPrevio.setText("" + (currentEntryIndex + 1));
        HandlerCampoPrevio(ae);
        
        
    }
    
    private void HandlerBotonBuscar(ActionEvent ae){
        resultados = 
        maestrosQueries.getMasterByApellidoP(campoBuscar.getText());
        numeroEntradas = resultados.size();
      
        if (numeroEntradas != 0){
            currentEntryIndex = 0;
            entradaActual = resultados.get(currentEntryIndex);
            campoId.setText("" + entradaActual.getId_Profesor());
            campoNombre.setText(entradaActual.getNombreProfesor());
            campoApellidoP.setText(entradaActual.getApellidoProfesorP());
            campoApellidoM.setText(entradaActual.getApellidoProfesorM());
            campoNivel.setText(entradaActual.getTitulo());
            campoNext.setText("" + numeroEntradas);
            campoPrevio.setText("" + (currentEntryIndex + 1));
            botonNext.setEnabled(true);
            botonPrevio.setEnabled(true);
        }else
            HandlelBotonBuscarTodos(ae);
        
    }
    
    private void HandlelBotonBuscarTodos(ActionEvent ae){
        try{
            resultados = maestrosQueries.getAllMaestros();
            numeroEntradas = resultados.size();
      
            if (numeroEntradas != 0){
                currentEntryIndex = 0;
                entradaActual = resultados.get(currentEntryIndex);
                campoId.setText("" + entradaActual.getId_Profesor());
                campoNombre.setText(entradaActual.getNombreProfesor());
                campoApellidoP.setText(entradaActual.getApellidoProfesorP());
                campoApellidoM.setText(entradaActual.getApellidoProfesorM());
                campoNivel.setText(entradaActual.getTitulo());
                campoNext.setText("" + numeroEntradas);
                campoPrevio.setText("" + (currentEntryIndex + 1));
                botonNext.setEnabled(true);
                botonPrevio.setEnabled(true);
            } 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void HandlerBotonRegresar(ActionEvent ae){
        dispose();
    }
    
    private void HandlerBotonRegistrar(ActionEvent ae){
        int result = maestrosQueries.añadirMaestro(Integer.parseInt(campoId.getText()),
        campoNombre.getText(), campoApellidoP.getText(),
        campoApellidoM.getText(), campoNivel.getText());
      
        if (result == 1)
            JOptionPane.showMessageDialog(this, "Maestro añadido!",
            "Maestro añadido", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Maestro no se añadió!",
            "Error", JOptionPane.PLAIN_MESSAGE);
          
        HandlelBotonBuscarTodos(ae);
        
    }
    
    
    
}//Fin de la claseDisplayMaestro
