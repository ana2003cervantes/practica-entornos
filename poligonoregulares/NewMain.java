/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poligonoregulares;

/**
 *
 * @author anacervantes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR CLASE heredada con al menos 2 Constructores
        // que represente un Pentagono Regular
        PentagonoRegular pentagono = new PentagonoRegular(5);

        // Getters y Setters ¿Heredados?
        double lado = pentagono.getLongiLado()
        pentagono.setLongiLado(lado*2);

        System.out.printf("Soy un pentagono (%d lados)"
                        + "de lado %.2f%n",
                pentagono.getNumLados(),
                pentagono.getLongiLado);

        // Implementa estos métodos propios de pentágono
        // apotema -> devuelve el valor de la apotema
        // superficie -> devuelve la superficie del pentagono
        System.out.printf("Apotema: %.2f, Superficie: %.2f%n",
                pentagono.apotema(),
                pentagono.superficie());

        // ¿Hace algo útil toString? Pruébalo
        System.out.println(pentagono.toString());










        Cuadrado cua1 = new Cuadrado();

        // Llamo a print, que es propio (sobreescrito)
        cua1.print();
        // Llamo a agrandar(int), que es heredado
        cua1.agrandar(20);
        // Llamo a agrandar(double) que es propio (sobrecargado)
        cua1.agrandar(20.0);

        // Llamo a perimetro, que es heredado
        System.out.printf("perimetro: %.2f%n",cua1.perimetro());
        // Llamo a superficie, que es propio
        System.out.printf("superficie: %.2f%n",cua1.superficie());

        Triangulo t = new Triangulo();
        t.agrandar(10);
        t.print();
        System.out.printf("perimetro: %.2f%n",t.perimetro());
        System.out.printf("superficie: %.2f%n",t.superficie());


    }
}
