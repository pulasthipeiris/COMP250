public class fibonacci {

    public static int regFib(int n){ //normal way of calculating
        if(n==0 || n==1){
            return 1;
        }

        int fib0, fib1, fib2;
        fib0 = 1; fib1 = 1; fib2 = 0;

        for(int i = 2; i<=n; i++){
            fib2 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib2;
        }

        return fib2;

    }

    public static int recFib(int n){ //using recursion

        if(n==0 || n==1){
            return 1;
        }

        return recFib(n-1) + recFib(n-2);

    }

    public static void main(String[] args){

        System.out.println(regFib(3)); //using for loop
        System.out.println(recFib(3)); //using recursion

    }
}
