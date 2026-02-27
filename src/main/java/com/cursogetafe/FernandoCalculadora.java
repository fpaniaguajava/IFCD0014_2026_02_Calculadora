package com.cursogetafe;

public class FernandoCalculadora {
    public static int sumar(int numero1, int numero2) {
        return numero1+numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) numero1 / numero2;
    }

}
