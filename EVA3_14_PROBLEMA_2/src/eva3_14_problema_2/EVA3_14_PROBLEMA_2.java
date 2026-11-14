/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_problema_2;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA3_14_PROBLEMA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner captu = new Scanner(System.in);
    int[] valores = new int[10];
    int mayor = 0, menor = 100;
        for(int i = 0; i < valores.length; i++) {
         valores[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < valores.length; i++) {
         System.out.print("[" + valores[i] + "]");}
        
    for (int i = 0; i < valores.length; i++) {
         if(valores[i] < menor){
         menor = valores[i];
         }else if(valores[i] > mayor){
         mayor = valores[i];
         }
        
    
    }
    System.out.println();
      System.out.println("La variable menor es :" + menor);
          System.out.println("La variable menor es :" + mayor);   
        
    }
    
}
