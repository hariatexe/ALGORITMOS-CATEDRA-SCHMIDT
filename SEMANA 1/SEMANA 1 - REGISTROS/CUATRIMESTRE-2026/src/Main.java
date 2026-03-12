class Persona {
    String nombre;
    int edad;
    float altura;
}
public class Main {
    // Registros, podemos lograr un comportamiento similar con clases
    // Uso incorrecto, aceptado hasta ver TDA
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.nombre = "Lautaro";
        persona.edad = 19;
        persona.altura = 1.80f;
        // la f final indica que el numero es float
        // En Java si se escribe un decimal por defecto es Double no float

        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Altura: " + persona.altura);
    }
}
