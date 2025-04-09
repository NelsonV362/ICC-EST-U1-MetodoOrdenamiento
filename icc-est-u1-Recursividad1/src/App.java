public class App {

    public static void main(String[] args) {
        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        
        int numeroFibonacci = 5; 
        int resultadoFibonacci = ejercicios.fibonacci(numeroFibonacci);
        System.out.println("El " + numeroFibonacci + "º número de Fibonacci es: " + resultadoFibonacci);
        
        int numeroSuma = 5; 
        int resultadoSuma = ejercicios.sumaConsecutivos(numeroSuma);
        System.out.println("La suma de los números consecutivos hasta " + numeroSuma + " es: " + resultadoSuma);
    }
}
