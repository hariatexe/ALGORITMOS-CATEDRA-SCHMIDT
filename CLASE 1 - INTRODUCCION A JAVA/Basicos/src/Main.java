import java.util.Scanner;
public class Main {
    public static void ProbandoCondicionales(){
        int a = 10;
        int b = 20;
        if (a==10){
            System.out.println("A es igual a 10");
        }
        // Como operador ternario
        System.out.println("Probando el operador ternario: ");
        System.out.println(a==b? "A es igual a B" : "A no es igual a B");
        if (a == 10){
            System.out.println("A es igual a 10");
        } else if (a > 0) {
            System.out.println("A es positivo");
        } else {
            System.out.println("A es negativo");
        }

    }
    public static void ProbandoSwitch() {
        System.out.println("Ingrese el valor para la variable A: ");
        Scanner sc_1 = new Scanner(System.in);
        int a = sc_1.nextInt();
        System.out.println("Ingrese el valor para la variable B: ");
        Scanner sc_2 = new Scanner(System.in);
        int b = sc_2.nextInt();

        switch (a+b) {
            case 20:
                System.out.println("Correcto el valor de la suma es 20");
                break;
            case 21:
                System.out.println("Correcto el valor de la suma es 21");
                break;
            default:
                System.out.println("Error, no es el valor deseado");
        }
        sc_1.close();
        sc_2.close();
    }
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
    public static void ProbandoWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println("El valor de i es: " + i++);
            if (i > 5) {
                continue;
                // El ultimo numero que se imprime es el 5
            }
            if (i > 8) {
                break;
            }
        }
        /* En este caso el break nunca se ejecuta debido a que
        * directamente para los mayores de 5 se corta con el continue
        * y no se ejecuta abajo nada
        * culo abierto
        */


    }
    public static void main(String[] args) {
        ProbandoWhile();
    }
}