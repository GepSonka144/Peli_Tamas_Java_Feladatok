public class Factorial {
    public static void main(String[] args) {
        int faktorialis = Factorial(6);
        System.out.println(faktorialis);
    }

    public static Integer Factorial(int N){
        if(N <= 0) return 0;
        if(N == 1) return 1;
        else return N * Factorial(N-1);
    }
}
