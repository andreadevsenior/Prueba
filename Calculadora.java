package com.mycompany.calculadora;

 public class Calculadora {

    public static void main(String[] args) {

        System.out.println("---Ejecutando--Calculadora---");

        double n1 = 10.5;
        double n2 = 5.2;

        System.out.println("Resultado:" + (n1 + n2));
    }
}

// Para crear la carpeta classes y compilar el archivo Calculadora.java
// javac -d .\classes\ .\src\Calculadora.java 

//para ejecutar el archivo Calculadora.class
// java -cp .\classes\ com.mycompany.calculadora.Calculadora
// java Calculadora --> para ejecutar el archivo Calculadora.class sin paquete

// ---Resultado:15.7


// Comentarios de una línea

/* Comentarios
    de múltiples
   líneas */

/** Comentario de documentación */
/*
@version 1.0
@author Andrea Mancipe
@since 2023
@param args Argumentos de la línea de comandos
@return void
*/
