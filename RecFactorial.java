public class RecFactorial {

    public static int factorial(int n){

        if(n == 0){
            return 1;
        }

        return n * factorial(n-1);

    }

    public static void main(String[] args){

        int factOfThree = factorial(3);

        System.out.println("The factorial of 3 is " + factOfThree);
    }

}
