
import java.io.IOException;
import java.net.MalformedURLException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
import setsimulacion.TokenBOLETA;
import setsimulacion.UpBOLETASII;
import setsimulacion.seedBOLETA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esteban
 */
public class EnvioBOLETA {
    
public static void main(String[] args) throws IOException, MalformedURLException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException, TransformerConfigurationException, Exception{
   seedBOLETA objSemilla = new seedBOLETA(); 
   String valorsemilla = objSemilla.getSeed();
   TokenBOLETA  objToken = new TokenBOLETA();
    String valortoken = objToken.getToken(valorsemilla,"/home/esteban/appdte/certificate/lpedrero","0912");
   
    UpBOLETASII objupload = new UpBOLETASII();
   String respuesta = objupload.upBOLETA(valortoken, "/home/esteban/appdte/DTE/ENVIOBOLETA.xml", "76979506-5", "16601661-4");
    System.out.print(respuesta);
  }
}
