/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedgrupo4;

import java.util.Scanner;

/**
 *
 * @author DAM127
 */
public class ProyectoEDgrupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opc=0,huevos=0;
        double chorizo=0;
        do{
            do{
                System.out.println("1.- .\n" +
                                   "2.- .\n" +
                                   "3.- .\n" +
                                   "4.- .\n" +
                                   "5.- .\n" +
                                   "6.- .\n" +
                                   "7.- .\n"+
                                   "8.-Salir.");
                opc = teclado.nextInt();
            }while((opc>7)||(opc<1));
            switch(opc){
                case 1:
                    
                break;
                case 2:
                    
                break;
                case 3:
                    
                break;
                case 4:
                    
                break;
                case 5:
                    
                break;
                case 6:
                    
                break;
                
                case 7:
                    System.out.println("Saliendo del programa.");
                break;
                default:
                    System.out.println("Error");
                break;
            }
        }while(opc!=7);
    }
    
}
