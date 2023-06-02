/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;
import java.text.DecimalFormat;
import java.util.Random;
/**
 *
 * @author HUAWEI
 */
public class Operacionesespeciales extends Operaciones {
    public DecimalFormat df = new DecimalFormat("#.###");

    public Operacionesespeciales(String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario) {
        super(tipoCalculadora, color, dimensionPantalla, numeroDeSerie, nombrePropietario);
    }
    
    public double calmedia(double n1, double n2){
    return (n1+n2)/2;
    }
    public double calpotencia(double n1, double n2){
    double resultado=Math.pow(n1, n2);
    resultado=Double.parseDouble(df.format(resultado));
    return resultado;
    }
    
   
    public double callogaritmo(double n1){
        double resultado = Math.log(n1);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
    
    public double calseno(double n1){
        double resultado = Math.sin(n1);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
      
    public double calcoseno(double n1){
        double resultado = Math.cos(n1);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
    
          
    public double caltangente(double n1){
        double resultado = Math.tan(n1);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
    
          
    public double calraizcubica(double n1){
        double resultado = Math.cbrt(n1);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
    
      public double calrandom(double n1){
        Random random = new Random();
        double resultado = random.nextInt((int) n1);
        return resultado;
      }
     
     public boolean calprimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    } 
    
   
}
