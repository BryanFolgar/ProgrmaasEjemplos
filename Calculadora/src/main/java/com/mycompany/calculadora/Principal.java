/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;
/**
 *
 * @author Bryan Folgar
 */
public class Principal {
    
   //Metodo Principal
    public static void main (String[] args) {
    
        //Definir variables
        Scanner objInput = new Scanner(System.in);
        String strContinuar = null;
        
        do{
            
            System.out.println("Seleccionar una opcion");
            System.out.println("a---Si desea sumar");
            System.out.println("b---Si desea restar");
            System.out.println("c---Si desea multiplicar");
            System.out.println("d---Si desea dividir");
            System.out.println("Escriba cualquiera de las opciones . . .");
            
            //Recibir el valor del buffer del teclado;
            String strOpcion = objInput.nextLine();
            
            
            //Definir variables para las operaciones
            float[] fltArrNumeros = new float[2];
            float fltResultado = 0;
            
            //definir variable de error;
            boolean blnError = true;
            
            switch(strOpcion){
                case "a":
                    strOpcion = "Suma";
                    System.out.println("");
                    System.out.println("La opcion seleccionada es "+ strOpcion);
                    
                    //Solicitar los valores numericos
                    for(int i=0; i<2; i++){
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }  
                    
                    fltResultado = fltArrNumeros[0] + fltArrNumeros[1];
                    
                    //control
                    blnError = false;
                    
                    //Sale del Case "a"
                    break;
                    
                    case "b":
                    strOpcion = "Resta";
                    System.out.println("");
                    System.out.println("La opcion seleccionada es "+ strOpcion);
                    //Solicitar los valores numericos
                    for(int i=0; i<2; i++){
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }  
                    
                    fltResultado = fltArrNumeros[0] - fltArrNumeros[1];
                    
                    //control
                    blnError = false;
                    
                    //Sale del Case "a"
                    break;
                    
                    case "c":
                    strOpcion = "Multiplicacion";
                    System.out.println("");
                    System.out.println("La opcion seleccionada es "+ strOpcion);
                    
                    //Solicitar los valores numericos
                    for(int i=0; i<2; i++){
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }  
                    
                    fltResultado = fltArrNumeros[0] * fltArrNumeros[1];
                    
                    //control
                    blnError = false;
                    
                    //Sale del Case "a"
                    break;
                    
                    case "d":
                    strOpcion = "Division";
                    System.out.println("");
                    System.out.println("La opcion seleccionada es "+ strOpcion);
                    //Solicitar los valores numericos
                    for(int i=0; i<2; i++){
                        System.out.println("Ingrese el numero " + (i+1) + " : ");
                        fltArrNumeros[i] = objInput.nextFloat();
                    }  
                    
                    fltResultado = fltArrNumeros[0] / fltArrNumeros[1];
                    
                    //control
                    blnError = false;
                    
                    //Sale del Case "a"
                    break;
                    
                default:    
                    //Error
                    blnError = true;
                    //sale de case
                    break;
            }
            System.out.println("");
            
            //Despliegue de los datos, si no hay error
            if(blnError == false){
                System.out.println("El resultado es : "+ fltResultado);
            }
            else if(blnError == true){
                System.out.println("Error no se puede realizar su operacion");
            }
            
            System.out.println("");
            System.out.println("Desea Continuar ?? S/N");
            
            //capturar el buffer para continuar
            Scanner objInput2 = new Scanner(System.in);
            strContinuar = objInput2.nextLine();
        } while(strContinuar.equals("s") || strContinuar.equals("S"));
        
    }
    
}
