package com.practicas.sofka.claseabstracta;

public abstract class Vehiculo {

    double peso;
    double altura;
    double ancho;
    double largo;
    boolean encendido = false;
    int numPuerta;
    String modelo;

    public Vehiculo() {
        this.peso = 100;
        this.altura = 1.90;
        this.ancho = 4;
    }

    public double obtenerPeso() {
        return this.peso;
    }

    public abstract void encender();

    public void apagar() {
        this.encendido = false;
        System.out.println("El auto esta apagado");
    }

    public void estado() {
        if (this.encendido == true)
            System.out.println("El auto esta encendido");
        else
            System.out.println("El auto esta apagado");
    }
    //POLIMORFISMO POR SOBRE ESCRITURA
    public void informarAuto() {
        System.out.println("Hay gran variedad de autos");
    }
}


//HERENCIA
class Taxi extends Vehiculo {
    public void contarviajes() {
        System.out.println("Ha viajado 150 millas por hora");
    }
    //POLIMORFISMO POR SOBRE ESCRITURA
    public  void informarAuto(){
        System.out.println("El taxi es para transporte de pasajeros");
    }
    public void encender(){
        this.encendido = true;
        System.out.println("El auto esta encendido");
    }

}

//HERENCIA
class Camion extends Vehiculo {
    public Camion() {
        modelo = "RENAULT";
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El auto esta encendido");
    }

    public String darModelo() {
        return this.modelo;
    }

    //POLIMORFISMO POR SOBRE ESCRITURA
    public  void informarAuto(){
        System.out.println("El camion es para transporte de carga");
    }
}

