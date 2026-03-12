public class Main {
    public static double lanzarUnaExcepcion( int numero1, int numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception("No se puede dividir por 0");
        }
        return Integer.valueOf(numero1).doubleValue() / Integer.valueOf(numero2).doubleValue();
        /*
              Integer.valueOf(numero1), lo que hace es convertir un int en un objeto de tipo Integer
              y doubleValue() ese objeto Integer se convierte en double.
        */
        // Es importante respetar el orden de los bloques catch
        // Se van poniendo desde mas especificos hasta mas general
    }
    public static void multiplesCatch() {
        /*
            try {
                ...
            } catch (TipoDeExcepcion e1) {
                // Manejo de la primera excepcion
            } catch (TipoDeExcepcion e2) {
                // Manejo de la segunda excepcion
            }  catch (Exception e) {
                // Manejo general de cualquier otra excepcion
                // Que no haya sido capturada por los bloques anteriores
            }
        */

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // fuera de los limites
            // ESTO CAUSARA: ArrayIndicxOutOfBoundsExcepcion
            int resultado = 10 / 0; // ESTO CASUSARA: ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fura de los limites del array");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puedde dividir por 0");
        } catch (Exception e) {
            System.out.println("Error general: "+ e.getMessage());
        }
    }
    public static void pruebaFinally() {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
            // Accediendo a una posicion fuera del limite del arreglo
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de los limites del array");
        } finally {
            System.out.println("Este codigo se ejecuta siempre");
        }
    }
    public static void pruebaTryCatch() {
        try {
            int a = 10;
            int b = 0;
            int resultado = a / b; // Esto causara una excepcion
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por 0");
        }
    }
    public static void metodosString() {
        // En JAVA los strings son instancias de una clase, por lo tanto
        // tienen diversos metodos muy utiles:
        String hola = "Como estas?";
        System.out.println("Largo del texto: " + hola.length());
        // Busquemos que letra esta en la posicion 0
        System.out.println("En la posicion 0 se encuentra la letra: " + hola.charAt(0));

    }
    public static void main(String[] args){
        pruebaFinally();
    }
}
