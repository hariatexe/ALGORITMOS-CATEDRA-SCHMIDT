import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void usandoRandom() {
        // Permite generar un codigo aleatorio
        Random random = new Random(System.nanoTime());
        // System.nanoTime() devuelve el tiempo actual del sistema
        // en nanosegundos (una medida de tiempo extremadamente chica)
        // En el codigo se usa para inicializar la semilla del generador aleatorio (Random)
        // Obtener un numero aleatorio entre 0 y X (X=100)
        int numeroAleatorio = random.nextInt(100);
        System.out.println("El numero es: " + numeroAleatorio);
    }
    public static void usandoWhile() {
        int i = 0;
        System.out.print("Introduce un valor entero como tope: ");
        Scanner sc = new Scanner(System.in);
        int tope = sc.nextInt();
        while (i < tope){
            System.out.println("El valor de i es: " +i);
            i++;
        }

    }
    public static void probandoSwitch() {
        System.out.println("Introduce un valor entero que represente un bool: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 0:
                System.out.println("Es false");
                break;
            case 1:
                System.out.println("Es true");
                break;
            default:
                System.out.println("El valor introducido no puede representar un bool");
        }
        sc.close();
    }
    public static void scanner() {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introducir un valor entero al scanner: ");
       int atributo1 = teclado.nextInt();
       System.out.println("El valor entero introducido fue: " + atributo1);

        // Este nextLine es necesario solo despues de
        // nextInt(), nextDouble(), nextFloat()
       teclado.nextLine(); // limpiar salto de linea pendiente
        // Cuando se escribe un numero en consola, por ejemplo: 25
        // En realidad el teclado envia 25\n \n => salto de linea
        // Cuando se usa int atributo1 = teclado.nextInt();
        // Java solo lee el 25, pero NO consume el enter
        // Entonces en memoria queda el \n
        // nextLine() lee hasta el siguiente salto de línea.
        //
        //Pero como ya había uno pendiente, lo lee inmediatamente.
        //
        //Entonces parece que se salta la pregunta.

        System.out.println("Introducir un texto: ");
        String texto = teclado.nextLine();
        System.out.println("Texto ingresado: " + texto);

        System.out.println("Introducir un numero: ");
        int numero = teclado.nextInt();
        System.out.println("El numero introducido es: " + numero);

        // cerramos el scanner
        teclado.close();
    }
    public static int suma() {
        int a = 10;
        int b = 20;
        return a + b;
    }

    public static void sentenciaDoWhile() {
        int i = 0;
        do {
            System.out.println("El valor de i es: " + i++);
            // imprime hasta el 9
            // Si el ++ estuviera del lado izquierda imprime hasta el 10
        } while ( i < 10 );
    }
    public static void sentenciasDeControl() {
        int numero = 10;
        if (numero == 10){
            System.out.println("Es 10");
        }
        // Como operador ternario:
        System.out.println((numero == 10)? "Es igual a 10" : "No es igual a 10");

        // Forma if-else
        if (numero > 0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        // Ejemplo 1
        double pi = 3;
        int variableBasura;

        if (pi < 4){
            variableBasura = 0;
            System.out.println("El resultado de la variableBasura es: " + variableBasura);
        }
        // Ejemplo 2
        int numero2 = 3;
        if (numero2 != 3){
            System.out.println("No se va a ejecutar este codigo");
        }

    }
    public static void main(String[] args){
        // Ejemplo comentario 1
        /* Ejemplo comentario 2
           Java tiene muchisimo codigo interno y clases
           (librerias de Java) -> import java.x.x
           java -> paquete, x.x -> clase
           En Java diferenciamos 2 tipos de datos:
           Tipos Primitivos y Tipos Objeto
        */

        // FORMA BASICA DE DECLARAR UNA VARIABLE
        // Tipodedato nombre;
        // FORMA DE DECLARAR VARIAS VARIABLES
        // Tipodedato nombre1, nombre2, nombre3;
        // FORMA DE DECLARAR E INICIALIZAR
        // Tipodedato Dato1 = valor;
        // Tipodedato Dato2 = valor2, Dato3 = valor3;

        usandoRandom();
    }
}
