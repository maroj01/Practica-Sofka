package com.practicas.sofka.ciclos;

public class Ciclos {
    int numero;
    int x = 1;
    int anterior = 0;
    int temporal;
    int var;

    public void crearCiclos() {
        //algoritmo ciclico, numeros impares
        for (numero = 0; numero <= 50; numero++) {
            if ((numero % 2) != 0) {
                System.out.println(numero);
            }
        }
    }

    public void crearCiclos2() {
        // serie de fibonaci 0,1,1,2,3,5,8,13....
        while (true) { // ciclo infinito
            System.out.println(x);
            temporal = x;
            x = x + anterior;
            anterior = temporal;

            if (x > 50) { // para salir del ciclo infinito
                break;
            }
        }
    }

    public static void crearSwitchCase() {
        int x;
        x = 0;
        switch (3) {
            case 0: {
                System.out.println("Esta es la opcion 0");
                break;
            }
            case 1: {
                System.out.println("Esta es la opcion 1");
                break;
            }
            default: {
                System.out.println("Esta es la opcion por defecto");

            }
        }
    }

    public static void crearArreglo() {
        // declarar arreglos forma 1
        // int arreglo[] = new int[10];

        // declarar arreglos forma 3
        int arreglo[];
        arreglo = new int[10];

        // declarar arreglos forma 2
        //int arreglo[] = {1,2,3};

        arreglo[0] = 1;
        arreglo[1] = 2;
        arreglo[2] = 3;

        for (int i = 0; i < arreglo.length; i++)
        //for (int i=0; i<arreglo.length;i++)
        {
            System.out.println("Arreglo en indice: " + i + " es igual a:" + arreglo[i]);
        }
    }


    public void crearMatrices() {

        int matrix[][];
        matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 1;

        // System.out.println(matrix[0][0] = matrix[0][0]);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("matriz[" + i + "] [" + j + "] = " + matrix[i][j]);

            }
        }
    }



    public void crearSentencias() {
        var = 9;
        if (var == 5) {

            System.out.println("Tu operación es verdadera");
        } else {
            System.out.println("Tu operación es falsa");
        }
    }

    public void crearFor() {
        // for (int contador = 10; contador >= 0; contador--)  // decremento
        for (int contador = 0; contador <= 10; contador++) // incremento
        {
            contador = contador * 3;
            System.out.println("El contador vale : " + contador);
        }
    }

    public void crearWhile() {
        var = 0;
        boolean cond = true;
        //while (var <=20)
        while (cond == true) {
            System.out.println("El valor es: " + var);
            var = var + 2;

            if (var > 15) {
                cond = false;
            }
        }
    }

    public void crearBreakYContinue() {
        // break; // salirse de un ciclo
        //continue; // se termina el ciclo pero se salta el codigo donde este el continue
        for (var = 0; var <= 10; var++) {
            System.out.println("Aun estas en el ciclo");
            if (var == 4){
                //break;
                continue;
            }
            System.out.println("El valor es: " + var);
        }
        System.out.println("Has dejado el ciclo for. ");
    }

}


