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
public class SignRCOF {
    
   public static void main(String args[]) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException, IOException, CertificateException, UnrecoverableEntryException, UnrecoverableKeyException, KeyException, ParserConfigurationException, SAXException, MarshalException, XMLSignatureException, TransformerException{
      System.setProperty("com.sun.org.apache.xml.internal.security.ignoreLineBreaks","true");
      Config objConfig = new Config();
       SignDTE  objSignDTE = new SignDTE();
       
       String nombre_archivo = args[0];
       String nombre_certificado = args[1];
       String clave = args[2];
       String attr_id = args[3];

       objSignDTE.signDTE(objConfig.getPathdte(),nombre_archivo,objConfig.getPathcert()+nombre_certificado, clave,attr_id, "DocumentoConsumoFolios", "no", "yes",nombre_archivo+"SIGNED");
     
       
   }
    
}
