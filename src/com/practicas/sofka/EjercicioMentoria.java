package com.practicas.sofka;

public class EjercicioMentoria {
    /**
     * Calcula y retorna el mínimo común múltiplo entre dos números enviados como parámetros.
     *
     * @param parametro1
     * @param parametro2
     * @return
     */

    public static int minimoComunMultiplo(int parametro1, int parametro2) {
        // TODO: 01/02/2022 refactorizar, cambiando nombres de variables y la función
        // FIXME: 01/02/2022 refactorizar, mejorando el complejidad

        int resultado = 1;
        int i = 2;

        while (i <= parametro1 || i <= parametro2) {
            if (parametro1 % i == 0 || parametro2 % i == 0) {
                resultado = resultado * i;
                if (parametro1 % i == 0) parametro1 = parametro1 / i;
                if (parametro2 % i == 0) parametro2 = parametro2 / i;
            } else
                i = i + 1;
        }
        return resultado;
    }

    public static int funcion2(int a, int b) {
        // FIXME: 01/02/2022 Actualizar a y b de acuerdo al que sea mayor para el algoritmo funcione.
        int resultado = 0;
        // TODO: 01/02/2022  Agregar un calculo del menor y el mayor de los parámetros.
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);

        return resultado;
    }
    // identificar que hace la funcion
    // utilizando la funcion 2 refactorizar la primera
    // hay una forma de utilizar la funcion2 para calcular el minimo comun multiplo
    //bajando la compejidad que sale en sonarlint
    //maximocomundivisor ......

}
