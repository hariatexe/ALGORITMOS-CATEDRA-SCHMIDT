import java.util.Scanner;
public class Main {

    public static void ProbandoFor() {
        int numero = 30;
        for ( int i = 10; i < numero; i++ ) {
            System.out.println("El valor de i es: " + i);
        }
    }
    public static void ProbandoBucles() {
        System.out.println("Ingrese un valor como tope para el bucle: ");
        Scanner scBucle = new Scanner(System.in);
        int tope = scBucle.nextInt();
        int i = 0;
        while (i < tope) {
            i++;
            System.out.println("Valor del bucle: "+ i);
        }
    }
    public static void ProbandoSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int numero = sc.nextInt();
        switch(numero){
            case 0:
                System.out.println("El valor de numero es 0");
                break;
            case 2:
                System.out.println("El valor de numero es 2");
                break;
            default:
                System.out.println("Ese valor no se encontro en la db");
        }
        sc.close();
    }
    public static void main(String[] args) {
        ProbandoSwitch();

    }
}