package com.practicas.sofka.matrizespiral;
import javax.swing.*;
import java.util.Arrays;

public class MatrizEspiral {
    int cantidadColumnas;
    int cantidadFilas;
    int[][] matrizEspiral;

    int dato = 1;
    int numeroInicialFila = 0;
    int numeroInicialColumna = 0;
    int numeroFinalFila;
    int numeroFinalColumna;


    public void solicitarTamanoMatriz() {
        do {
            cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el numero mayor a 0 y menor a 51, para las columnas."));
        }
        while (cantidadColumnas < 1 || cantidadColumnas > 50);

        do {
            cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese el numero mayor a 0 y menor a 51, para las filas"));
        }
        while (cantidadFilas < 1 || cantidadFilas > 50);

        matrizEspiral = new int[cantidadFilas][cantidadColumnas];
    }

    public void realizarRecorrido() {

        numeroFinalFila = cantidadFilas - 1;
        numeroFinalColumna = cantidadColumnas - 1;

        while (numeroInicialFila <= numeroFinalFila && numeroInicialColumna <= numeroFinalColumna) {
            recorrerFilaIzquierdaDerecha();
            recorrerColumnaDescendente();
            recorrerFilaDerechaIzquierda();
            recorrerColumnaAscendente();

            numeroInicialFila++;
            numeroFinalFila--;
            numeroInicialColumna++;
            numeroFinalColumna--;
        }
    }

    public void recorrerFilaIzquierdaDerecha() {
        for (int col = numeroInicialColumna; col <= numeroFinalColumna; col++) {
            matrizEspiral[numeroInicialFila][col] = dato++;
        }
    }

    public void recorrerColumnaDescendente() {
        for (int fila = numeroInicialFila + 1; fila <= numeroFinalFila; fila++) {
            matrizEspiral[fila][numeroFinalColumna] = dato++;
        }
    }

    public void recorrerFilaDerechaIzquierda() {
        for (int col = numeroFinalColumna - 1; col >= numeroInicialColumna; col--) {
            matrizEspiral[numeroFinalFila][col] = dato++;
        }
    }

    public void recorrerColumnaAscendente() {
        for (int fila = numeroFinalFila - 1; fila >= numeroInicialFila + 1; fila--) {
            matrizEspiral[fila][numeroInicialColumna] = dato++;
        }
    }

    public void mostrarMatriz() {
        for (int fila = 0; fila < matrizEspiral.length; fila++) {
            System.out.println(Arrays.toString(matrizEspiral[fila]));
        }
    }
}
