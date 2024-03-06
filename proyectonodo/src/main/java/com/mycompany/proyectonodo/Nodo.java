/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectonodo;

/**
 *
 * @author GRECIA
 */
public class Nodo {
    private String TareasPendientes;
    private String TareasRealizadas;
    private String Recordatorio;
    
    private Nodo Siguiente;
    
    public void Nodo(){
        this.setTareasRealizadas(getTareasRealizadas());
        this.setTareasPendientes(getTareasPendientes());
        this.setRecordatorio(getRecordatorio());
        this.setSiguiente(null);
       
       
       
    }
    public Nodo(){
        setTareasRealizadas(null);
        setTareasPendientes(null);
        setRecordatorio(null);
        setSiguiente(null);
    }
    

    /**
     * @return the TareasPendientes
     */
    public String getTareasPendientes() {
        return TareasPendientes;
    }

    /**
     * @param TareasPendientes the TareasPendientes to set
     */
    public void setTareasPendientes(String TareasPendientes) {
        this.TareasPendientes = TareasPendientes;
    }

    /**
     * @return the TareasRealizadas
     */
    public String getTareasRealizadas() {
        return TareasRealizadas;
    }

    /**
     * @param TareasRealizadas the TareasRealizadas to set
     */
    public void setTareasRealizadas(String TareasRealizadas) {
        this.TareasRealizadas = TareasRealizadas;
    }

    /**
     * @return the Recordatorio
     */
    public String getRecordatorio() {
        return Recordatorio;
    }

    /**
     * @param Recordatorio the Recordatorio to set
     */
    public void setRecordatorio(String Recordatorio) {
        this.Recordatorio = Recordatorio;
    }

    /**
     * @return the Siguiente
     */
    public Nodo getSiguiente() {
        return Siguiente;
    }

    /**
     * @param Siguiente the Siguiente to set
     */
    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
}
