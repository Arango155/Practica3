/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author jdara
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     float x;
     int op;
  
    
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Funciones disponibles:");
    System.out.println("1-Factorial y tabla de multiplicar");
    System.out.println("2-Operaciones entre 10 numeros y conocer dias laborales de la semana");
    System.out.println("Ingresa el numero segun las funciones que quiera realizar"); op = entrada.nextInt();
    
    switch (op){
    
    case 1:
  
    System.out.println("Bienvenido a la funcion para conocer el factorial y la tabla de multiplicar del numero que ingrese");
  
    System.out.println("Ingrese del numero que desea conocer: ");
    x=entrada.nextFloat();
    
    
    clase practica=new clase();
    
    
    System.out.println("El factorial del numero es:");
    System.out.println(practica.factorial(x));
    
    
     System.out.println("La tabla del numero es:");
    System.out.println(practica.tabla(x));
  
    }
    
  
    }
    
    
    
   
}