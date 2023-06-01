/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;

import java.util.Random;
import java.text.DecimalFormat;

public class Operaciones {
    
    public double result;
    public DecimalFormat df = new DecimalFormat("#.###");
 
    public void calsuma (double n1, double n2){
        result = n1 + n2;
        result=Double.parseDouble(df.format(result));
    }
    
    public void calresta (double n1, double n2){
        result = n1 - n2;
        result=Double.parseDouble(df.format(result));
    }
    
    public void calmulti (double n1, double n2){
        result = n1 * n2;
        result=Double.parseDouble(df.format(result));
    }
    
    public void caldivi (double n1, double n2){
        result = n1/n2;
        result=Double.parseDouble(df.format(result));
    }
    
    public void calraiz (double n1){
        result = Math.sqrt(n1);
        result=Double.parseDouble(df.format(result));
    }
        
    public void calmedia(double n1, double n2){
        result =(n1+n2)/2;  
        result=Double.parseDouble(df.format(result));
    }
    
    public void calpotencia(double n1, double n2) {
        result = Math.pow(n1, n2);
        result=Double.parseDouble(df.format(result));
        result=Math.round(result*100)/100.0;
    }
    
    public void callogaritmo(double n1) {
        result = Math.log(n1);
        result=Double.parseDouble(df.format(result));
    }
    
    public void calseno(double n1) {
        result = Math.sin(n1);
        result = Math.sin(Math.toRadians(n1));
        result=Double.parseDouble(df.format(result));
        
    }
    
    public void calcoseno(double n1){
        result=Math.cos(n1);
        result=Double.parseDouble(df.format(result));
    
    }
    
    public void caltangente(double n1) {
    result= Math.tan(n1);
    result = Math.sin(Math.toRadians(n1)); 
    result=Double.parseDouble(df.format(result));
    }
    
    public void calraizcubica(double n1) {
    result= Math.cbrt(n1);
    result=Double.parseDouble(df.format(result));
    }
    
     public void calrandom (double n1) {
        Random random = new Random();
        result = random.nextInt((int) n1);}
     
}
