/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author nesto
 */
public class Guitarra extends Instrumento {

    public String numeroCuerdas;
    
    public Guitarra(String nombre, String color, String tamaño) {
        super(nombre, color, tamaño);
        this.numeroCuerdas = "8";
    }
    
    public String sonar(){
    return "La guitarra esta sonando";
    }
  
}
