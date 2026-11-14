/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_16_problema_4;

import java.util.Scanner;

/**
 *
 * @author leo11
 */
public class EVA3_16_PROBLEMA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    String Dias[] = {"Lunes", "Martes", "Miercoles" , "Jueves", "Viermes"};
    int matriz[][] = new int [3][5];
    int asistencia = 0; 
    int faltas = 0;
        Scanner captu = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            asistencia = 0; 
            faltas = 0;
            
             for(int j = 0; j < matriz[i].length; j++) {
                 
            System.out.println("Alumno " + (i + 1) + " asistio el ? " + Dias[j] + " 1 = si 0 = no");
            matriz[i][j] = captu.nextInt();
            if (matriz[i][j] == 1){
            asistencia = asistencia + 1;  
            }else if(matriz[i][j] == 0){
            faltas = faltas + 1;
            }
            
             }
            
        System.out.println("Alumno " + (i + 1) + " Asistencias : " + asistencia + " Faltas : " + faltas);
        System.out.println();
        
        }
    
      
    
    
    }
    
}
