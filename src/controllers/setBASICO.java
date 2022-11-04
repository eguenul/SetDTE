/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import views.setBASICOVIEW;

/**
 *
 * @author esteban
 */
public class setBASICO implements ActionListener   {
 
public setBASICO(){

}

public static void main( String args[] ){

setBASICO obj = new setBASICO();
obj.iniciaVista();

}

private void iniciaVista(){
 setBASICOVIEW objView = new setBASICOVIEW();
 objView.configurarVentana();
 objView.inicializarComponentes();  



 objView.setVisible(true);

 objView.boton.addActionListener(this);   

}

	@Override
	public void actionPerformed(ActionEvent ae) {
 JOptionPane.showMessageDialog(null,"Hola" );


	}

}
