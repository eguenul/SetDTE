/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setsimulacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author esteban
 */
public class TimbreDTE {
    
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException, TransformerConfigurationException, FileNotFoundException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException{
             
            Config objConfig = new Config();
            String nombredte = args[0];
            String rango_inicio = args[1];
            String rango_final = args[2];
            String rut_emisor = args[3];
            String[] array_rut = rut_emisor.split("-");
           
            Timbre objTimbre = new Timbre();
            for(int i=Integer.parseInt(rango_inicio); i<=Integer.parseInt(rango_final); i++){
             objTimbre.creaTimbre(objConfig.getPathdte(),nombredte+String.valueOf(i),objConfig.getPathdata(),objConfig.getPathcaf(),array_rut[0]);
            }
             
            }
    
    
    
}
