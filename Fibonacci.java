public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(9));
        System.out.println(FibonacciRec(9));
    }   

    public static Integer Fibonacci(int N){
        if(N == 0){
            return 0;
        }

        int a = 0;
        int b = 1;
        int FibonacciNumberAtIteration = 0;
        for (int i = 0; i < N - 1  ; i++) {
            FibonacciNumberAtIteration = a + b;
            a = b;
            b = FibonacciNumberAtIteration;
        }

        return FibonacciNumberAtIteration;
    }

    public static Integer FibonacciRec(int N){

        if (N <= 1){
            return N;
        }
        return FibonacciRec(N - 1) + FibonacciRec(N - 2);
    }
}
