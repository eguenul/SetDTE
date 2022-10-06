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
public class signXML {
    public static void main(String args[]) throws IOException{
        try {
            System.setProperty("com.sun.org.apache.xml.internal.security.ignoreLineBreaks","true");
            Config objConfig = new Config();
            SignDTE  objSignDTE = new SignDTE();
            
            String nombre_archivo = args[0];
            String nombre_certificado = args[1];
            String clave = args[2];
            String attr_id = args[3];
            String nodo_xml = args[3];
            
            
            objSignDTE.signDTE(objConfig.getPathdte(),nombre_archivo,objConfig.getPathcert()+nombre_certificado, clave,attr_id, nodo_xml, "no", "yes",nombre_archivo+"SIGNED");
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException | KeyStoreException | CertificateException | UnrecoverableEntryException | KeyException | ParserConfigurationException | SAXException | MarshalException | XMLSignatureException | TransformerException ex) {
            Logger.getLogger(signXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
