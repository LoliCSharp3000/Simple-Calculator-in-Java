package alboran;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Election = 0, Value1, Value2, Result;
        System.out.println("Que quieres hacer? 1.Sumar   2.Restar  3.multiplicar  4.dividir   5.Salir");
        
        for(;Election == 5;){
            Election = sc.nextInt();
            switch (Election) {
            case 1:
                System.out.println("Dime el primer valor");
                Value1 = sc.nextInt();
                System.out.println("Dime el segundo valor");
                Value2= sc.nextInt();
                Result = Value1 + Value2;
                System.err.println("Vuestro resultado es " + Result);
                break;
            case 2:
                System.out.println("Dime el primer valor");
                Value1 = sc.nextInt();
                System.out.println("Dime el segundo valor");
                Value2= sc.nextInt();
                Result = Value1 - Value2;
                System.err.println("Vuestro resultado es " + Result);
                break;
            case 3:
                System.out.println("Dime el primer valor");
                Value1 = sc.nextInt();
                System.out.println("Dime el segundo valor");
                Value2= sc.nextInt();
                Result = Value1 * Value2;
                System.err.println("Vuestro resultado es " + Result);
                break;
            case 4:
                System.out.println("Dime el primer valor");
                Value1 = sc.nextInt();
                System.out.println("Dime el segundo valor");
                Value2= sc.nextInt();
                Result = Value1 / Value2;
                System.err.println("Vuestro resultado es " + Result);
                break;
            default:
                System.err.println("No se a elegido correctamente");
                throw new AssertionError();
        }
        }
        
    }
}