/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelas;

/**
 *  
 * @author FER
 */
public class Alumno {
    int ncontrol;
    String nombre;
    String apellido;    

    public Alumno() {
    }

    public Alumno(int ncontrol, String nombre, String apellido) {
        this.ncontrol = ncontrol;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(int ncontrol) {
        this.ncontrol = ncontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void obtenerNombre() {
         System.out.println("Hola soy un nombre");        
}

    public void statuscalificacion(int calif){
      if(calif>=70){         
     System.out.println("Aprobaste");        
     }
     else{
      System.out.println("Reprobaste");
    }
}
    
}
