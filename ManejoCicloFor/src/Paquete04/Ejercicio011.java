/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio011 {

    public static void main(String[] args) {
        int numero; 
        int operacion;
        String cadenaFinal = "";
        String cadenaFinal2 = ""; 
        for (numero = 30; numero >= 10;numero--){
            for(int contador = 1; contador <= 4; contador ++){
                operacion = numero * contador; 
                cadenaFinal = String.format("%s%d-",cadenaFinal,operacion);
                
            }
            cadenaFinal2 = String.format("%s%s\n",cadenaFinal2,cadenaFinal);
            cadenaFinal = "";
        }
        
        System.out.printf("%s\n",cadenaFinal2);

       
    }
}
