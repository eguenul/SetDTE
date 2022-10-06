/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setsimulacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author esteban
 */
public class Config {
    
    private String pathcert;
    private String pathpdf;
    private String pathcaf;
    private String pathdata;
    private String pathdte;
    private String pathimg;
    private String pathenvironment;
    private String pathtemplate;
    
    private String pathdownload;
    private String serverauth;
    private String serveracceptdte;
     
    public Config() throws IOException{
          Properties prop = new Properties();
        try (InputStream in = new FileInputStream("setdte.properties")) {
            prop.load(in);
       
          this.pathcert = prop.getProperty("path-certificate");
          this.pathpdf = prop.getProperty("path-pdf");
          this.pathcaf = prop.getProperty("path-caf");
          this.pathdata = prop.getProperty("path-data");
          this.pathdte = prop.getProperty("path-DTE");
          this.pathenvironment = prop.getProperty("environment-url");
          this.pathimg = prop.getProperty("path-img");
          this.pathtemplate =  prop.getProperty("path-template");
          this.pathdownload = prop.getProperty("path-download");
           
          this.serverauth = prop.getProperty("server-auth");
          this.serveracceptdte = prop.getProperty("server-acceptdte");
        }
        
    }

    /**
     * @return the pathcert
     */
    public String getPathcert() {
        return pathcert;
    }

    /**
     * @param pathcert the pathcert to set
     */
    public void setPathcert(String pathcert) {
        this.pathcert = pathcert;
    }

    /**
     * @return the pathpdf
     */
    public String getPathpdf() {
        return pathpdf;
    }

    /**
     * @param pathpdf the pathpdf to set
     */
    public void setPathpdf(String pathpdf) {
        this.pathpdf = pathpdf;
    }

    /**
     * @return the pathcaf
     */
    public String getPathcaf() {
        return pathcaf;
    }

    /**
     * @param pathcaf the pathcaf to set
     */
    public void setPathcaf(String pathcaf) {
        this.pathcaf = pathcaf;
    }

    /**
     * @return the pathdata
     */
    public String getPathdata() {
        return pathdata;
    }

    /**
     * @param pathdata the pathdata to set
     */
    public void setPathdata(String pathdata) {
        this.pathdata = pathdata;
    }

    /**
     * @return the pathdte
     */
    public String getPathdte() {
        return pathdte;
    }

    /**
     * @param pathdte the pathdte to set
     */
    public void setPathdte(String pathdte) {
        this.pathdte = pathdte;
    }

    /**
     * @return the pathimg
     */
    public String getPathimg() {
        return pathimg;
    }

    /**
     * @param pathimg the pathimg to set
     */
    public void setPathimg(String pathimg) {
        this.pathimg = pathimg;
    }

    /**
     * @return the pathenvironment
     */
    public String getPathenvironment() {
        return pathenvironment;
    }

    /**
     * @param pathenvironment the pathenvironment to set
     */
    public void setPathenvironment(String pathenvironment) {
        this.pathenvironment = pathenvironment;
    }

    /**
     * @return the pathtemplate
     */
    public String getPathtemplate() {
        return pathtemplate;
    }

    /**
     * @param pathtemplate the pathtemplate to set
     */
    public void setPathtemplate(String pathtemplate) {
        this.pathtemplate = pathtemplate;
    }

    /**
     * @return the pathdownload
     */
    public String getPathdownload() {
        return pathdownload;
    }

    /**
     * @param pathdownload the pathdownload to set
     */
    public void setPathdownload(String pathdownload) {
        this.pathdownload = pathdownload;
    }

    /**
     * @return the serverauth
     */
    public String getServerauth() {
        return serverauth;
    }

    /**
     * @param serverauth the serverauth to set
     */
    public void setServerauth(String serverauth) {
        this.serverauth = serverauth;
    }

    /**
     * @return the serveracceptdte
     */
    public String getServeracceptdte() {
        return serveracceptdte;
    }

    /**
     * @param serveracceptdte the serveracceptdte to set
     */
    public void setServeracceptdte(String serveracceptdte) {
        this.serveracceptdte = serveracceptdte;
    }
    
    
    
    
    
    
}
