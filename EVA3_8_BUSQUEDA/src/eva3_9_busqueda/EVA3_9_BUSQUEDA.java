/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_busqueda;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA3_9_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu = new Scanner(System.in);
    int[] valores = new int[10];
    int valor;
        for (int i = 0; i < valores.length; i++) {
         valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
         System.out.print("[" + valores[i] + "]");}
    
    do{
    //pedir valor al usuario
   System.out.println("INTRODUCE EL VALOR A BUSCAR EN EL ARREGLO");
    valor = captu.nextInt();
    
    //buscarlo (recorrer todo el ciclo para encontrarr el valor del arreglo )
        for (int i = 0; i < valores.length; i++) {
            if(valor == valores[i]) {
         System.out.println("Encontraste el valor !! Esta en la posicion : " + i);
         break;
        }
        }
    // si esta en el arreglo , salimos del ciclo
    }while(false);
    
    
    }
    
}
