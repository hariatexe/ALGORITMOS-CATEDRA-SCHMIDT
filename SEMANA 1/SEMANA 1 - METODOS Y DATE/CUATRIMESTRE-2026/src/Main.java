import java.time.LocalDate; // obtengo la fecha local
import java.time.LocalDateTime; // obtengo la fecha y el tiempo local
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// LocalDate representa una fecha (solo año, mes y dia) sin hora.
// LocalDateTime combina una fecha y una hora.
// LocalTime obtiene el horario solo en horas, minutos, segundos y nanosegundos
// HH:mm:ss.nnnnnnnnn

public class Main {
    // Metodo que convierte de Date a String
    public static void convertir() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH-mm-ss");
        System.out.println("La hora actual es: " + fechaHoraActual.format(formatoHora));
        // solo dejamos formateado como hora-minutos y segundos, que ocupan exactamente
        // dos lugares por unidad de tiempo
        // Lo que paso aqui es que primero se creo el patron a formatear, y luego
        // se formatea la hora en particular para transformarla en texto, siguiendo
        // el patron

    }


    // Metodo que suma dos numeros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Metodo que imprime un saludo
    public static void saludar() {
        System.out.println("Hola, bienvenido a la calculadora!");
    }

    public static void main(String[] args) {
        // Ejemplo basico de metodos en Java
        // Por ahora, durante estas 2 semanas, utilizaremos
        // esta forma de llamar a los metodos, hasta ver TDA

        // Llama al metodo saludar
        saludar();
        // Llama al metodo sumar
        int resultado = sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);


        // Probamos las fechas
        // fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual: " + fechaActual);

        // fecha y hora actuales
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        // horario actual -> los nanosegundos estan despues del punto
        LocalTime horarioActual = LocalTime.now();
        System.out.println("Horario actual: " + horarioActual);

        // Crear una fecha especifica
        LocalDate fechaEspecifica = LocalDate.of(2021,1,1);
        System.out.println("Fecha especifica: " + fechaEspecifica);
        System.out.println("===========================================");
        convertir();
    }
}
