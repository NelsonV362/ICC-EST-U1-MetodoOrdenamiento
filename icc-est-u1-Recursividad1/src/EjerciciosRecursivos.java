public class EjerciciosRecursivos {

     public int fibonacci(int n){
        if(n<=1){
            return n;
        
        }

        return fibonacci(n-1)+ fibonacci(n-2);
     }
    //Metodo que devuelve la suma de los numeros que contiene n, n=5, 5+4+3+2+1=15, n numero a ser sumado, retorna cada suma. para n=5
     public int sumaConsecutivos(int n){ 
        if(n==1) return n;
        return n + sumaConsecutivos(n-1);
    }
}