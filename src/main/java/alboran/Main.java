package alboran;

import java.util.Scanner;


public class Main {

    public static double[] TellVariables(Scanner sc){
        double[] valor = new double[2];
        try {
            System.out.println("Dime el 1 valor:");
            valor[0] = sc.nextDouble();  
            System.out.println("Dime el 2 valor:");
            valor[1] = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Pon numero");
            sc.nextLine();
            return TellVariables(sc);
        }
        
        return valor;      
    }

    public static double sumar(double a, double  b){
        return a + b;
    }

    public static double restar(double a, double  b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        if(b !=0){
            return a / b;
        } 
        else{
            System.out.println("No podeis dividir entre 0");
            return 0;
        }
    }

    public static void operacion(int Election, Scanner sc){
        double Result;
        double[] valor;
        
        switch (Election) {
            case 1:
                valor = TellVariables(sc);
                Result = sumar(valor[0], valor[1]);
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 2:
                valor = TellVariables(sc);
                Result = restar(valor[0], valor[1]);
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 3:
                valor = TellVariables(sc);
                Result = multiplicar(valor[0], valor[1]);
                System.out.println("Vuestro resultado es " + Result);
                break;
            case 4:
                valor = TellVariables(sc);
                
                Result = dividir(valor[0], valor[1]);
                System.out.println("Vuestro resultado es " + Result);
                
                break;
            case 5:
                System.out.println("Saliendo de la calculadora");
                break;
            default:
                System.out.println("No se a elegido correctamente");
                break;
            }
    }



    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);
        int Election = 0;
        
        
        
        while(Election != 5){
            System.out.println("Que quieres hacer? 1.Sumar   2.Restar  3.multiplicar  4.dividir   5.Salir");
            try{
                Election = sc.nextInt();
                operacion(Election, sc);
            }
            catch(Exception e){
                System.out.println("Error: Debes introducir un número válido.");
                sc.nextLine();
            }
            
        }
        sc.close();
    }
}