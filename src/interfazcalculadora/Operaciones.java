/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazcalculadora;

import java.util.Random;
import java.text.DecimalFormat;

public class Operaciones {
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    protected String numeroDeSerie;
    protected String nombrePropietario;  
    //constructor 
    public Operaciones(String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario) {
        this.tipoCalculadora = tipoCalculadora;
        this.color = color;
        this.dimensionPantalla = dimensionPantalla;
        this.numeroDeSerie = numeroDeSerie;
        this.nombrePropietario = nombrePropietario;
    } 

    public String getTipoCalculadora() {
        return tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimensionPantalla() {
        return dimensionPantalla;
    }

    public void setDimensionPantalla(int dimensionPantalla) {
        this.dimensionPantalla = dimensionPantalla;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }
    
    public DecimalFormat df = new DecimalFormat("#.###");
   
    public double calsuma(double n1, double n2){
        return n1 + n2;
    }
    
    public double calresta(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double calmulti(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double caldivi(double primerNumero, double segundoNumero){
           double resultado = primerNumero/segundoNumero;
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }
    
    public double calraiz(double numero){
           double resultado = Math.cbrt(numero);
        resultado=Double.parseDouble(df.format(resultado));
        return resultado;
    }

}
     