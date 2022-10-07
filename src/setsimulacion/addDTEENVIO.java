/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setsimulacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author esteban
 */
public class addDTEENVIO {
 
    
    public static void main(String args[]) throws ParserConfigurationException, IOException, FileNotFoundException, SAXException, TransformerException{
             
            Config objConfig = new Config();
            String nombredte = args[0];
            String rango_inicio = args[1];
            String rango_final = args[2];
            String archivo_destino = args[3];
            /*
            String rut_emisor = args[3];
            String[] array_rut = rut_emisor.split("-");
          */
        
        
                   for(int i = Integer.parseInt(rango_inicio); i <= Integer.parseInt(rango_final); i++){ 
                    EnvioDTE objenvio = new EnvioDTE();
                    
                    objenvio.generaEnvio(objConfig.getPathdte()+nombredte+String.valueOf(i)+"TED", archivo_destino);
                    
        
              }
    }
    
}
