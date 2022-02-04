package com.practicas.sofka.comunmultiplo;

public class EjercicioMentoria {

    /**
     * El siguiente metodo calcula y retorna el mínimo común múltiplo entre dos números enviados como parámetros.
     *
     * @param parametroUno
     * @param parametroDos
     * @return
     */
    public static int minimoComunMultiplo(int parametroUno, int parametroDos) {
        int resultadoMaximoComunDivisor = maximoComunDivisor(parametroUno, parametroDos);
        int resultado = parametroUno * parametroDos / resultadoMaximoComunDivisor;
        System.out.println("El mínimo común multiplo es:" + resultado);
        return resultado;
    }

    /**
     * El siguiente metodo calcula y retorna el máximo común divisor entre dos números enviados como parámetros.
     * Utilizando este metodo me permite hallar mínimo común múltiplo
     *
     * @param parametroUno
     * @param parametroDos
     * @return
     */
    public static int maximoComunDivisor(int parametroUno, int parametroDos) {
        int resultado;
        int numeroUno = Math.max(parametroUno, parametroDos);
        int numeroDos = Math.min(parametroUno, parametroDos);
        do {
            resultado = numeroDos;
            numeroDos = numeroUno % numeroDos;
            numeroUno = resultado;
        } while (numeroDos != 0);
        System.out.println("El máximo común divisor es:" + resultado);
        return resultado;

    }
}