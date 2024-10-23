package com.campusdual.classroom;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;
        double NumeroPI = Math.PI;
        //Fórmula del área de un círculoS: a = radio * radio * Número PI
        a = r * r * NumeroPI;
        System.out.println("Area: " + a);
        //Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI
        l = (2 * r) * NumeroPI;
        System.out.println("Longitud:  " + l);
    }
}
