package setsimulacion;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class EnvioDTE {

    
    

   public void generaEnvio(String nombredte, String archivo_destino) throws ParserConfigurationException, FileNotFoundException, IOException, SAXException, TransformerConfigurationException, TransformerException{
    Config objConfig = new Config();
       
    String filepath = objConfig.getPathdte()+archivo_destino+".xml";
    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(filepath);
        
    Node setdte = doc.getElementsByTagName("SetDTE").item(0);
   
       
     
    String archivo = nombredte+".xml";
    DocumentBuilderFactory docFactory2 = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder2 = docFactory2.newDocumentBuilder();
    Document doc2;
    doc2 = docBuilder2.parse(archivo);
        
    Node dte = doc2.getElementsByTagName("DTE").item(0);
       
    StringWriter buf = new StringWriter();
    Transformer xform = TransformerFactory.newInstance().newTransformer();
          
    xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
    xform.setOutputProperty(OutputKeys.INDENT, "no");
   
    xform.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
    
    xform.transform(new DOMSource(dte), new StreamResult(buf));
    String stringnode = buf.toString();
     
      
    Node fragmentNode = docBuilder.parse(new InputSource(new StringReader(stringnode))).getDocumentElement();
    fragmentNode = doc.importNode(fragmentNode, true);
    setdte.appendChild(fragmentNode);
    
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
       
         transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");   
    
         transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
    
         transformer.setOutputProperty(OutputKeys.INDENT, "no");
        
         DOMSource source = new DOMSource(doc);
        
	StreamResult result;
        result = new StreamResult(new File(objConfig.getPathdte()+archivo_destino+".xml"));
	transformer.transform(source, result);
}      
}
   
   
   
   

