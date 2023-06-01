/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;

/**
 *
 * @author HUAWEI
 */
public class Operacionesespeciales extends Operaciones {
    
     public void calseno(double n1) {
        result = Math.sin(n1);
    }
    
    public void caltangente(double n1) {
    result= Math.tan(n1);
    }
    
    public void calraizcubica(double n1) {
    result= Math.cbrt(n1);
    }
}
