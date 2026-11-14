/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_problemas_1;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA3_13_PROBLEMAS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
Scanner captu = new Scanner(System.in);
    int[] valores = new int[10];
    int valor, contador = 0;
        for(int i = 0; i < valores.length; i++) {
         valores[i] = (int)(Math.random() * 10);
        }
        for (int i = 0; i < valores.length; i++) {
         System.out.print("[" + valores[i] + "]");}
        System.out.println("di un valor");
        valor = captu.nextInt();
    
    for (int j = 0; j < valores.length; j++){
        if(valores[j] == valor){
        contador = contador + 1;
            
        } 
    
    }
    System.out.println(valor + " Se repitio - " + contador + "veces");
    }
}
    

