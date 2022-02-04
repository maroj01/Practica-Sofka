package com.practicas.sofka.capturaatosConvertirvariables;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CapturaDatos {
    public static void main(String[] args) {
        System.out.println("Mi primer programa");

        /*
        //CAPTURA DE DATOS 1
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un dato");
        String dato= captura.nextLine();
        System.out.println("El dato ingresado es: "+ dato);  */

        //CAPTURA DE DATOS 2
        String dato;
        dato = JOptionPane.showInputDialog("Ingrese un dato");
        JOptionPane.showMessageDialog(null, "El dato ingresado es: " + dato);

        ////////////////////////////
        /**
         * leer desde el teclado
         * concat() para concatenar
         * toUpperCase() mayuzcula
         * toLowerCase()  //minusculas
         * lenght()  muestra el tamaño incluyendo los espacios
         * convertir variables numericas a String y viceversa
         */
        //leer desde el teclado
       /* String texto = "";
        InputStreamReader in = new InputStreamReader(System.in); // canal de datos
        BufferedReader buffer = new BufferedReader(in); // Buffer es el espacio en memoria que almacenara los datos
        try {
            texto = buffer.readLine(); //readLine me lee y captura lo que he escrito y lo guarda en la variable

        } catch (IOException e) {
        };

        //CONCATENAR
        texto =texto.concat("-esto es Una ConcatEnación"); // concatena lo que hay en la variable texto con lo que hay en concat()
        //toLowerCase()
        texto=texto.toLowerCase(); // convierte la frase en minuscula  all
        texto=texto.toUpperCase(); // convierte la frase en mayúzcula all
        System.out.println(texto);

        // lenght()
        int cantidadLetras = texto.length();
        System.out.println(texto);
        System.out.println("La frase tiene "+cantidadLetras+" letras y espacios"); */

        //convertir variables numericas a String y viceversa
        String texto = "";
        int x = 0;

        InputStreamReader in = new InputStreamReader(System.in); // canal de datos
        BufferedReader buffer = new BufferedReader(in); // Buffer es el espacio en memoria que almacenara los datos
        try {
            texto = buffer.readLine(); //readLine me lee y captura lo que he escrito y lo guarda en la variable
            x = Integer.parseInt(texto); // x =xxx.parseInt(texto); // se cambia por el tipo de dato ejp dooble, integer

        } catch (Exception e) {
            System.out.println("Debes escribir un numero");
        }
        ;
        System.out.println(x);

    }
}
