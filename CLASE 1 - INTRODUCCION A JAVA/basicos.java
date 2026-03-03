// Break y Continue

i = 0;
while ( i < 10 ) {
    System.out.println("El valor de i es: " + i++);
    if ( i > 5 ) {
        continue;
    }
    if ( i > 8 ) {
        break; 
        // Recien corta cuando i es mayor a 8
    }
}