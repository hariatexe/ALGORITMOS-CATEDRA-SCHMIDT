public class Main {
    // Definimos un ENUM
    public enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    public static void comparacionDeEnum() {
        // Podemos comparar valores de Enum utilizando el operador ==
        // porque los enum en Java son singletons, es decir, una instancia
        // unica por valor.
        /*
            Un Singleton es un patron de diseno en programacion
            que significa:
            Una clase que solo puede tener una unica instancia (un solo
            objeto) en todo el programa.
            Es decir, que solo existe un objeto de esa clase y todos lo usan.

            Por ejemplo:
            Persona p1 = new Persona();
            Persona p2 = new Persona();
            Persona p3 = new Persona();

            Aqui hay 3 objetos distintos.
            Con un Singleton, solo puede existir uno.
            Se usa cuando solo debe existir una instancia de algo, por ejemplo:
            - configuracion del programa
            - conexion a una base de datos
            - gestor de logs
            - cache global, etc.
        */
        Dia dia = Dia.LUNES;
        if (dia == Dia.LUNES) {
            System.out.println("Hoy es lunes");
        }
    }
    public static void usoDeEnum() {
        // Podemos usar un enum de la siguiente manera:
        Dia dia = Dia.VIERNES;
        // Uso en un switch
        switch(dia) {
            case LUNES:
                System.out.println("Lunes, comienzo de la semana");
                break;
            case VIERNES:
                System.out.println("Viernes, ya casi es fin de semana");
                break;
            case SABADO:
                System.out.println("Finde");
                break;
            case DOMINGO:
                System.out.println("Finde");
                break;
            default:
                System.out.println("Es un dia entre semana");
                break;
        }
    }
    public static void main(String[] args) {
        /* Los enums en java son un tipo especial de clase que representa
           un grupo fijo de constantes. Se utilizan para representar un
           conjunto finito de opciones.
         */
        comparacionDeEnum();
    }

}
