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
        TiendaRopa TiendaRopa = new TiendaRopa(0,0);
        int opc=0,telanegra=0,telaroja=0;
        do{
            do{
                System.out.println("1.-Añadir tela roja y negra al inventario.\n" +
                                   "2.-Obtener la cantidad de metros de tela roja y negra en el almacen.\n" +
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
                    System.out.println("Cuantos metros de tela roja añadimos?");
                    telaroja=teclado.nextInt();
                    TiendaRopa.addTelaRoja(telaroja);
                    System.out.println("Cuantos metros de tela negra añadimos?");
                    telanegra=teclado.nextInt();
                    TiendaRopa.addTelaNegra(telanegra);
                break;
                case 2:
                    System.out.println("Tenemos "+TiendaRopa.getTelaRoja()+" metros de tela roja y "+TiendaRopa.getTelaNegra()+" metros de tela negra.");
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
