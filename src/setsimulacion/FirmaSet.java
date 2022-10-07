/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setsimulacion;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author esteban
 */
public class FirmaSet {
 
    public static void main(String args[]) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException, UnrecoverableKeyException, KeyException, ParserConfigurationException, SAXException, MarshalException, XMLSignatureException, TransformerException{
    
        System.setProperty("com.sun.org.apache.xml.internal.security.ignoreLineBreaks","true");
        Config objConfig = new Config();
       
        String nombre_dte = args[0];
        String rango_inicio = args[1];
        String rango_final = args[2];
        String nombre_certificado = args[3];
        String clave = args[4];
        
        
       for(int i=Integer.parseInt(rango_inicio); i<=Integer.parseInt(rango_final); i++){
       SignDTE  objSignDTE = new SignDTE();
        objSignDTE.signDTE(objConfig.getPathdte(),nombre_dte+String.valueOf(i)+"TED",objConfig.getPathcert()+nombre_certificado, clave,"DOC"+String.valueOf(i), "Documento", "no", "no",nombre_dte+String.valueOf(i)+"TED");
      }
               
         
        
        
    }
    
    
}
