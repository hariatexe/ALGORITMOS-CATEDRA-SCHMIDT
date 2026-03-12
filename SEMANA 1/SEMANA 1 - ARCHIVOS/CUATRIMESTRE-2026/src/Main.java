import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    // leer un archivo de texto
    /*
        Para leer un archivo de texto .txt linea por linea en Java, podemos usar
        la clase BufferedReader, que proporciona un metodo conveniente para leer
        texto de un archivo.
    */
    public static void leerArchivo() {
        String rutaArchivo = "hola.txt";
        System.out.println(System.getProperty("user.dir"));
        // El codigo de arriba, muestra la carpeta exacta desde la que se
        // ejecuta el programa
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            // Esto es un try-with-resources, una característica que existe en Java desde Java 7.
            // FileReader -> se usa para leer el archivo especificado
            // BufferedReader -> envuelve al FileReader y proporciona el metodo readLine() para leer el archivo linea por linea
            // try-with-resources -> se usa para asegurar que el archivo se cierre automaticamente despues de completada la lectura
            // readLine() -> Este metodo devuelve null cuando llega al final del archivo, lo que indica que se debe salir del bucle.
            //
            String linea;
            while ((linea = br.readLine()) != null) {
                // Procesa cada linea leida
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Escribir un archivo de texto
    // Usamos la clase BufferedWriter
    public static void escribirArchivo() {
        /*
            Explicacion del codigo:
            FileWriter -> Se utiliza para abrir el archivo en modo de escritura.
            Si el archivo no existe, crea uno nuevo. Si ya existe, se sobreescribira
            a menos que usemos el constructor con el parametro true (es decir,
            new FileWriter(rutaArchivo, true)) para agregar contenido en lugar
            de sobreescribir.

            BufferedWriter -> Envuelve al FileWriter y proporciona el metodo write()
            para escribir texto en el archivo.

            newLine() -> Este metodo inserta un salto de linea en el archivo, lo que
            equivale a \n.

            try-with-resources -> Asegura que el BufferedWriter se cierre automaticamente
            despues de que se complete la escritura, liberando recursos y asegurando
            que todos los datos se escriban correctamente en el archivo.
        */
        String rutaArchivo = "hola.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            //Esto es un try-with-resources, una característica que existe en Java desde Java 7.
            // Escribo lineas en el archivo
            bw.write("Primera linea");
            bw.newLine(); // salto de linea
            bw.write("Segunda linea");
            bw.newLine();
            bw.write("Tercera linea");
        } catch (IOException e) {
            e.printStackTrace();
            /*
                printStackTrace() es un metodo de la clase Throwable (de donde
                se heredan las excepciones en Java) que imprime en la consola
                toda la informacion del error que ocurrio.
                Esta parte del codigo indica que, si ocurre una excepcion IOException,
                Java imprime el stack trace del error.
                Que es el stack trace?
                El stack trace es la lista de metodos que se estaban ejecutando
                cuando ocurrio el error, desde el mas reciente hacia atras.
                Es basicamente el camino que siguio el programa hasta fallar.
            */
        }
    }
    public static void main(String[] args) {
        escribirArchivo();
    }
}
