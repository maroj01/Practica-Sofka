package com.practicas.sofka.variablesJoption;

import java.util.Scanner;

public class MostrarJOption {

    int variable1;
    int resultado;

    public void crearVariables() {
        variable1 = 5;
        resultado = variable1 * 2;
        System.out.println("El resultado es : " + resultado);
    }



    Scanner captura = new Scanner(System.in);

    public void darBienvenida() {
        System.out.println("Ingrese su nombre de usuario");
        String nombre = captura.nextLine();
        System.out.println("Ingrese su edad");
        int edad = Integer.parseInt(captura.nextLine());
        System.out.println("Ingrese su número celular");
        int celular = Integer.parseInt(captura.nextLine());

        System.out.println("Bienvenido señor(a) " + nombre + ", es un placer para nosotros contar con una persona de " + edad + " años." + "\n" +
                "Próximamente nos comunicaremos con usted al numero " + celular + "." + "\n" + "Feliz día");
    }
}
