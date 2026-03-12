public class Main {
    public static void main(String[] args) {
        // int a String;
        int numero = 1234;
        String cadena1 = String.valueOf(numero);
        String cadena2 = Integer.toString(numero);
        String cadena3 = numero + "";

        System.out.println("int a String: ");
        System.out.println("String.valueOf: " + cadena1);
        System.out.println("Integer.toString: " + cadena2);
        System.out.println("Concatenacion: " + cadena3);

        // String a int
        String cadenaNumero = "jkejrk";
        try {
            int numero1 = Integer.parseInt(cadenaNumero);
            int numero2 = Integer.valueOf(cadenaNumero); // Desempaquetado automatico
            // Integer.valueOf devuelve Integer (objeto)
            // pero al escribir, como lo escribimos
            // java hace unboxing automatico
            // Integer -> int
            System.out.println("\nString a int: ");
            System.out.println("Integer.parseInt: " + numero1);
            System.out.println("Integer.valueOf: " + numero2);
        } catch(NumberFormatException e) {
            System.out.println("No se pudo convertir la cadena a tipo int");
        }


    }
}
