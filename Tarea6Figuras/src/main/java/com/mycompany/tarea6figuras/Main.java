/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea6figuras;

/**
 *
 * @author irapa
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 5.0);
        Linea linea = new Linea("Azul", 10.0);
        Triangulo triangulo = new Triangulo("Verde", 3.0, 4.0);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 2.5);

        circulo.dibujar();
        System.out.println("Color: " + circulo.getColor() + ", Radio: " + circulo.getRadio() + ", Area: " + circulo.calcularArea());

        linea.dibujar();
        System.out.println("Color: " + linea.getColor() + ", Largo: " + linea.getLargo());

        triangulo.dibujar();
        System.out.println("Color: " + triangulo.getColor() + ", Base: " + triangulo.getBase() + ", Altura: " + triangulo.getAltura() + ", Área: " + triangulo.calcularArea());

        cuadrado.dibujar();
        System.out.println("Color: " + cuadrado.getColor() + ", Lado: " + cuadrado.getLado() + ", Area: " + cuadrado.calcularArea());
    }
}
