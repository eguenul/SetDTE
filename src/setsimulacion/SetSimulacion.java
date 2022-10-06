/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setsimulacion;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 *
 * @author esteban
 */
public class SetSimulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException, TransformerException  {
   
        
    
    String filepath = "/home/esteban/appdte/DTE/PLANTILLASET.xml";
    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(filepath);
        
    Node folio = doc.getElementsByTagName("Folio").item(0);
    Element nododocumento = (Element) doc.getElementsByTagName("Documento").item(0);
   
    for(int i = 64; i <= 82; i++){
        
   
    folio.setTextContent(String.valueOf(i));
    
    nododocumento.setAttribute("ID", "DTE"+String.valueOf(i));
    
    
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
       
         transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");   
      
         transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
      
         transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        
         DOMSource source = new DOMSource(doc);
        
	 StreamResult result;
         result = new StreamResult(new File("/home/esteban/appdte/DTE/"+"DTE"+String.valueOf(i)+".xml"));
	transformer.transform(source, result);
    
    
    
    
    
    
    
   }
        
        
        
        
        
    }
    
}
