/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;


import javax.swing.JButton;
import javax.swing.JComboBox;
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

    public JTextField MntNeto; 
    public JTextField MntExento;
    public JTextField MntIva; 
    
    public JTextField MntTotal; 
    
    public JButton btnXML;
    
    public JButton btnAgregar;
    
    public JButton btnEliminar;
    
    public JTextField textfieldraz;
    
    public JTextField textfieldgir;
    
    public JTextField textfieldfolio;
    
    
    
    public JTextField textfieldfecha;
    
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
        
        
        JLabel txtRAZ = new JLabel();
        
        // configuramos los componentes
       
        texto.setText("RUT");    // colocamos un texto a la etiqueta
        texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        
        txtRAZ.setText("RAZON SOCIAL");
        txtRAZ.setBounds(300,50,100,25);
        this.add(txtRAZ);
        
        textfieldraz = new JTextField();
        textfieldraz.setBounds(410, 50, 150, 25);
        this.add(textfieldraz);
        
        
        JLabel txtGIR = new JLabel();
        txtGIR.setText("GIRO");
        txtGIR.setBounds(600,50,100,25);
        this.add(txtGIR);
        
        textfieldgir = new JTextField();
        textfieldgir.setBounds(650,50,150,25);
        this.add(textfieldgir);
        
        caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Nuevo");   // colocamos un texto al boton
        boton.setBounds(850, 50, 100, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
/*    
    boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
  */

    
        


     MntNeto = new JTextField(); 
     MntExento = new JTextField();
     MntIva = new JTextField(); 
     MntTotal = new  JTextField(); 
    
     MntNeto.setBounds(100,400,100,25);
     MntExento.setBounds(250,400,100,25);
     MntIva.setBounds(400,400,100,25);
     MntTotal.setBounds(550,400,100,25);
     
     JLabel labelNeto = new JLabel();
     JLabel labelExento = new JLabel();
     JLabel labelIva = new JLabel();
     JLabel labelTotal = new JLabel();
     
     labelNeto.setText("NETO");
     labelNeto.setBounds(100,380,100,25);
    
      labelExento.setText("EXENTO");
     labelExento.setBounds(250,380,100,25);
    
     
      labelIva.setText("IVA");
     labelIva.setBounds(400,380,100,25);
    
     
     labelTotal.setText("TOTAL");
     labelTotal.setBounds(550,380,100,25);
    
     
     
        btnXML = new JButton();
        btnXML.setText("Genera XML");   // colocamos un texto al boton
        btnXML.setBounds(700, 400, 150, 25);
     
        this.add(btnXML);
    
        
         btnAgregar = new JButton();
         btnAgregar.setText("+Agregar");         
         btnAgregar.setBounds(850, 200, 95, 25);
   
         this.add(btnAgregar);
         
          btnEliminar = new JButton();
         btnEliminar.setText("-Eliminar");         
         btnEliminar.setBounds(850, 230, 95, 25);
   
         this.add(btnEliminar);
         
         String[] petStrings = { "FACTURA ELECTRONICA", "NOTA DE CREDITO ELECTRONICA", "NOTA DE DEBITO ELECTRONICA", "FACTURA EXENTA ELECTRONICA", "BOLETA ELECTRONICA" };

//Create the combo box, select item at index 4.
//Indices start at 0, so 4 specifies the pig.
 JComboBox petList = new JComboBox(petStrings);
 petList.setBounds(130, 90, 250, 20);
 petList.setSelectedIndex(4);
this.add(petList);
         
   JLabel labelDOC = new JLabel("DOCUMENTO");
   labelDOC.setBounds(20, 90, 90, 20);
   
   JLabel labelFOLIO = new JLabel("FOLIO");
   labelFOLIO.setBounds(390, 90, 70, 20);
   this.add(labelFOLIO);
   
   textfieldfolio = new JTextField();
   textfieldfolio.setBounds(430,90,130,25);
   this.add(textfieldfolio);
   
   JLabel labelFECHA = new JLabel("FECHA");
   labelFECHA.setBounds(600, 90, 70, 20);
   this.add(labelFECHA);
   
    textfieldfecha = new JTextField();
   textfieldfecha.setBounds(650,90,130,25);
   this.add(textfieldfecha);
   
   
   
     this.add(labelDOC);
     this.add(labelNeto);
     this.add(labelExento);
     this.add(labelIva);
     this.add(labelTotal);
     
     this.add(MntNeto);
     this.add(MntExento);
     this.add(MntIva);
     this.add(MntTotal);
     
     
     
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
