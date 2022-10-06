
import java.util.logging.Level;
import java.util.logging.Logger;
import setsimulacion.Semilla;
import setsimulacion.Token;
import setsimulacion.UploadSii;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esteban
 */
public class EnvioSII {
 
    public static void main(String[] args){
        
        try {
            Semilla objsemilla = new Semilla();
            String valorsemilla = objsemilla.getSeed();
            /*
            String valorsemilla,String pathcertificado,String clave,String nombredte
            
            */
            Token objToken = new Token("maullin.sii.cl");
            String valortoken = objToken.getToken(valorsemilla,"/home/esteban/appdte/certificate/jlepage","3618","ENVIODTE" );
           System.out.print(valortoken);
           
           /*
              
    public String uploadSii(String valortoken,String pathdte,String nombredte ,String rutemisor,String rutusuario) throws MalformedURLException, IOException, ParserConfigurationException, SAXException{

           */
           
          UploadSii objUpload = new UploadSii("maullin.sii.cl");
         String respuesta =  objUpload.uploadSii(valortoken,"ENVIODTE", "77499104-2", "26218953-8");
           System.out.print(respuesta);
           
        } catch (Exception ex) {
            Logger.getLogger(EnvioSII.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
