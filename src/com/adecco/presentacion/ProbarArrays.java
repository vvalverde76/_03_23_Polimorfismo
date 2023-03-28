package com.adecco.presentacion;

import java.util.Arrays;

public class ProbarArrays {
    public static void main(String[] args) {
        //Definicion de Arrays de tipo primitivo

        int[] numeros = new int[3];
        // Asignar valor primera posicion

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 5;

        System.out.println("Primera celda= "+ numeros[0]);
        System.out.println("Segunda celda= "+ numeros[1]);
        System.out.println("Tercera celda= "+ numeros[2]);

        //Array de string definido en dos lineas

        String[] nombresAlumnos; // todavia no se el numero total de alumnos
        nombresAlumnos = new String[3];// cuando ya se sabe la dimnesion del array

        nombresAlumnos[0]="Juan";
        nombresAlumnos[1]="Pedro";
        nombresAlumnos[2]="Ana";
        System.out.println("Primer Alumno= "+ nombresAlumnos[0]);
        System.out.println("Segundo Alumno= "+ nombresAlumnos[1]);
        System.out.println("Tercero Alumno= "+ nombresAlumnos[2]);

        System.out.println(Arrays.toString(nombresAlumnos));// otra forma de ver los valores del array
        System.out.println(Arrays.toString(numeros));









    }
}
