
import java.util.Scanner;
public class MaquinaEstadoFinito2 {
    public static void main(String[] arg){
        String entrada;
        int estado = 0;
        boolean salida = false;
        int i = 0;
        
         Scanner sn = new Scanner(System.in);
         System.out.println("Ingresa una cadea compuesta solo de a,b,c");
         
        entrada = sn.next();
      
        while(!salida){
            switch(estado){
                case 0:
                    if(estado==0){
                    if(entrada.charAt(i)=='a'){
                        estado = 1;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 1");
                            salida = true;
                        }
                    }
                    }
                    if(estado == 0){
                    if(entrada.charAt(i)=='b'){
                        estado = 0;
                        i = i + 1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 0");
                            salida = true;
                        }
                    }
                    }
                    if(estado == 0){
                    if(entrada.charAt(i)=='c'){
                        estado = 2;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 2");
                            salida = true;
                        }
                    }
                    }
                    break;
                case 1:
                    if (estado==1){
                    if(entrada.charAt(i)=='a'){
                        estado = 1;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 1");
                            salida = true;
                        }
                    }
                    }
                    if(estado == 1){
                    if(entrada.charAt(i)=='b'){
                        estado = 2;
                        i = i + 1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 2");
                            salida = true;
                        }
                    }
                    }
                    if(estado == 1){
                    if(entrada.charAt(i)=='c'){
                        estado = 1;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 1");
                            salida = true;
                        }
                    }
                    }
                break;
                case 2:
                    if(estado==2){
                    if(entrada.charAt(i)=='a'){
                        estado = 3;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena valida");
                            System.out.println("Estado 3");
                            salida = true;
                        }
                    }
                    }
                    if(estado ==2){
                    if(entrada.charAt(i)=='b'){
                        estado = 0;
                        i = i + 1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 0");
                            salida = true;
                        }
                    }
                    }
                    if(estado==2){
                    if(entrada.charAt(i)=='c'){
                        estado = 2;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 2");
                            salida = true;
                        }
                    }
                    }
                break;
                case 3:
                    if(estado==3){
                    if(entrada.charAt(i)=='a'){
                        estado = 0;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 0");
                            salida = true;
                        }
                    }
                    }
                    if(estado==3){
                    if(entrada.charAt(i)=='b'){
                        estado = 2;
                        i = i + 1;
                        if(i==entrada.length()){
                            System.out.println("Cadena invalida");
                            System.out.println("Estado 2");
                            salida = true;
                        }
                    }
                    }
                    if(estado==3){
                    if(entrada.charAt(i)=='c'){
                        estado = 3;
                        i = i +1;
                        if(i==entrada.length()){
                            System.out.println("Cadena valida");
                            System.out.println("Estado 3");
                            salida = true;
                        }
                    }
                    }
                    break;
                }
            }
        
         }
    }