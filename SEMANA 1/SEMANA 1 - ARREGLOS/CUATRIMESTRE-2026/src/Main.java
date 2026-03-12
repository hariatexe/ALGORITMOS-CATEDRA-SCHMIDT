public class Main {
    public static void recorridosDeMatriz(){
        int[][] matriz = new int[10][10];
        for (int i=0; i < 10; i++){
            for (int j=0; j < 10; j++){
                matriz[i][j] = i;
            }
            // por columna rellena con el valor de la posicion de la fila
            // toda la columna se llena del valor de posicion de la fila
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Muestro toda la matriz
                System.out.print(matriz[i][j] + " ");
                // imprime filas con todas sus columnas (j)
            }
            // de ahi pega un salto
            System.out.println();
        }
    }
    public static void matrices() {
        // Es un array de arrays
        // ejemplo
        // tipo[][]nombreMatriz = new tipo[tam_X][tam_Y];

        // declaracion
        int[][] matriz;
        // inicializacion
        matriz = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        /*
            int[][] matriz = {
                ...
            }
        */
        // metodos
        // En java las matrices son instancias de una clase, por lo tanto
        // tienen diversos metodos:
        System.out.println("Largo de la matriz: "+matriz.length);
        // En este caso tiene 3 arreglos
        // Ahora me va a mostrar cuantos elementos tiene el primer arreglo
        System.out.println("Largo del primer arreglo de la matriz: "+matriz[0].length);
    }
    public static void declaracionArreglo2() {
        int[] vector; // sin inicializar
        vector = new int[50]; // guardo espacio para 50 enteros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 0;
            // inicializo todo el vector con valor 0 en todas las posiciones
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i; // asigno como valor a cada posicion su posicion
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion: "+ i + " es: " + vector[i]);
        }
    }
    public static void arreglo(){
        // tipo[] vector = {...valores};
        int[] vector = {1,1,32};
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor en la posicion " + i + " es: " + vector[i]);
        }
    }
    public static void main(String[] args){
        recorridosDeMatriz();
    }
}
