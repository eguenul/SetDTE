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
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author esteban
 */
public class FirmaEnvio {
 public static void main(String[] args){
     try {
         
           Config objConfig = new Config();
           String nombre_dte = args[0];
           String nombre_certificado = args[1];
           String clave = args[2];

             System.setProperty("com.sun.org.apache.xml.internal.security.ignoreLineBreaks","true");
   
         SignDTE  objSignDTE = new SignDTE();
         objSignDTE.signDTE(objConfig.getPathdte(),nombre_dte,objConfig.getPathcert()+nombre_certificado, clave,"SetDoc", "SetDTE", "no", "yes",nombre_dte+"SIGNED");
     } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException | KeyStoreException | IOException | CertificateException | UnrecoverableEntryException | KeyException | ParserConfigurationException | SAXException | MarshalException | XMLSignatureException | TransformerException ex) {
         Logger.getLogger(FirmaEnvio.class.getName()).log(Level.SEVERE, null, ex);
     }
           
     
 }   
}
