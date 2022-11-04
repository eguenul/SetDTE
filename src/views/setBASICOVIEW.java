/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author esteban
 */
public class setBASICOVIEW extends JFrame {

    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;       
    public JButton boton;          // boton con una determinada accion

public setBASICOVIEW(){
 
 		super();
}


 // caja de texto, para insertar datos
				public void configurarVentana() {
        this.setTitle("DOCUMENTO SET BASICO");                   // colocamos titulo a la ventana
        this.setSize(1000, 600);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
   

	


 }

 public void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        // configuramos los componentes
       
        texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
/*    
    boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
  */

      // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(caja);
        this.add(boton);


// el panel con barras de scroll automáticas
  JScrollPane scrollPane = new JScrollPane();
  // dimensiones y posición del panel de scroll
  scrollPane.setBounds(30, 200, 800, 100);
  
  // se añade el panel de scroll a la ventana 
  getContentPane().add(scrollPane);

  // nombre de las columnas 
  String[] columnNames = { "ID", "PRODUCTO ", "CANTIDAD","PRECIO","DESCUENTO","TOTAL ITEM" };

					// creo un modelo de datos, sin datos por eso 'null' y establezco los
					// nombres de columna
					DefaultTableModel model = new DefaultTableModel(null, columnNames);
  // creo la tabla con el modelo de datos creado
JTable  table = new JTable(model);
  
  // se pone la tabla en el scroll
  scrollPane.setViewportView(table);


}
   

	
}
