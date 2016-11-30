package display;

import displayAcciones.DisplayMaestro;
import displayAcciones.DisplayMateria;
import displayAcciones.DisplayUnidad;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MenuPrincipal extends JFrame{
    private JMenuBar barra;
    private JMenu menuArchivo;
    private JMenu menuEnviar;
    private JMenu menuAcercaDe;
    //Items del menu archivo
    private JMenuItem itemAbrirS;
    private JMenuItem itemGenerarPdf;
    private JMenuItem itemSalir;
    //Itemes del menu enviar
    private JMenuItem itemRegistrarProfe;
    private JMenuItem itemRegistrarMateria;
    private JMenuItem itemAsignarUnidad;
    private JMenuItem itemAsignarGrupo;
    private JMenuItem itemAsignarPractica;
    private JMenuItem itemAsignarVisita;
    private JMenuItem itemEvaluarGrupo;
    private JMenuItem itemIngresarDatosG;
    //Items acercaDe
    private JMenuItem itemDesarrolladores;
    
    //Displays de los datos
    DisplayMaestro ventanaMaestro;
    DisplayMateria ventanaMateria;
    DisplayUnidad ventanaUnidad;
    
    public MenuPrincipal(){
        super("Seguimiento Programático por grupos :O");
        setLayout(null);
        getContentPane().setBackground(Color.DARK_GRAY);
        //Eestablecemos nuestra barra de menus
        barra= new JMenuBar();
        
        //*****************Menu del archivo
        menuArchivo= new JMenu("Archivo");
        menuArchivo.setMnemonic('A');
        barra.add(menuArchivo);
        
        itemAbrirS= new JMenuItem("Abrir seguimiento en PDF");
        itemAbrirS.addActionListener(new HandlerAbrirS());
        menuArchivo.add(itemAbrirS);
        
        itemGenerarPdf= new JMenuItem("Generar un PDF del seguimiento");
        itemGenerarPdf.addActionListener(new HandlerGenerarPDF());
        menuArchivo.add(itemGenerarPdf);
        
        itemSalir= new JMenuItem("Salir");
        itemSalir.addActionListener(new ActionListener(){//Clase anónima
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Hasta Pronto :)");
                System.exit(0);
            } 
        });//Fin del argumento del método addActionListener
        menuArchivo.add(itemSalir);
        
        //****************Menu de enviarDatos
        menuEnviar= new JMenu("Enviar Datos a la base");
        menuEnviar.setMnemonic('E');
        barra.add(menuEnviar);
        
        itemRegistrarProfe= new JMenuItem("Registrar Maestro");
        itemRegistrarProfe.addActionListener(new HandlerRegistrarProfe());
        menuEnviar.add(itemRegistrarProfe);
        
        itemRegistrarMateria= new JMenuItem("Registrar materia a un maestro");
        itemRegistrarMateria.addActionListener(new HandlerRegistrarMateria());
        menuEnviar.add(itemRegistrarMateria);
        
        itemAsignarUnidad= new JMenuItem("Registrar unidad a una materia");
        itemAsignarUnidad.addActionListener(new HandlerAsignarUnidad());
        menuEnviar.add(itemAsignarUnidad);
        
        itemAsignarGrupo= new JMenuItem("Asignar grupo a una materia");
        itemAsignarGrupo.addActionListener(new HandlerAsignarGrupo());
        menuEnviar.add(itemAsignarGrupo);
        
        itemAsignarPractica= new JMenuItem("Asignar practica a un grupo");
        itemAsignarPractica.addActionListener(new HandlerAsignarPractica());
        menuEnviar.add(itemAsignarPractica);
        
        itemAsignarVisita= new JMenuItem("Asignar visita a un grupo");
        itemAsignarPractica.addActionListener(new HandlerAsignarVisita());
        menuEnviar.add(itemAsignarVisita);
        
        itemEvaluarGrupo= new JMenuItem("Eevaluar a un grupo");
        itemEvaluarGrupo.addActionListener(new HandlerEvaluarGrupo());
        menuEnviar.add(itemEvaluarGrupo);
        
        itemIngresarDatosG= new JMenuItem("Ingresar datos generales del grupo"); //Se necesita maestro, grupo, materia 
        itemIngresarDatosG.addActionListener(new HandlerIngresarDatosG());
        menuEnviar.add(itemIngresarDatosG);
        
        menuAcercaDe= new JMenu("Acerca de...");
        menuAcercaDe.setMnemonic('D');
        barra.add(menuAcercaDe);
        
        itemDesarrolladores= new JMenuItem("Desarrolladores");
        itemDesarrolladores.addActionListener((ActionEvent ae) -> {
            //Clase interna anónima
            JOptionPane.showMessageDialog(null, "Desarroladores de la aplicación:\n"
                    + "-> Daniel Dávalos Romero\n");
        });// fin de la clase interna anónima por medio de una expresión Lambda
        menuAcercaDe.add(itemDesarrolladores);  
        
        setJMenuBar(barra);//Añadimos la barra demenus con sus elementos
    }//Fin del constructor
    
    private class HandlerAbrirS implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    }
    
    private class HandlerGenerarPDF implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerRegistrarProfe implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            ventanaMaestro= new DisplayMaestro();
            ventanaMaestro.setSize(320, 400);
            ventanaMaestro.setLocationRelativeTo(null);
            ventanaMaestro.setResizable(false);
            ventanaMaestro.setVisible(true);
        }
        
    }
    
    private class HandlerRegistrarR implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerRegistrarMateria implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ventanaMateria= new DisplayMateria();
            ventanaMateria.setSize(300, 400);
            ventanaMateria.setLocationRelativeTo(null);
            ventanaMateria.setResizable(false);
            ventanaMateria.setVisible(true);
        }
        
    }
    
    private class HandlerAsignarUnidad implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            ventanaUnidad= new DisplayUnidad();
            ventanaUnidad.setSize(320, 400);
            ventanaUnidad.setLocationRelativeTo(null);
            ventanaUnidad.setResizable(false);
            ventanaUnidad.setVisible(true);
        }
        
    }
    
    private class HandlerAsignarGrupo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerAsignarPractica implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerAsignarVisita implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerEvaluarGrupo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
    private class HandlerIngresarDatosG implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
        
    }
    
}//Fin de la clase MenuPrncipal

class TestMenu{
    public static void main(String [] arg){
        MenuPrincipal app= new MenuPrincipal();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500, 500);
        app.setLocationRelativeTo(null);
        app.setResizable(true);
        app.setVisible(true);
    }
}
