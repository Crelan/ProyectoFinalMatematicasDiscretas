import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class MaquinaEstadoFinito1 {
   
    public static void main(String[] args){
         boolean salir = false;
        boolean salida = false;
        int eleccion = 0;
        String estado = "Apagado";
       
        Scanner sn = new Scanner(System.in);
    
        while (!salir){
            System.out.println("Elija una opción\n");
            System.out.println("1.Apagar luz");
            System.out.println("2.Enceder luz");
            System.out.println("3.Salir"); 
            
            eleccion = sn.nextInt();
            switch(eleccion){
                case 1:
                    if(!salida){
                        System.out.println(estado);
                            }
                    else{
                        estado = "Apagado";
                        salida = false;
                        System.out.println(estado);
                    }
                    break;
                case 2:
                    if(!salida){
                        estado = "Encendido";
                        salida = true;
                        System.out.println(estado);
                    }
                    else{
                        System.out.println(estado);
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                
            }
        }
    }
    
}
