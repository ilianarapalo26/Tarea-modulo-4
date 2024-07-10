/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6figuras;

/**
 *
 * @author irapa
 */
public class Linea extends Forma {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea");
    }
}
