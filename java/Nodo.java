/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author GRECIA
 */
public class Nodo {
   
    private String nombre1;
    //puede cambiar la variable
    private Nodo siguiente;

    public Nodo() {
        this.nombre1 = nombre1;
        this.siguiente = null; 
}

    /**
     * @return the nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1 the nombre1 to set
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
