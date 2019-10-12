public class Main {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int n = 10;
        f._initialize();
        System.out.println("The fibonacci number of " + n + " is " + f.fib(n));

    }
}
