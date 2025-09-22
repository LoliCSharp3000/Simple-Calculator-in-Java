package alboran;

import java.util.Scanner;


public class Main {

    public static double[] TellVariables(Scanner sc){
        double[] valor = new double[2];
        System.out.println("Dime el 1 valor:");
        valor[0] = sc.nextDouble();  
        System.out.println("Dime el 2 valor:");
        valor[1] = sc.nextDouble();
        return valor;      
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        int Election = 0;
        double Result;
        double[] valor;
        System.out.println("Que quieres hacer? 1.Sumar   2.Restar  3.multiplicar  4.dividir   5.Salir");
        
        while(Election != 5){
            Election = sc.nextInt();
            switch (Election) {
            case 1:
                valor = TellVariables(sc);
                Result = valor[0] + valor[1];
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 2:
                valor = TellVariables(sc);
                Result = valor[0] - valor[1];
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 3:
                valor = TellVariables(sc);
                Result = valor[0] * valor[1];
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 4:
                valor = TellVariables(sc);
                if(valor[1] != 0){
                    Result = valor[0] / valor[1];
                    System.out.println("Vuestro resultado es " + Result);
                }else{
                    System.out.println("No podeis dividir entre 0");
                }
                
                break;
            case 5:
                System.out.println("Saliendo de la calculadora");
                break;
            default:
                System.out.println("No se a elegido correctamente");
                break;
            }
        }
        sc.close();
    }
}