/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setsimulacion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esteban
 */
public class MainSII {
 
public static void main(String args[]){

    try {
        String nombre_archivo = args[0];
        String certificado = args[1];
        String clave = args[2];
        String rutemisor = args[3];
        String rutenvia = args[4];
        Config objConfig = new Config();
        
        
        Semilla objsemilla = new Semilla();
        String valorsemilla =  objsemilla.getSeed();
        Token objtoken = new Token(objConfig.getPathenvironment());
        String valortoken =  objtoken.getToken(valorsemilla,objConfig.getPathcert()+certificado,clave,nombre_archivo);
        
        UploadSii objupload = new UploadSii(objConfig.getPathenvironment());
        String resultadoenvio = objupload.uploadSii(valortoken,objConfig.getPathdte()+nombre_archivo,rutemisor,rutenvia);
        System.out.print("TRACK ID OBTENIDO: "+ resultadoenvio);
    } catch (IOException ex) {
        Logger.getLogger(MainSII.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(MainSII.class.getName()).log(Level.SEVERE, null, ex);
    }

        
}
            
    
    
}
