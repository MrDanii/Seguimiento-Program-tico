package displayAcciones;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class DisplayGrupo extends JFrame{
    private JLabel etiquetaClaveMateria;
    private JTextField campoClaveMateria;
    private JLabel etiquetaClave;
    private JTextField campoClave;
    private JLabel etiquetaperiodo;
    private JComboBox comboPeriodo;
    
    public DisplayGrupo(){
        super("Asignar Unidad, para una materia");
        setLayout(null);
        
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
        campoClave.setBounds(10, 80, 140, 25);
        add(campoClave);
        
        
        
    }
}
